package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A slideshow for photos and video.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVJSSlideShow extends StObject {
  
  /**
    * Called when the user exists the slideshow. Last photo ID was the ID of the last photo displayed.
    */
  var onExit: js.UndefOr[js.Function1[/* lastPhotoId */ js.UndefOr[String], Unit]] = js.undefined
  
  /**
    * Start the slideshow.
    * @param initialSelection The initial index to use.
    * @param photos The photos to display.
    */
  def run(initialSelection: Double, photos: js.Array[MediaBrowserPhoto | MediaBrowserVideo]): Unit
  
  /**
    * Show the settings for the slideshow.
    * @param photos The photos that would be displayed.
    */
  def showSettings(photos: js.Array[MediaBrowserPhoto | MediaBrowserVideo]): Unit
}
object ATVJSSlideShow {
  
  inline def apply(
    run: (Double, js.Array[MediaBrowserPhoto | MediaBrowserVideo]) => Unit,
    showSettings: js.Array[MediaBrowserPhoto | MediaBrowserVideo] => Unit
  ): ATVJSSlideShow = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction2(run), showSettings = js.Any.fromFunction1(showSettings))
    __obj.asInstanceOf[ATVJSSlideShow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVJSSlideShow] (val x: Self) extends AnyVal {
    
    inline def setOnExit(value: /* lastPhotoId */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setRun(value: (Double, js.Array[MediaBrowserPhoto | MediaBrowserVideo]) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
    
    inline def setShowSettings(value: js.Array[MediaBrowserPhoto | MediaBrowserVideo] => Unit): Self = StObject.set(x, "showSettings", js.Any.fromFunction1(value))
  }
}

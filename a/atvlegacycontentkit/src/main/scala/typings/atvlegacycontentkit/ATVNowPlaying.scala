package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atv.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Functions to do with the currently playing item.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVNowPlaying extends StObject {
  
  /**
    * Get the element containing the currently playing asset.
    * @param callback The callback containing the element as an argument.
    */
  def currentAsset(callback: js.Function1[/* element */ Element, Unit]): Unit
  
  /**
    * Return to the player view for the currently played item if it has been closed.
    */
  def showNowPlaying(): Unit
}
object ATVNowPlaying {
  
  inline def apply(currentAsset: js.Function1[/* element */ Element, Unit] => Unit, showNowPlaying: () => Unit): ATVNowPlaying = {
    val __obj = js.Dynamic.literal(currentAsset = js.Any.fromFunction1(currentAsset), showNowPlaying = js.Any.fromFunction0(showNowPlaying))
    __obj.asInstanceOf[ATVNowPlaying]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVNowPlaying] (val x: Self) extends AnyVal {
    
    inline def setCurrentAsset(value: js.Function1[/* element */ Element, Unit] => Unit): Self = StObject.set(x, "currentAsset", js.Any.fromFunction1(value))
    
    inline def setShowNowPlaying(value: () => Unit): Self = StObject.set(x, "showNowPlaying", js.Any.fromFunction0(value))
  }
}

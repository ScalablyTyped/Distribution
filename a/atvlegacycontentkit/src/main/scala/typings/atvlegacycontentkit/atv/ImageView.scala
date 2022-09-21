package typings.atvlegacycontentkit.atv

import typings.atvlegacycontentkit.ATVAnimation
import typings.atvlegacycontentkit.ATVColor
import typings.atvlegacycontentkit.ATVFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image that can be displayed in either scriptViews or as an overlay.
  */
trait ImageView
  extends StObject
     with View {
  
  /**
    * Loads an image into the ImageView.
    * @param url The URL the image is hosted at.
    */
  def loadImageAtURL(url: String): Unit
}
object ImageView {
  
  inline def apply(
    addAnimation: (ATVAnimation, String) => Unit,
    backgroundColor: ATVColor,
    frame: ATVFrame,
    loadImageAtURL: String => Unit,
    removeAllAnimations: () => Unit,
    removeAnimation: String => Unit,
    subviews: js.Array[View]
  ): ImageView = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction2(addAnimation), backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], loadImageAtURL = js.Any.fromFunction1(loadImageAtURL), removeAllAnimations = js.Any.fromFunction0(removeAllAnimations), removeAnimation = js.Any.fromFunction1(removeAnimation), subviews = subviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView]
  }
  
  extension [Self <: ImageView](x: Self) {
    
    inline def setLoadImageAtURL(value: String => Unit): Self = StObject.set(x, "loadImageAtURL", js.Any.fromFunction1(value))
  }
}

package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionImageInsertionOffset extends StObject {
  
  /**
    * Set the distance, in pixels, between the overlay and the left edge of the video frame.
    */
  var ImageX: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Set the distance, in pixels, between the overlay and the top edge of the video frame.
    */
  var ImageY: js.UndefOr[integerMin0Max2147483647] = js.undefined
}
object MotionImageInsertionOffset {
  
  inline def apply(): MotionImageInsertionOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInsertionOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionImageInsertionOffset] (val x: Self) extends AnyVal {
    
    inline def setImageX(value: integerMin0Max2147483647): Self = StObject.set(x, "ImageX", value.asInstanceOf[js.Any])
    
    inline def setImageXUndefined: Self = StObject.set(x, "ImageX", js.undefined)
    
    inline def setImageY(value: integerMin0Max2147483647): Self = StObject.set(x, "ImageY", value.asInstanceOf[js.Any])
    
    inline def setImageYUndefined: Self = StObject.set(x, "ImageY", js.undefined)
  }
}

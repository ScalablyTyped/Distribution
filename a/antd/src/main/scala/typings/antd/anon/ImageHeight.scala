package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHeight extends StObject {
  
  var imageHeight: Double
  
  var imageWidth: Double
}
object ImageHeight {
  
  inline def apply(imageHeight: Double, imageWidth: Double): ImageHeight = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageHeight] (val x: Self) extends AnyVal {
    
    inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
  }
}

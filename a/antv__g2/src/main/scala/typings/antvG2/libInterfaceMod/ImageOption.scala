package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageOption
  extends StObject
     with RegionPositionBaseOption {
  
  /**
    * @title 图片路径
    */
  val src: String
}
object ImageOption {
  
  inline def apply(end: AnnotationPosition, src: String, start: AnnotationPosition): ImageOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOption]
  }
  
  extension [Self <: ImageOption](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}

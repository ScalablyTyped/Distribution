package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionFilterOption
  extends StObject
     with RegionPositionBaseOption {
  
  /**
    * @title 适用场景
    * @description 可选,设定regionFilter只对特定geom类型起作用，如apply:['area']
    */
  @JSName("apply")
  val apply: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @title 染色色值
    */
  val color: String
}
object RegionFilterOption {
  
  inline def apply(color: String, end: AnnotationPosition, start: AnnotationPosition): RegionFilterOption = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionFilterOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionFilterOption] (val x: Self) extends AnyVal {
    
    inline def setApply(value: js.Array[String]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setApplyVarargs(value: String*): Self = StObject.set(x, "apply", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}

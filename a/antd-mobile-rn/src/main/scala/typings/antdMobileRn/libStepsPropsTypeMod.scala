package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsPropsTypeMod {
  
  trait StepsPropsType extends StObject {
    
    var children: js.Array[Any]
    
    var current: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StepsPropsType {
    
    inline def apply(children: js.Array[Any]): StepsPropsType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepsPropsType] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsPropsTypeMod {
  
  trait StepsPropsType extends StObject {
    
    var children: js.Array[js.Any]
    
    var current: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StepsPropsType {
    
    @scala.inline
    def apply(children: js.Array[js.Any]): StepsPropsType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsPropsType]
    }
    
    @scala.inline
    implicit class StepsPropsTypeMutableBuilder[Self <: StepsPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

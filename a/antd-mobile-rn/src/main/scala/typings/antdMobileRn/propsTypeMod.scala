package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  @js.native
  trait AccordionPropsTypes extends StObject {
    
    var activeKey: js.UndefOr[String | js.Array[String]] = js.native
    
    var defaultActiveKey: js.UndefOr[String | js.Array[String]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.native
  }
  object AccordionPropsTypes {
    
    @scala.inline
    def apply(): AccordionPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPropsTypes]
    }
    
    @scala.inline
    implicit class AccordionPropsTypesMutableBuilder[Self <: AccordionPropsTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: String | js.Array[String]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setActiveKeyVarargs(value: String*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
      
      @scala.inline
      def setDefaultActiveKey(value: String | js.Array[String]): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setDefaultActiveKeyVarargs(value: String*): Self = StObject.set(x, "defaultActiveKey", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* x */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}

package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsTypeMod {
  
  trait AccordionPropsTypes extends StObject {
    
    var activeKey: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var defaultActiveKey: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* x */ Any, Unit]] = js.undefined
  }
  object AccordionPropsTypes {
    
    inline def apply(): AccordionPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPropsTypes]
    }
    
    extension [Self <: AccordionPropsTypes](x: Self) {
      
      inline def setActiveKey(value: String | js.Array[String]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setActiveKeyVarargs(value: String*): Self = StObject.set(x, "activeKey", js.Array(value*))
      
      inline def setDefaultActiveKey(value: String | js.Array[String]): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      inline def setDefaultActiveKeyVarargs(value: String*): Self = StObject.set(x, "defaultActiveKey", js.Array(value*))
      
      inline def setOnChange(value: /* x */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}

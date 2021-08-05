package typings.antd

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorListMod {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasErrorsHelpOnDomErrorVisibleChange: ErrorListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasErrorsHelpOnDomErrorVisibleChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ErrorListProps extends StObject {
    
    var errors: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /** @private Internal usage. Do not use in your production */
    var help: js.UndefOr[ReactNode] = js.undefined
    
    /** @private Internal usage. Do not use in your production */
    var onDomErrorVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  }
  object ErrorListProps {
    
    inline def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    extension [Self <: ErrorListProps](x: Self) {
      
      inline def setErrors(value: js.Array[ReactNode]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: ReactNode*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setOnDomErrorVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onDomErrorVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnDomErrorVisibleChangeUndefined: Self = StObject.set(x, "onDomErrorVisibleChange", js.undefined)
    }
  }
}

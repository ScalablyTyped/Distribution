package typings.antd

import typings.antd.libFormFormItemMod.ValidateStatus
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormErrorListMod {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ErrorListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ErrorListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var fieldId: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[ReactNode] = js.undefined
    
    var helpStatus: js.UndefOr[ValidateStatus] = js.undefined
    
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var warnings: js.UndefOr[js.Array[ReactNode]] = js.undefined
  }
  object ErrorListProps {
    
    inline def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorListProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setErrors(value: js.Array[ReactNode]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: ReactNode*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpStatus(value: ValidateStatus): Self = StObject.set(x, "helpStatus", value.asInstanceOf[js.Any])
      
      inline def setHelpStatusUndefined: Self = StObject.set(x, "helpStatus", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      inline def setWarnings(value: js.Array[ReactNode]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: ReactNode*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}

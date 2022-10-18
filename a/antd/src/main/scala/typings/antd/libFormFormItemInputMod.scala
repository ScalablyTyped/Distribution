package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libFormFormItemMod.ValidateStatus
import typings.antd.libGridColMod.ColProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormFormItemInputMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  val default: FC[FormItemInputProps & FormItemInputMiscProps] = js.native
  
  trait FormItemInputMiscProps extends StObject {
    
    var children: ReactNode
    
    var errors: js.Array[ReactNode]
    
    var marginBottom: js.UndefOr[Double | Null] = js.undefined
    
    var onErrorVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var prefixCls: String
    
    var warnings: js.Array[ReactNode]
  }
  object FormItemInputMiscProps {
    
    inline def apply(errors: js.Array[ReactNode], prefixCls: String, warnings: js.Array[ReactNode]): FormItemInputMiscProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemInputMiscProps]
    }
    
    extension [Self <: FormItemInputMiscProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrors(value: js.Array[ReactNode]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ReactNode*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setOnErrorVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onErrorVisibleChanged", js.Any.fromFunction1(value))
      
      inline def setOnErrorVisibleChangedUndefined: Self = StObject.set(x, "onErrorVisibleChanged", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[ReactNode]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: ReactNode*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait FormItemInputProps extends StObject {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var fieldId: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[ReactNode] = js.undefined
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
    
    var wrapperCol: js.UndefOr[ColProps] = js.undefined
  }
  object FormItemInputProps {
    
    inline def apply(): FormItemInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemInputProps]
    }
    
    extension [Self <: FormItemInputProps](x: Self) {
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      inline def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  type _To = FC[FormItemInputProps & FormItemInputMiscProps]
  
  /* This means you don't have to write `default`, but can instead just say `libFormFormItemInputMod.foo` */
  override def _to: FC[FormItemInputProps & FormItemInputMiscProps] = default
}

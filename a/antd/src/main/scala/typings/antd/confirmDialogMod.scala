package typings.antd

import typings.antd.modalModalMod.ModalFuncProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmDialogMod {
  
  @JSImport("antd/lib/modal/ConfirmDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ConfirmDialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ConfirmDialogProps
    extends StObject
       with ModalFuncProps {
    
    def close(args: Any*): Unit
    
    var iconPrefixCls: js.UndefOr[String] = js.undefined
    
    var rootPrefixCls: String
  }
  object ConfirmDialogProps {
    
    inline def apply(close: /* repeated */ Any => Unit, rootPrefixCls: String): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    extension [Self <: ConfirmDialogProps](x: Self) {
      
      inline def setClose(value: /* repeated */ Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
    }
  }
}

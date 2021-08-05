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
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def close(args: js.Any*): Unit
    
    var rootPrefixCls: js.UndefOr[String] = js.undefined
  }
  object ConfirmDialogProps {
    
    inline def apply(close: /* repeated */ js.Any => Unit): ConfirmDialogProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
      __obj.asInstanceOf[ConfirmDialogProps]
    }
    
    extension [Self <: ConfirmDialogProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setClose(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
    }
  }
}

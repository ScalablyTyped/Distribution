package typings.antd

import typings.antd.anon.Destroy
import typings.antd.anon.RootPrefixCls
import typings.antd.anon.Update
import typings.antd.modalModalMod.ModalFuncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  @JSImport("antd/lib/modal/confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ModalFuncProps): Update = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Update]
  
  inline def globalConfig(hasRootPrefixCls: RootPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalConfig")(hasRootPrefixCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withConfirm(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfirm")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withError(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withError")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withInfo(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withSuccess(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuccess")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withWarn(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withWarn")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  type ConfigUpdate = ModalFuncProps | (js.Function1[/* prevConfig */ ModalFuncProps, ModalFuncProps])
  
  type ModalFunc = js.Function1[/* props */ ModalFuncProps, Destroy]
  
  trait ModalStaticFunctions extends StObject {
    
    var confirm: ModalFunc
    
    var error: ModalFunc
    
    var info: ModalFunc
    
    var success: ModalFunc
    
    var warn: ModalFunc
    
    var warning: ModalFunc
  }
  object ModalStaticFunctions {
    
    inline def apply(
      confirm: /* props */ ModalFuncProps => Destroy,
      error: /* props */ ModalFuncProps => Destroy,
      info: /* props */ ModalFuncProps => Destroy,
      success: /* props */ ModalFuncProps => Destroy,
      warn: /* props */ ModalFuncProps => Destroy,
      warning: /* props */ ModalFuncProps => Destroy
    ): ModalStaticFunctions = {
      val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning))
      __obj.asInstanceOf[ModalStaticFunctions]
    }
    
    extension [Self <: ModalStaticFunctions](x: Self) {
      
      inline def setConfirm(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setError(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setSuccess(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarning(value: /* props */ ModalFuncProps => Destroy): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
    }
  }
}

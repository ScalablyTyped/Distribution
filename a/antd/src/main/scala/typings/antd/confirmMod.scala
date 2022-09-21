package typings.antd

import typings.antd.anon.Destroy
import typings.antd.anon.RootPrefixCls
import typings.antd.anon.Update
import typings.antd.antdStrings.confirm
import typings.antd.antdStrings.error
import typings.antd.antdStrings.info
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warn
import typings.antd.antdStrings.warning
import typings.antd.modalModalMod.ModalFuncProps
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod {
  
  @JSImport("antd/lib/modal/confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ModalFuncProps): Update = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Update]
  
  inline def modalGlobalConfig(hasRootPrefixCls: RootPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modalGlobalConfig")(hasRootPrefixCls.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withConfirm(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfirm")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withError(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withError")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withInfo(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withSuccess(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuccess")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  inline def withWarn(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withWarn")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  type ConfigUpdate = ModalFuncProps | (js.Function1[/* prevConfig */ ModalFuncProps, ModalFuncProps])
  
  type ModalFunc = js.Function1[/* props */ ModalFuncProps, Destroy]
  
  type ModalStaticFunctions = Record[
    NonNullable[js.UndefOr[info | success | error | warn | warning | confirm]], 
    ModalFunc
  ]
}

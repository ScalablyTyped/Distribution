package typings.antdMobile

import typings.antdMobile.anon.PartialModalProps
import typings.antdMobile.anon.WeakValidationMapModalPro
import typings.antdMobile.modalAlertMod.ModalAlertProps
import typings.antdMobile.modalConfirmMod.ModalConfirmProps
import typings.antdMobile.modalModalMod.ModalProps
import typings.antdMobile.modalShowMod.ModalShowHandler
import typings.antdMobile.modalShowMod.ModalShowProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/modal/modal.ModalProps> & {  show :(props : antd-mobile.antd-mobile/es/components/modal/show.ModalShowProps): antd-mobile.antd-mobile/es/components/modal/show.ModalShowHandler,   alert :(p : antd-mobile.antd-mobile/es/components/modal/alert.ModalAlertProps): std.Promise<void>,   confirm :(p : antd-mobile.antd-mobile/es/components/modal/confirm.ModalConfirmProps): std.Promise<boolean>,   clear :(): void} */
  object default {
    
    inline def apply(props: ModalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: ModalProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/modal", "default.alert")
    @js.native
    def alert: js.Function1[/* p */ ModalAlertProps, js.Promise[Unit]] = js.native
    inline def alert_=(x: js.Function1[/* p */ ModalAlertProps, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.clear")
    @js.native
    def clear: js.Function0[Unit] = js.native
    inline def clear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.confirm")
    @js.native
    def confirm: js.Function1[/* p */ ModalConfirmProps, js.Promise[Boolean]] = js.native
    inline def confirm_=(x: js.Function1[/* p */ ModalConfirmProps, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialModalProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapModalPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/modal", "default.show")
    @js.native
    def show: js.Function1[/* props */ ModalShowProps, ModalShowHandler] = js.native
    inline def show_=(x: js.Function1[/* props */ ModalShowProps, ModalShowHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
  }
}

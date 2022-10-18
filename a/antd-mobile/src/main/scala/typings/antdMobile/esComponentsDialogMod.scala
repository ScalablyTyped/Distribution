package typings.antdMobile

import typings.antdMobile.anon.PartialDialogProps
import typings.antdMobile.anon.WeakValidationMapDialogPr
import typings.antdMobile.esComponentsDialogAlertMod.DialogAlertProps
import typings.antdMobile.esComponentsDialogConfirmMod.DialogConfirmProps
import typings.antdMobile.esComponentsDialogDialogMod.DialogProps
import typings.antdMobile.esComponentsDialogShowMod.DialogShowHandler
import typings.antdMobile.esComponentsDialogShowMod.DialogShowProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDialogMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/dialog/dialog.DialogProps> & {  show :(props : antd-mobile.antd-mobile/es/components/dialog/show.DialogShowProps): antd-mobile.antd-mobile/es/components/dialog/show.DialogShowHandler,   alert :(p : antd-mobile.antd-mobile/es/components/dialog/alert.DialogAlertProps): std.Promise<void>,   confirm :(p : antd-mobile.antd-mobile/es/components/dialog/confirm.DialogConfirmProps): std.Promise<boolean>,   clear :(): void} */
  object default {
    
    inline def apply(props: DialogProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: DialogProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/dialog", "default.alert")
    @js.native
    def alert: js.Function1[/* p */ DialogAlertProps, js.Promise[Unit]] = js.native
    inline def alert_=(x: js.Function1[/* p */ DialogAlertProps, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.clear")
    @js.native
    def clear: js.Function0[Unit] = js.native
    inline def clear_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.confirm")
    @js.native
    def confirm: js.Function1[/* p */ DialogConfirmProps, js.Promise[Boolean]] = js.native
    inline def confirm_=(x: js.Function1[/* p */ DialogConfirmProps, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialDialogProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialDialogProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapDialogPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapDialogPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dialog", "default.show")
    @js.native
    def show: js.Function1[/* props */ DialogShowProps, DialogShowHandler] = js.native
    inline def show_=(x: js.Function1[/* props */ DialogShowProps, DialogShowHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
  }
}

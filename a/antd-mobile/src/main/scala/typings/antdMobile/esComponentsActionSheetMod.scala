package typings.antdMobile

import typings.antdMobile.anon.OmitActionSheetPropsvisib
import typings.antdMobile.anon.PartialActionSheetProps
import typings.antdMobile.anon.WeakValidationMapActionSh
import typings.antdMobile.esComponentsActionSheetActionSheetMod.ActionSheetProps
import typings.antdMobile.esComponentsActionSheetActionSheetMod.ActionSheetShowHandler
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsActionSheetMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/action-sheet/action-sheet.ActionSheetProps> & {  show :(props : std.Omit<antd-mobile.antd-mobile/es/components/action-sheet/action-sheet.ActionSheetProps, 'visible' | 'destroyOnClose' | 'forceRender'>): antd-mobile.antd-mobile/es/components/action-sheet/action-sheet.ActionSheetShowHandler} */
  object default {
    
    inline def apply(props: ActionSheetProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: ActionSheetProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/action-sheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/action-sheet", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/action-sheet", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialActionSheetProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialActionSheetProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/action-sheet", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/action-sheet", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapActionSh] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapActionSh]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/action-sheet", "default.show")
    @js.native
    def show: js.Function1[/* props */ OmitActionSheetPropsvisib, ActionSheetShowHandler] = js.native
    inline def show_=(x: js.Function1[/* props */ OmitActionSheetPropsvisib, ActionSheetShowHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
  }
}

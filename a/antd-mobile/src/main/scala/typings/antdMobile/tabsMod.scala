package typings.antdMobile

import typings.antdMobile.anon.PartialTabsProps
import typings.antdMobile.anon.WeakValidationMapTabsProp
import typings.antdMobile.tabsTabsMod.TabProps
import typings.antdMobile.tabsTabsMod.TabsProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/tabs/tabs.TabsProps> & {  Tab :react.react.FC<antd-mobile.antd-mobile/es/components/tabs/tabs.TabProps>} */
  object default {
    
    inline def apply(props: TabsProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: TabsProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/tabs", "default.Tab")
    @js.native
    def Tab: FC[TabProps] = js.native
    inline def Tab_=(x: FC[TabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTabsProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTabsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTabsProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabsProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

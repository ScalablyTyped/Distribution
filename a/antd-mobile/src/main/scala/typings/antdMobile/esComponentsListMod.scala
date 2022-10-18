package typings.antdMobile

import typings.antdMobile.anon.PartialheaderReactNodeund
import typings.antdMobile.anon.WeakValidationMapheaderRe
import typings.antdMobile.anon.headerReactNodeundefinedm
import typings.antdMobile.esComponentsListListItemMod.ListItemProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsListMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  header :react.react.ReactNode | undefined,   mode :'default' | 'card' | undefined,   children :react.react.ReactNode | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<'--active-background-color' | '--align-items' | '--border-bottom' | '--border-inner' | '--border-top' | '--extra-max-width' | '--font-size' | '--header-font-size' | '--padding-left' | '--padding-right' | '--prefix-padding-right' | '--prefix-width', string>> | undefined,   tabIndex :number | undefined} & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/list/list.ListRef>> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/list/list-item.ListItemProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: headerReactNodeundefinedm): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/list", "default.Item")
    @js.native
    def Item: FC[ListItemProps] = js.native
    inline def Item_=(x: FC[ListItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/list", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialheaderReactNodeund] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialheaderReactNodeund]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/list", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/list", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapheaderRe] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapheaderRe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/list", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

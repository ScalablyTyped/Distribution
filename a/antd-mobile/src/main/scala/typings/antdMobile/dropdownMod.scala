package typings.antdMobile

import typings.antdMobile.anon.PartialactiveKeystringnul
import typings.antdMobile.anon.WeakValidationMapactiveKe
import typings.antdMobile.anon.activeKeystringnullundefi
import typings.antdMobile.itemMod.DropdownItemProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  activeKey :string | null | undefined,   defaultActiveKey :string | null | undefined,   closeOnMaskClick :boolean | undefined,   closeOnClickAway :boolean | undefined,   onChange :(key : string | null): void | undefined,   arrow :react.react.ReactNode | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<never, string>> | undefined,   tabIndex :number | undefined,   children :react.react.ReactNode | undefined} & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/dropdown/dropdown.DropdownRef>> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/dropdown/item.DropdownItemProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: activeKeystringnullundefi): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/dropdown", "default.Item")
    @js.native
    def Item: FC[DropdownItemProps] = js.native
    inline def Item_=(x: FC[DropdownItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dropdown", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialactiveKeystringnul] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialactiveKeystringnul]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dropdown", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dropdown", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapactiveKe] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapactiveKe]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/dropdown", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

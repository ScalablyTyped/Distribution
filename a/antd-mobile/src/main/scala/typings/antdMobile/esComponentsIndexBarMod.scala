package typings.antdMobile

import typings.antdMobile.anon.Partialstickybooleanundef
import typings.antdMobile.anon.WeakValidationMapstickybo
import typings.antdMobile.anon.stickybooleanundefinedonI
import typings.antdMobile.esComponentsIndexBarPanelMod.IndexBarPanelProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIndexBarMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  sticky :boolean | undefined,   onIndexChange :(index : string): void | undefined,   children :react.react.ReactNode | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<'--sticky-offset-top', string>> | undefined,   tabIndex :number | undefined} & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/index-bar/index-bar.IndexBarRef>> & {  Panel :react.react.FC<antd-mobile.antd-mobile/es/components/index-bar/panel.IndexBarPanelProps>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: stickybooleanundefinedonI): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/index-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/index-bar", "default.Panel")
    @js.native
    def Panel: FC[IndexBarPanelProps] = js.native
    inline def Panel_=(x: FC[IndexBarPanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/index-bar", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partialstickybooleanundef] = js.native
    inline def defaultProps_=(x: js.UndefOr[Partialstickybooleanundef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/index-bar", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/index-bar", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapstickybo] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapstickybo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/index-bar", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

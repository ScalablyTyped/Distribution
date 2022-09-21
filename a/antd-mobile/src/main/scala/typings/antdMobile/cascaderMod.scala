package typings.antdMobile

import typings.antdMobile.anon.OmitCascaderPropsvaluevis
import typings.antdMobile.anon.PartialoptionsArrayCascad
import typings.antdMobile.anon.WeakValidationMapoptionsA
import typings.antdMobile.anon.optionsArrayCascaderOptioActiveIcon
import typings.antdMobile.cascaderViewCascaderViewMod.CascaderOption
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  options :std.Array<antd-mobile.antd-mobile/es/components/cascader-view.CascaderOption>,   value :std.Array<string> | undefined,   defaultValue :std.Array<string> | undefined,   placeholder :string | undefined,   onSelect :(value : std.Array<string>, extend : antd-mobile.antd-mobile/es/components/cascader-view.CascaderValueExtend): void | undefined,   onConfirm :(value : std.Array<string>, extend : antd-mobile.antd-mobile/es/components/cascader-view.CascaderValueExtend): void | undefined,   onCancel :(): void | undefined,   onClose :(): void | undefined,   visible :boolean | undefined,   title :react.react.ReactNode | undefined,   confirmText :react.react.ReactNode | undefined,   cancelText :react.react.ReactNode | undefined,   children :(items : std.Array<antd-mobile.antd-mobile/es/components/cascader-view.CascaderOption | null>, actions : antd-mobile.antd-mobile/es/components/cascader/cascader.CascaderActions): react.react.ReactNode | undefined,   onTabsChange :(index : number): void | undefined,   activeIcon :react.react.ReactNode | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<never, string>> | undefined,   tabIndex :number | undefined} & std.Pick<antd-mobile.antd-mobile/es/components/popup.PopupProps, 'onClick' | 'destroyOnClose' | 'forceRender' | 'getContainer' | 'afterShow' | 'afterClose' | 'stopPropagation'> & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/cascader/cascader.CascaderActions>> & {  prompt :(props : std.Omit<antd-mobile.antd-mobile/es/components/cascader.CascaderProps, 'value' | 'visible' | 'children'>): std.Promise<std.Array<string> | null>,   optionSkeleton :std.Array<antd-mobile.antd-mobile/es/components/cascader-view.CascaderOption>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: optionsArrayCascaderOptioActiveIcon): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/cascader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/cascader", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialoptionsArrayCascad] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialoptionsArrayCascad]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader", "default.optionSkeleton")
    @js.native
    def optionSkeleton: js.Array[CascaderOption] = js.native
    inline def optionSkeleton_=(x: js.Array[CascaderOption]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionSkeleton")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader", "default.prompt")
    @js.native
    def prompt: js.Function1[/* props */ OmitCascaderPropsvaluevis, js.Promise[js.Array[String] | Null]] = js.native
    inline def prompt_=(x: js.Function1[/* props */ OmitCascaderPropsvaluevis, js.Promise[js.Array[String] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapoptionsA] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapoptionsA]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

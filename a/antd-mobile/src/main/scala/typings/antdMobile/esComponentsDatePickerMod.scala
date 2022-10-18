package typings.antdMobile

import typings.antdMobile.anon.OmitDatePickerPropsvaluev
import typings.antdMobile.anon.PartialvalueDatenullundef
import typings.antdMobile.anon.WeakValidationMapvalueDat
import typings.antdMobile.anon.valueDatenullundefineddef
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  value :std.Date | null | undefined,   defaultValue :std.Date | null | undefined,   onSelect :(value : std.Date): void | undefined,   onConfirm :(value : std.Date): void | undefined,   min :std.Date | undefined,   max :std.Date | undefined,   precision :antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision | undefined,   children :(value : std.Date | null, actions : antd-mobile.antd-mobile/es/components/picker.PickerActions): react.react.ReactNode | undefined,   renderLabel :(type : antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision, data : number): react.react.ReactNode | undefined,   filter :std.Partial<std.Record<antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision, (val : number, extend : {  date :std.Date}): boolean>> | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<never, string>> | undefined,   tabIndex :number | undefined} & std.Pick<antd-mobile.antd-mobile/es/components/picker.PickerProps, 'style' | 'title' | 'onClick' | 'visible' | 'destroyOnClose' | 'forceRender' | 'getContainer' | 'afterShow' | 'afterClose' | 'stopPropagation' | 'onCancel' | 'onClose' | 'loading' | 'closeOnMaskClick' | 'cancelText' | 'mouseWheel' | 'loadingContent' | 'confirmText'> & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/picker.PickerActions>> & {  prompt :(props : std.Omit<antd-mobile.antd-mobile/es/components/date-picker/date-picker.DatePickerProps, 'value' | 'visible' | 'children'>): std.Promise<std.Date | null>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: valueDatenullundefineddef): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialvalueDatenullundef] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialvalueDatenullundef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.prompt")
    @js.native
    def prompt: js.Function1[/* props */ OmitDatePickerPropsvaluev, js.Promise[js.Date | Null]] = js.native
    inline def prompt_=(x: js.Function1[/* props */ OmitDatePickerPropsvaluev, js.Promise[js.Date | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapvalueDat] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapvalueDat]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

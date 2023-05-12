package typings.antdMobile

import typings.antdMobile.anon.OmitDatePickerPropsvaluev
import typings.antdMobile.anon.PartialvaluePickerDatenul
import typings.antdMobile.anon.WeakValidationMapvaluePic
import typings.antdMobile.anon.valuePickerDatenullundefi
import typings.antdMobile.esComponentsDatePickerUtilMod.PickerDate
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsDatePickerMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  value :antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | null | undefined,   defaultValue :antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | null | undefined,   onSelect :(value : antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate): void | undefined,   onConfirm :(value : antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate): void | undefined,   min :antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | undefined,   max :antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | undefined,   precision :antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision | undefined,   children :(value : antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | null, actions : antd-mobile.antd-mobile/es/components/picker.PickerActions): react.react.ReactNode | undefined,   renderLabel :antd-mobile.antd-mobile/es/components/date-picker-view/date-picker-view.RenderLabel | undefined,   filter :std.Partial<std.Record<antd-mobile.antd-mobile/es/components/date-picker/date-picker-utils.Precision, (val : number, extend : {  date :std.Date}): boolean>> | undefined,   tillNow :boolean | undefined,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<never, string>> | undefined,   tabIndex :number | undefined} & std.Pick<antd-mobile.antd-mobile/es/components/picker.PickerProps, 'style' | 'title' | 'onClick' | 'visible' | 'destroyOnClose' | 'forceRender' | 'getContainer' | 'afterShow' | 'afterClose' | 'stopPropagation' | 'onCancel' | 'onClose' | 'loading' | 'closeOnMaskClick' | 'cancelText' | 'mouseWheel' | 'loadingContent' | 'confirmText'> & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/picker.PickerActions>> & {  prompt :(props : std.Omit<antd-mobile.antd-mobile/es/components/date-picker/date-picker.DatePickerProps, 'value' | 'visible' | 'children'>): std.Promise<antd-mobile.antd-mobile/es/components/date-picker/util.PickerDate | null>,   DATE_NOW :string} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: valuePickerDatenullundefi): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/date-picker", "default.DATE_NOW")
    @js.native
    def DATE_NOW: String = js.native
    inline def DATE_NOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE_NOW")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialvaluePickerDatenul] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialvaluePickerDatenul]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.prompt")
    @js.native
    def prompt: js.Function1[/* props */ OmitDatePickerPropsvaluev, js.Promise[PickerDate | Null]] = js.native
    inline def prompt_=(x: js.Function1[/* props */ OmitDatePickerPropsvaluev, js.Promise[PickerDate | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapvaluePic] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapvaluePic]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/date-picker", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

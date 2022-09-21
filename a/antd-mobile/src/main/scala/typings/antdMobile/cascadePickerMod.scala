package typings.antdMobile

import typings.antdMobile.anon.OmitCascadePickerPropsval
import typings.antdMobile.anon.OmitPickerPropscolumnsopt
import typings.antdMobile.anon.PartialOmitPickerPropscol
import typings.antdMobile.anon.WeakValidationMapOmitPick
import typings.antdMobile.pickerViewPickerViewMod.PickerValue
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascadePickerMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<std.Omit<antd-mobile.antd-mobile/es/components/picker.PickerProps, 'columns'> & {  options :std.Array<antd-mobile.antd-mobile/es/components/cascade-picker/cascade-picker.CascadePickerOption>} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/picker.PickerActions>> & {  prompt :(props : std.Omit<antd-mobile.antd-mobile/es/components/cascade-picker/cascade-picker.CascadePickerProps, 'value' | 'visible' | 'children'>): std.Promise<std.Array<antd-mobile.antd-mobile/es/components/picker.PickerValue> | null>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: OmitPickerPropscolumnsopt): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/cascade-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/cascade-picker", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialOmitPickerPropscol] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialOmitPickerPropscol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascade-picker", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascade-picker", "default.prompt")
    @js.native
    def prompt: js.Function1[/* props */ OmitCascadePickerPropsval, js.Promise[js.Array[PickerValue] | Null]] = js.native
    inline def prompt_=(x: js.Function1[/* props */ OmitCascadePickerPropsval, js.Promise[js.Array[PickerValue] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascade-picker", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapOmitPick] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapOmitPick]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascade-picker", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
}

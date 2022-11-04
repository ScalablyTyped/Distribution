package typings.antd

import typings.antd.anon.DropdownClassName
import typings.antd.libDatePickerGeneratePickerInterfaceMod.PickerComponentClass
import typings.antd.libDatePickerGeneratePickerMod.RangePickerProps
import typings.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerGeneratePickerGenerateRangePickerMod {
  
  @JSImport("antd/lib/date-picker/generatePicker/generateRangePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](generateConfig: GenerateConfig[DateType]): PickerComponentClass[RangePickerProps[DateType] & DropdownClassName, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[PickerComponentClass[RangePickerProps[DateType] & DropdownClassName, Any]]
}

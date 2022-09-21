package typings.antd

import typings.antd.generatePickerMod.RangePickerProps
import typings.antd.interfaceMod.PickerComponentClass
import typings.rcPicker.generateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateRangePickerMod {
  
  @JSImport("antd/lib/date-picker/generatePicker/generateRangePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](generateConfig: GenerateConfig[DateType]): PickerComponentClass[RangePickerProps[DateType], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[PickerComponentClass[RangePickerProps[DateType], Any]]
}

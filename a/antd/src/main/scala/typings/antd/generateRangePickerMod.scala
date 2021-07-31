package typings.antd

import typings.antd.generatePickerMod.RangePickerProps
import typings.rcPicker.generateMod.GenerateConfig
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateRangePickerMod {
  
  @JSImport("antd/lib/date-picker/generatePicker/generateRangePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](generateConfig: GenerateConfig[DateType]): ComponentClass[RangePickerProps[DateType], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[RangePickerProps[DateType], ComponentState]]
}

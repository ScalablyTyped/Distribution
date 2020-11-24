package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type OptionType = typings.rcSelect.optionMod.OptionFC
  
  type RawValue = java.lang.String | scala.Double
  
  type SelectValue = typings.antd.selectMod.RawValue | (js.Array[typings.antd.selectMod.LabeledValue | typings.antd.selectMod.RawValue]) | typings.antd.selectMod.LabeledValue
}

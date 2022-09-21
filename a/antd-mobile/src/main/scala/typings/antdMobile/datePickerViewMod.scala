package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.datePickerViewDatePickerViewMod.DatePickerViewProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/date-picker-view", JSImport.Default)
  @js.native
  val default: FC[DatePickerViewProps] = js.native
  
  type _To = FC[DatePickerViewProps]
  
  /* This means you don't have to write `default`, but can instead just say `datePickerViewMod.foo` */
  override def _to: FC[DatePickerViewProps] = default
}

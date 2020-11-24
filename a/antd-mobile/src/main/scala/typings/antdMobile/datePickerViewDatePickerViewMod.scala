package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Extra
import typings.antdMobile.datePickerViewPropsTypeMod.DatePickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/date-picker-view/date-picker-view", JSImport.Namespace)
@js.native
object datePickerViewDatePickerViewMod extends js.Object {
  
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
  
  @js.native
  class default () extends DatePickerView
  /* static members */
  @js.native
  object default extends js.Object {
    
    var contextTypes: AntLocale = js.native
    
    var defaultProps: Extra = js.native
  }
}

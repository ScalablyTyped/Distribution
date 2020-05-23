package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.Extra
import typings.antdMobileRn.datePickerViewPropsTypeMod.DatePickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", JSImport.Namespace)
@js.native
object datePickerViewMod extends js.Object {
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


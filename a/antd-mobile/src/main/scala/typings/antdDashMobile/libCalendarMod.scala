package typings.antdDashMobile

import typings.antdDashMobile.libCalendarPropsTypeMod.CalendarProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/calendar", JSImport.Namespace)
@js.native
object libCalendarMod extends js.Object {
  @js.native
  trait Calendar
    extends Component[CalendarProps, js.Any, js.Any]
  
  @js.native
  class default () extends Calendar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: Anon_AntLocale = js.native
    var defaultProps: Anon_PrefixClsTimePickerPickerPrefixCls = js.native
  }
  
}


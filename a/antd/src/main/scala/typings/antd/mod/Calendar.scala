package typings.antd.mod

import typings.antd.AnonArgsClassName
import typings.antd.AnonFullscreen
import typings.antd.calendarMod.CalendarProps
import typings.antd.calendarMod.CalendarState
import typings.antd.calendarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Calendar")
@js.native
class Calendar protected () extends default {
  def this(props: CalendarProps) = this()
}

/* static members */
@JSImport("antd", "Calendar")
@js.native
object Calendar extends js.Object {
  var defaultProps: AnonFullscreen = js.native
  var propTypes: AnonArgsClassName = js.native
  def getDerivedStateFromProps(nextProps: CalendarProps): CalendarState | Null = js.native
}


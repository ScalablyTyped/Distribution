package typings.antd.libDateDashPickerWrapPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.antd.antdStrings.date
  - typings.antd.antdStrings.week
  - typings.antd.antdStrings.month
*/
trait PickerType extends js.Object

object PickerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.antd.antdStrings.date = this.cast("date")
  @scala.inline
  def month: typings.antd.antdStrings.month = this.cast("month")
  @scala.inline
  def week: typings.antd.antdStrings.week = this.cast("week")
}


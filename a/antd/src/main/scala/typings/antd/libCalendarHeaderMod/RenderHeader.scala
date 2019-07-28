package typings.antd.libCalendarHeaderMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderHeader extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  var `type`: String
  var value: Moment
  def onTypeChange(`type`: String): Unit
}

object RenderHeader {
  @scala.inline
  def apply(
    onTypeChange: String => Unit,
    `type`: String,
    value: Moment,
    onChange: /* value */ Moment => Unit = null
  ): RenderHeader = {
    val __obj = js.Dynamic.literal(onTypeChange = js.Any.fromFunction1(onTypeChange), value = value)
    __obj.updateDynamic("type")(`type`)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RenderHeader]
  }
}


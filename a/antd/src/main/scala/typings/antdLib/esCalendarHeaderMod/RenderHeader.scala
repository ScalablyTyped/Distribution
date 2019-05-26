package typings
package antdLib.esCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderHeader extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* value */ momentLib.momentMod.Moment, scala.Unit]] = js.undefined
  var `type`: java.lang.String
  var value: momentLib.momentMod.Moment
  def onTypeChange(`type`: java.lang.String): scala.Unit
}

object RenderHeader {
  @scala.inline
  def apply(
    onTypeChange: java.lang.String => scala.Unit,
    `type`: java.lang.String,
    value: momentLib.momentMod.Moment,
    onChange: /* value */ momentLib.momentMod.Moment => scala.Unit = null
  ): RenderHeader = {
    val __obj = js.Dynamic.literal(onTypeChange = js.Any.fromFunction1(onTypeChange), value = value)
    __obj.updateDynamic("type")(`type`)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RenderHeader]
  }
}


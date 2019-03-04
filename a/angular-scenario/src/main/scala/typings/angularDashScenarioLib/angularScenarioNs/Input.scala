package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  def check(): js.Any
  def enter(value: js.Any): js.Any
  def select(radioButtonValue: js.Any): js.Any
  def `val`(): Future
}

object Input {
  @scala.inline
  def apply(
    check: js.Function0[js.Any],
    enter: js.Function1[js.Any, js.Any],
    select: js.Function1[js.Any, js.Any],
    `val`: js.Function0[Future]
  ): Input = {
    val __obj = js.Dynamic.literal(check = check, enter = enter, select = select)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Input]
  }
}


package typings.angularScenario.angularScenario

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
  def apply(check: () => js.Any, enter: js.Any => js.Any, select: js.Any => js.Any, `val`: () => Future): Input = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), enter = js.Any.fromFunction1(enter), select = js.Any.fromFunction1(select))
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[Input]
  }
}


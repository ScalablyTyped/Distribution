package typings
package assertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  var actual: js.UndefOr[js.Any] = js.undefined
  var expected: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var stackStartFunction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Actual {
  @scala.inline
  def apply(
    actual: js.Any = null,
    expected: js.Any = null,
    message: java.lang.String = null,
    operator: java.lang.String = null,
    stackStartFunction: () => scala.Unit = null
  ): Anon_Actual = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual)
    if (expected != null) __obj.updateDynamic("expected")(expected)
    if (message != null) __obj.updateDynamic("message")(message)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (stackStartFunction != null) __obj.updateDynamic("stackStartFunction")(js.Any.fromFunction0(stackStartFunction))
    __obj.asInstanceOf[Anon_Actual]
  }
}


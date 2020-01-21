package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFail extends js.Object {
  var fail: js.UndefOr[js.Function1[/* res */ AnonError, Unit]] = js.undefined
  var result: AnonHitKeywords
}

object AnonFail {
  @scala.inline
  def apply(result: AnonHitKeywords, fail: /* res */ AnonError => Unit = null): AnonFail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[AnonFail]
  }
}


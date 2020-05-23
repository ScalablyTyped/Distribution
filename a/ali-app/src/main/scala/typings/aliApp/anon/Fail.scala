package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fail extends js.Object {
  var fail: js.UndefOr[js.Function1[/* res */ Error, Unit]] = js.undefined
  var result: HitKeywords
}

object Fail {
  @scala.inline
  def apply(result: HitKeywords, fail: /* res */ Error => Unit = null): Fail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[Fail]
  }
}


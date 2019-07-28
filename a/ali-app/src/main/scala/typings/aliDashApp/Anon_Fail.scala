package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fail extends js.Object {
  var fail: js.UndefOr[js.Function1[/* res */ Anon_Error, Unit]] = js.undefined
  var result: Anon_HitKeywords
}

object Anon_Fail {
  @scala.inline
  def apply(result: Anon_HitKeywords, fail: /* res */ Anon_Error => Unit = null): Anon_Fail = {
    val __obj = js.Dynamic.literal(result = result)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[Anon_Fail]
  }
}


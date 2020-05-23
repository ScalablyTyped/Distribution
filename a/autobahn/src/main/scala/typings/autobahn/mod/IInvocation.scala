package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvocation extends js.Object {
  var caller: js.UndefOr[Double] = js.undefined
  var procedure: String
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, Unit]] = js.undefined
}

object IInvocation {
  @scala.inline
  def apply(
    procedure: String,
    caller: js.UndefOr[Double] = js.undefined,
    progress: (/* args */ js.Array[_], /* kwargs */ js.Any) => Unit = null
  ): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    if (!js.isUndefined(caller)) __obj.updateDynamic("caller")(caller.get.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    __obj.asInstanceOf[IInvocation]
  }
}


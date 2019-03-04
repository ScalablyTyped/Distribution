package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvocation extends js.Object {
  var caller: js.UndefOr[scala.Double] = js.undefined
  var procedure: java.lang.String
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, scala.Unit]] = js.undefined
}

object IInvocation {
  @scala.inline
  def apply(
    procedure: java.lang.String,
    caller: scala.Int | scala.Double = null,
    progress: js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, scala.Unit] = null
  ): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure)
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[IInvocation]
  }
}


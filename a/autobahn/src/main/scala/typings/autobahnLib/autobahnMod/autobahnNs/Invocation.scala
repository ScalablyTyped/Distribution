package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invocation extends IInvocation

object Invocation {
  @scala.inline
  def apply(
    procedure: java.lang.String,
    caller: scala.Int | scala.Double = null,
    progress: (/* args */ js.Array[_], /* kwargs */ js.Any) => scala.Unit = null
  ): Invocation = {
    val __obj = js.Dynamic.literal(procedure = procedure)
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    __obj.asInstanceOf[Invocation]
  }
}


package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegisterOptions extends js.Object {
  var disclose_caller: js.UndefOr[scala.Boolean] = js.undefined
  var invoke: js.UndefOr[
    autobahnLib.autobahnLibStrings.single | autobahnLib.autobahnLibStrings.roundrobin | autobahnLib.autobahnLibStrings.random | autobahnLib.autobahnLibStrings.first | autobahnLib.autobahnLibStrings.last
  ] = js.undefined
}

object IRegisterOptions {
  @scala.inline
  def apply(
    disclose_caller: js.UndefOr[scala.Boolean] = js.undefined,
    invoke: autobahnLib.autobahnLibStrings.single | autobahnLib.autobahnLibStrings.roundrobin | autobahnLib.autobahnLibStrings.random | autobahnLib.autobahnLibStrings.first | autobahnLib.autobahnLibStrings.last = null
  ): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_caller)) __obj.updateDynamic("disclose_caller")(disclose_caller)
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisterOptions]
  }
}


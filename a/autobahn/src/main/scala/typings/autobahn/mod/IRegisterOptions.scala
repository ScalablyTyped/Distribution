package typings.autobahn.mod

import typings.autobahn.autobahnStrings.first
import typings.autobahn.autobahnStrings.last
import typings.autobahn.autobahnStrings.random
import typings.autobahn.autobahnStrings.roundrobin
import typings.autobahn.autobahnStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegisterOptions extends js.Object {
  var disclose_caller: js.UndefOr[Boolean] = js.undefined
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.undefined
}

object IRegisterOptions {
  @scala.inline
  def apply(
    disclose_caller: js.UndefOr[Boolean] = js.undefined,
    invoke: single | roundrobin | random | first | last = null
  ): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_caller)) __obj.updateDynamic("disclose_caller")(disclose_caller.asInstanceOf[js.Any])
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisterOptions]
  }
}


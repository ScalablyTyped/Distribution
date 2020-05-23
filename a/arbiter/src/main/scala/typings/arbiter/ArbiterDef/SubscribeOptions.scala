package typings.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  /**
    * A subscriber can be set to execute asynchronously, even if the message wasn't published as async.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * If your subscriber is not interested in any past messages that may have been
    * persisted, you can force them to be ignored.
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, all subscribers have a priority of 0. Higher values get higher
    * priority and are executed first. Negative values are allowed.
    */
  var priority: js.UndefOr[Double] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    persist: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}


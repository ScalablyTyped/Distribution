package typings.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  /**
    * If you wish to notify the subscribers but return from the publish() call before
    * the subscriber functions execute, use asynchronous mode
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, subscribers can return "false" to prevent subsequent subscribers from
    * receiving the message. By passing cancelable:false in the options, the publisher
    * can prevent canceling.
    */
  var cancelable: js.UndefOr[Boolean] = js.undefined
  /**
    * If the publishers wants subscribers to be notified even if they subscribe later,
    * setting the persist flag will do that.
    */
  var persist: js.UndefOr[Boolean] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    persist: js.UndefOr[Boolean] = js.undefined
  ): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOptions]
  }
}


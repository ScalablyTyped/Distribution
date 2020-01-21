package typings.amqpConnectionManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelOpts extends js.Object {
  /**
  	 * if true, then ChannelWrapper assumes all messages passed to publish() and sendToQueue() are plain JSON objects.
  	 * These will be encoded automatically before being sent.
  	 */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Name for this channel. Used for debugging.
  	 */
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * A function to call whenever we reconnect to the broker (and therefore create a new underlying channel.)
  	 * This function should either accept a callback, or return a Promise. See addSetup below
  	 */
  var setup: js.UndefOr[SetupFunc] = js.undefined
}

object CreateChannelOpts {
  @scala.inline
  def apply(json: js.UndefOr[Boolean] = js.undefined, name: String = null, setup: SetupFunc = null): CreateChannelOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelOpts]
  }
}


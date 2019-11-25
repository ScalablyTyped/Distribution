package typings.amqp.amqpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  /**
    * a map of additional arguments to pass in when creating a queue
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Default: true
    *
    * If set, the queue is deleted when all consumers have finished using it.
    *
    * Last consumer can be cancelled either explicitly or because its channel is closed.
    *
    * If there was no consumer ever on the queue, it won't be deleted
    */
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * when true the channel will close on unsubscribe
    */
  var closeChannelOnUnsubscribe: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * Durable queues remain active when a server restarts.
    *
    * Non-durable queues (transient queues) are purged if/when a server restarts.
    *
    * Note that durable queues do not necessarily hold persistent messages,
    * although it does not make sense to send persistent messages to a transient queue
    */
  var durable: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * Exclusive queues may only be consumed from by the current connection.
    *
    * Setting the 'exclusive' flag always implies 'autoDelete'
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * If set, the queue will not be declared, this will allow a queue to be deleted if you don't know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * If set, the server will not create the queue.
    *
    * The client can use this to check whether a queue exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(
    arguments: StringDictionary[js.Any] = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    closeChannelOnUnsubscribe: js.UndefOr[Boolean] = js.undefined,
    durable: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    noDeclare: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(closeChannelOnUnsubscribe)) __obj.updateDynamic("closeChannelOnUnsubscribe")(closeChannelOnUnsubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(noDeclare)) __obj.updateDynamic("noDeclare")(noDeclare.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}


package typings.angularDashBlockDashUi.angularMod.blockUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockUIService extends js.Object {
  var instances: BlockUIInstances = js.native
  /**
    * Queues a callback function to be called when the block has finished.
    *
    * This can be useful whenever you wish to redirect the user
    * to a different location while there are still pending AJAX requests.
    */
  def done(doneCallback: js.Function0[Unit]): Unit = js.native
  /**
    * Returns whether currently a block is shown for the instance or not.
    */
  def isBlocking(): Boolean = js.native
  /**
    * Allows the message shown in the overlay to be updated
    * while to block is active.
    *
    * @param message The message to show in the overlay.
    */
  def message(message: String): Unit = js.native
  /**
    * The reset will force an unblock by setting the block count to 0.
    */
  def reset(): Unit = js.native
  /**
    * The start method will start the user interface block.
    * Because multiple user interface elements can request
    * a user interface block at the same time, the service
    * keeps track of the number of start calls.
    *
    * Each call to start() will increase the count and every
    * call to stop() will decrease the value.
    * Whenever the count reaches 0 the block will end.
    *
    * Note: By default the block is immediately active after
    * calling this method, but to prevent trashing the user
    * interface each time a button is pressed, the block is
    * visible after a short delay.
    *
    * This behaviour can be modified in the configuration.
    *
    * @param messageOrOptions
    *     Either supply the message (string) to be show in the
    *     overlay or specify an IBlockUIConfig object that will be
    *     merged/extended into the block ui instance state.
    *     If no argument is specified the default text message
    *     from the configuration is used.
    */
  def start(): Unit = js.native
  def start(messageOrOptions: String): Unit = js.native
  def start(messageOrOptions: BlockUIConfig): Unit = js.native
  /**
    * This will decrease the block count.
    *
    * The block will end if the count is 0.
    */
  def stop(): Unit = js.native
}


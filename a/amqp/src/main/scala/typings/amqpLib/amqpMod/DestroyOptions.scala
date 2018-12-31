package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyOptions extends js.Object {
  /**
    * Default: false
    *
    * Will ony be deleted if the queue has no messages
    */
  var ifEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    *
    * Will only destroy the queue if it has no consumers
    */
  var ifUnused: js.UndefOr[scala.Boolean] = js.undefined
}


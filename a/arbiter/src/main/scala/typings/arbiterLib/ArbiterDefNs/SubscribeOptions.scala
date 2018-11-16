package typings
package arbiterLib.ArbiterDefNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscribeOptions extends js.Object {
  /**
            * A subscriber can be set to execute asynchronously, even if the message wasn't published as async.
            */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * If your subscriber is not interested in any past messages that may have been
            * persisted, you can force them to be ignored.
            */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
            * By default, all subscribers have a priority of 0. Higher values get higher
            * priority and are executed first. Negative values are allowed.
            */
  var priority: js.UndefOr[scala.Double] = js.undefined
}


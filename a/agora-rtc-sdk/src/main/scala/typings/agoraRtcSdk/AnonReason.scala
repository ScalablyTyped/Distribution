package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  /**
    * - An empty string if `success` is `true`.
    * - The failure reason if `success` is `false`.
    */
  var reason: String
  /**
    * The result of republishing or re-subscribing to the stream.
    * - `true`: Success.
    * - `false`: Failure.
    */
  var success: Boolean
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}

object AnonReason {
  @scala.inline
  def apply(reason: String, success: Boolean, uid: Double | String): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReason]
  }
}


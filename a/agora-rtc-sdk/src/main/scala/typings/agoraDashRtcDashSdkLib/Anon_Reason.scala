package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reason extends js.Object {
  /**
    * - An empty string if `success` is `true`.
    * - The failure reason if `success` is `false`.
    */
  var reason: java.lang.String
  /**
    * The result of republishing or re-subscribing to the stream.
    * - `true`: Success.
    * - `false`: Failure.
    */
  var success: scala.Boolean
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: scala.Double | java.lang.String
}

object Anon_Reason {
  @scala.inline
  def apply(reason: java.lang.String, success: scala.Boolean, uid: scala.Double | java.lang.String): Anon_Reason = {
    val __obj = js.Dynamic.literal(reason = reason, success = success, uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Reason]
  }
}


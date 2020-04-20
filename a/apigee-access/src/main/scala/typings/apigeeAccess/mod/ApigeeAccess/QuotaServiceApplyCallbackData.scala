package typings.apigeeAccess.mod.ApigeeAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaServiceApplyCallbackData extends js.Object {
  var allowed: Double
  var expiryTime: Double
  var isAllowed: Boolean
  var timestamp: Double
  var used: Double
}

object QuotaServiceApplyCallbackData {
  @scala.inline
  def apply(allowed: Double, expiryTime: Double, isAllowed: Boolean, timestamp: Double, used: Double): QuotaServiceApplyCallbackData = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], expiryTime = expiryTime.asInstanceOf[js.Any], isAllowed = isAllowed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyCallbackData]
  }
}


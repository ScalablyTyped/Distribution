package typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccessNs

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
    val __obj = js.Dynamic.literal(allowed = allowed, expiryTime = expiryTime, isAllowed = isAllowed, timestamp = timestamp, used = used)
  
    __obj.asInstanceOf[QuotaServiceApplyCallbackData]
  }
}


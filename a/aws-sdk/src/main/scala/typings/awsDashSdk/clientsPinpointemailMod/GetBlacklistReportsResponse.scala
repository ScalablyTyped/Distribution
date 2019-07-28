package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlacklistReportsResponse extends js.Object {
  /**
    * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
    */
  var BlacklistReport: typings.awsDashSdk.clientsPinpointemailMod.BlacklistReport
}

object GetBlacklistReportsResponse {
  @scala.inline
  def apply(BlacklistReport: BlacklistReport): GetBlacklistReportsResponse = {
    val __obj = js.Dynamic.literal(BlacklistReport = BlacklistReport)
  
    __obj.asInstanceOf[GetBlacklistReportsResponse]
  }
}


package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedStatistics extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object UnprocessedStatistics {
  @scala.inline
  def apply(ErrorCode: String = null, Message: String = null, RuleName: String = null): UnprocessedStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[UnprocessedStatistics]
  }
}


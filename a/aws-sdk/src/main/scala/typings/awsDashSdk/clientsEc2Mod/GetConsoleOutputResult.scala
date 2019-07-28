package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConsoleOutputResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The console output, base64-encoded. If you are using a command line tool, the tool decodes the output for you.
    */
  var Output: js.UndefOr[String] = js.undefined
  /**
    * The time at which the output was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}

object GetConsoleOutputResult {
  @scala.inline
  def apply(InstanceId: String = null, Output: String = null, Timestamp: DateTime = null): GetConsoleOutputResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Output != null) __obj.updateDynamic("Output")(Output)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[GetConsoleOutputResult]
  }
}


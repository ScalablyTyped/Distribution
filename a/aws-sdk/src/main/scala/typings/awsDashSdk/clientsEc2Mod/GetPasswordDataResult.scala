package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPasswordDataResult extends js.Object {
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The password of the instance. Returns an empty string if the password is not available.
    */
  var PasswordData: js.UndefOr[String] = js.undefined
  /**
    * The time the data was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}

object GetPasswordDataResult {
  @scala.inline
  def apply(InstanceId: String = null, PasswordData: String = null, Timestamp: DateTime = null): GetPasswordDataResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (PasswordData != null) __obj.updateDynamic("PasswordData")(PasswordData)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[GetPasswordDataResult]
  }
}


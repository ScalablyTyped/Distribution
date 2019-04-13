package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetResponse extends js.Object {
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: js.UndefOr[IpSetFormat] = js.undefined
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: js.UndefOr[Location] = js.undefined
  /**
    * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
    */
  var Name: js.UndefOr[Name] = js.undefined
  /**
    * The status of ipSet file uploaded.
    */
  var Status: js.UndefOr[IpSetStatus] = js.undefined
}

object GetIPSetResponse {
  @scala.inline
  def apply(
    Format: IpSetFormat = null,
    Location: Location = null,
    Name: Name = null,
    Status: IpSetStatus = null
  ): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
}


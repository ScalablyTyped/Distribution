package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetResponse extends js.Object {
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: awsDashSdkLib.clientsGuarddutyMod.Location
  /**
    * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
    */
  var Name: awsDashSdkLib.clientsGuarddutyMod.Name
  /**
    * The status of ipSet file uploaded.
    */
  var Status: IpSetStatus
  /**
    * The tags of the IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object GetIPSetResponse {
  @scala.inline
  def apply(Format: IpSetFormat, Location: Location, Name: Name, Status: IpSetStatus, Tags: TagMap = null): GetIPSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location, Name = Name, Status = Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetIPSetResponse]
  }
}


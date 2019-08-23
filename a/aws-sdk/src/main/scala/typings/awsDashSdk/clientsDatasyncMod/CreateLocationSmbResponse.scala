package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationSmbResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.undefined
}

object CreateLocationSmbResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    __obj.asInstanceOf[CreateLocationSmbResponse]
  }
}


package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSoftwareUpdateJobResponse extends js.Object {
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[__string] = js.undefined
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[__string] = js.undefined
}

object CreateSoftwareUpdateJobResponse {
  @scala.inline
  def apply(IotJobArn: __string = null, IotJobId: __string = null): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (IotJobArn != null) __obj.updateDynamic("IotJobArn")(IotJobArn)
    if (IotJobId != null) __obj.updateDynamic("IotJobId")(IotJobId)
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
}


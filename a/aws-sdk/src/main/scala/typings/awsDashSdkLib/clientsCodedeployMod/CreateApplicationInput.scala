package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationInput extends js.Object {
  /**
    * The name of the application. This name must be unique with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    *  The destination platform type for the deployment (Lambda or Server).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
}

object CreateApplicationInput {
  @scala.inline
  def apply(applicationName: ApplicationName, computePlatform: ComputePlatform = null): CreateApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationInput]
  }
}


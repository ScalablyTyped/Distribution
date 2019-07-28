package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationInput extends js.Object {
  /**
    * The name of the application. This name must be unique with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    *  The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  /**
    *  The metadata that you apply to CodeDeploy applications to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateApplicationInput {
  @scala.inline
  def apply(applicationName: ApplicationName, computePlatform: ComputePlatform = null, tags: TagList = null): CreateApplicationInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateApplicationInput]
  }
}


package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddApplicationInputRequest extends js.Object {
  /**
    * The name of your existing application to which you want to add the streaming source.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The current version of your application. You can use the DescribeApplication operation to find the current application version.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  /**
    * The Input to add.
    */
  var Input: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.Input
}

object AddApplicationInputRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, Input: Input): AddApplicationInputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CurrentApplicationVersionId = CurrentApplicationVersionId, Input = Input)
  
    __obj.asInstanceOf[AddApplicationInputRequest]
  }
}


package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationRequest extends js.Object {
  /**
    * The name of the application to delete.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * Use the DescribeApplication operation to get this value.
    */
  var CreateTimestamp: Timestamp
}

object DeleteApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CreateTimestamp: Timestamp): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, CreateTimestamp = CreateTimestamp)
  
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
}


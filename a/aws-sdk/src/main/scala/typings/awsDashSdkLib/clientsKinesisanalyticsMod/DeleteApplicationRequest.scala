package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationRequest extends js.Object {
  /**
    * Name of the Amazon Kinesis Analytics application to delete.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationName
  /**
    *  You can use the DescribeApplication operation to get this value. 
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


package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationRequest extends js.Object {
  /**
    * Name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
}

object DescribeApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
  
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
}


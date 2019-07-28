package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeApplicationStateRequest extends js.Object {
  /**
    * The configurationId in ADS that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsDashSdk.clientsMigrationhubMod.ApplicationId
}

object DescribeApplicationStateRequest {
  @scala.inline
  def apply(ApplicationId: ApplicationId): DescribeApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
  
    __obj.asInstanceOf[DescribeApplicationStateRequest]
  }
}


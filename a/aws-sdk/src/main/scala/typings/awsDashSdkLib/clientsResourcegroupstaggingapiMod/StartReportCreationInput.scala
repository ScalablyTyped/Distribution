package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReportCreationInput extends js.Object {
  /**
    * The name of the Amazon S3 bucket where the report will be stored. For more information on S3 bucket requirements, including an example bucket policy, see Additional Requirements for Running Organization-Wide Tag Compliance Report in the AWS Resource Groups User Guide. 
    */
  var S3Bucket: awsDashSdkLib.clientsResourcegroupstaggingapiMod.S3Bucket
}

object StartReportCreationInput {
  @scala.inline
  def apply(S3Bucket: S3Bucket): StartReportCreationInput = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket)
  
    __obj.asInstanceOf[StartReportCreationInput]
  }
}


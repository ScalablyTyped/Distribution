package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateS3ResourcesRequest extends js.Object {
  /**
    * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie. 
    */
  var associatedS3Resources: S3Resources
  /**
    * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon Macie. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
}

object DisassociateS3ResourcesRequest {
  @scala.inline
  def apply(associatedS3Resources: S3Resources, memberAccountId: AWSAccountId = null): DisassociateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(associatedS3Resources = associatedS3Resources)
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId)
    __obj.asInstanceOf[DisassociateS3ResourcesRequest]
  }
}


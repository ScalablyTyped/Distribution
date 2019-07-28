package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListArtifactsRequest extends js.Object {
  /**
    * The Run, Job, Suite, or Test ARN.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The artifacts' type. Allowed values include:   FILE: The artifacts are files.   LOG: The artifacts are logs.   SCREENSHOT: The artifacts are screenshots.  
    */
  var `type`: ArtifactCategory
}

object ListArtifactsRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, `type`: ArtifactCategory, nextToken: PaginationToken = null): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListArtifactsRequest]
  }
}


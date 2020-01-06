package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListS3ResourcesResult extends js.Object {
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of the associated S3 resources returned by the action.
    */
  var s3Resources: js.UndefOr[S3ResourcesClassification] = js.native
}

object ListS3ResourcesResult {
  @scala.inline
  def apply(nextToken: NextToken = null, s3Resources: S3ResourcesClassification = null): ListS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (s3Resources != null) __obj.updateDynamic("s3Resources")(s3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListS3ResourcesResult]
  }
}


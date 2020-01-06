package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectVersionsRequest extends js.Object {
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100. 
    */
  var MaxResults: js.UndefOr[ProjectVersionsPageSize] = js.native
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
    */
  var ProjectArn: typings.awsDashSdk.clientsRekognitionMod.ProjectArn = js.native
  /**
    * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If you don't specify a value, all model descriptions are returned.
    */
  var VersionNames: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.VersionNames] = js.native
}

object DescribeProjectVersionsRequest {
  @scala.inline
  def apply(
    ProjectArn: ProjectArn,
    MaxResults: Int | Double = null,
    NextToken: ExtendedPaginationToken = null,
    VersionNames: VersionNames = null
  ): DescribeProjectVersionsRequest = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VersionNames != null) __obj.updateDynamic("VersionNames")(VersionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectVersionsRequest]
  }
}


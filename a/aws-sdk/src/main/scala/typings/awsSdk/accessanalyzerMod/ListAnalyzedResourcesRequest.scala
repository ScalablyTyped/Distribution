package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnalyzedResourcesRequest extends js.Object {
  /**
    * The ARN of the analyzer to retrieve a list of analyzed resources from.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object ListAnalyzedResourcesRequest {
  @scala.inline
  def apply(
    analyzerArn: AnalyzerArn,
    maxResults: Int | Double = null,
    nextToken: Token = null,
    resourceType: ResourceType = null
  ): ListAnalyzedResourcesRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesRequest]
  }
}


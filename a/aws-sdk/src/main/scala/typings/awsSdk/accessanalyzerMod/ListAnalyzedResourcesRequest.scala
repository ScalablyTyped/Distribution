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
  def apply(analyzerArn: AnalyzerArn): ListAnalyzedResourcesRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesRequest]
  }
  @scala.inline
  implicit class ListAnalyzedResourcesRequestOps[Self <: ListAnalyzedResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = this.set("analyzerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}


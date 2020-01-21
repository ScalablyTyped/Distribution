package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnalyzedResourcesResponse extends js.Object {
  /**
    * A list of resources that were analyzed.
    */
  var analyzedResources: AnalyzedResourcesList = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListAnalyzedResourcesResponse {
  @scala.inline
  def apply(analyzedResources: AnalyzedResourcesList, nextToken: Token = null): ListAnalyzedResourcesResponse = {
    val __obj = js.Dynamic.literal(analyzedResources = analyzedResources.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesResponse]
  }
}


package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzedResourceResponse extends js.Object {
  /**
    * An AnalyedResource object that contains information that Access Analyzer found when it analyzed the resource.
    */
  var resource: js.UndefOr[AnalyzedResource] = js.native
}

object GetAnalyzedResourceResponse {
  @scala.inline
  def apply(resource: AnalyzedResource = null): GetAnalyzedResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzedResourceResponse]
  }
}


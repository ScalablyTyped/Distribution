package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzedResourceSummary extends js.Object {
  /**
    * The ARN of the analyzed resource.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The type of resource that was analyzed.
    */
  var resourceType: ResourceType = js.native
}

object AnalyzedResourceSummary {
  @scala.inline
  def apply(resourceArn: ResourceArn, resourceType: ResourceType): AnalyzedResourceSummary = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyzedResourceSummary]
  }
}


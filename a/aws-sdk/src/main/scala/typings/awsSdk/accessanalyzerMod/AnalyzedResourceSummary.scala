package typings.awsSdk.accessanalyzerMod

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
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  /**
    * The type of resource that was analyzed.
    */
  var resourceType: ResourceType = js.native
}

object AnalyzedResourceSummary {
  @scala.inline
  def apply(resourceArn: ResourceArn, resourceOwnerAccount: String, resourceType: ResourceType): AnalyzedResourceSummary = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyzedResourceSummary]
  }
}


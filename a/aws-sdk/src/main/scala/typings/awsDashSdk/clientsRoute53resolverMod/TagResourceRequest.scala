package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the resource that you want to add tags to. To get the ARN for a resource, use the applicable Get or List command:     GetResolverEndpoint     GetResolverRule     GetResolverRuleAssociation     ListResolverEndpoints     ListResolverRuleAssociations     ListResolverRules   
    */
  var ResourceArn: Arn
  /**
    * The tags that you want to add to the specified resource.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}


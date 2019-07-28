package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsInput extends js.Object {
  /**
    * The name of the load balancer. You can specify a maximum of one load balancer name.
    */
  var LoadBalancerNames: typings.awsDashSdk.clientsElbMod.LoadBalancerNames
  /**
    * The list of tag keys to remove.
    */
  var Tags: TagKeyList
}

object RemoveTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagKeyList): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames, Tags = Tags)
  
    __obj.asInstanceOf[RemoveTagsInput]
  }
}


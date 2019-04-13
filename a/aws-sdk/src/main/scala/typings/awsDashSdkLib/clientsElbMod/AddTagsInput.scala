package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsInput extends js.Object {
  /**
    * The name of the load balancer. You can specify one load balancer only.
    */
  var LoadBalancerNames: awsDashSdkLib.clientsElbMod.LoadBalancerNames
  /**
    * The tags.
    */
  var Tags: TagList
}

object AddTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNames, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsInput]
  }
}


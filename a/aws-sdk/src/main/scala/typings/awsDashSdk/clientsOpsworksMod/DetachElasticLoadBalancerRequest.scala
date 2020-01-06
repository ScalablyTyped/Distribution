package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachElasticLoadBalancerRequest extends js.Object {
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String = js.native
  /**
    * The ID of the layer that the Elastic Load Balancing instance is attached to.
    */
  var LayerId: String = js.native
}

object DetachElasticLoadBalancerRequest {
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): DetachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachElasticLoadBalancerRequest]
  }
}


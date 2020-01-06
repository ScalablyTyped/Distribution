package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachElasticLoadBalancerRequest extends js.Object {
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String = js.native
  /**
    * The ID of the layer to which the Elastic Load Balancing instance is to be attached.
    */
  var LayerId: String = js.native
}

object AttachElasticLoadBalancerRequest {
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): AttachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName.asInstanceOf[js.Any], LayerId = LayerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachElasticLoadBalancerRequest]
  }
}


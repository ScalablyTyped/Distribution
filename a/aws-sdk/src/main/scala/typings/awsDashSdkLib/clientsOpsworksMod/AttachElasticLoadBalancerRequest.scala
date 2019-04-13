package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachElasticLoadBalancerRequest extends js.Object {
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: String
  /**
    * The ID of the layer to which the Elastic Load Balancing instance is to be attached.
    */
  var LayerId: String
}

object AttachElasticLoadBalancerRequest {
  @scala.inline
  def apply(ElasticLoadBalancerName: String, LayerId: String): AttachElasticLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(ElasticLoadBalancerName = ElasticLoadBalancerName, LayerId = LayerId)
  
    __obj.asInstanceOf[AttachElasticLoadBalancerRequest]
  }
}


package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
}

object DeregisterElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String): DeregisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp)
  
    __obj.asInstanceOf[DeregisterElasticIpRequest]
  }
}


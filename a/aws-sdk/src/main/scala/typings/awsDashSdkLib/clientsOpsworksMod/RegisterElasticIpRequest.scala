package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
  /**
    * The stack ID.
    */
  var StackId: String
}

object RegisterElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String, StackId: String): RegisterElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp, StackId = StackId)
  
    __obj.asInstanceOf[RegisterElasticIpRequest]
  }
}


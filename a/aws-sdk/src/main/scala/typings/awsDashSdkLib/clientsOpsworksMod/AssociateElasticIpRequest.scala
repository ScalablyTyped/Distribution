package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateElasticIpRequest extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: String
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object AssociateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String, InstanceId: String = null): AssociateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[AssociateElasticIpRequest]
  }
}


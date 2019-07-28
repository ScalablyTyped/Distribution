package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateElasticIpRequest extends js.Object {
  /**
    * The IP address for which you want to update the name.
    */
  var ElasticIp: String
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object UpdateElasticIpRequest {
  @scala.inline
  def apply(ElasticIp: String, Name: String = null): UpdateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateElasticIpRequest]
  }
}


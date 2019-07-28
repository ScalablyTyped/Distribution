package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterElasticIpResult extends js.Object {
  /**
    * The Elastic IP address.
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
}

object RegisterElasticIpResult {
  @scala.inline
  def apply(ElasticIp: String = null): RegisterElasticIpResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp)
    __obj.asInstanceOf[RegisterElasticIpResult]
  }
}


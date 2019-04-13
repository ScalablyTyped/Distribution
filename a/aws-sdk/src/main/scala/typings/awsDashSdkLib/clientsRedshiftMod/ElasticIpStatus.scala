package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticIpStatus extends js.Object {
  /**
    * The elastic IP (EIP) address for the cluster.
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
  /**
    * The status of the elastic IP (EIP) address.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object ElasticIpStatus {
  @scala.inline
  def apply(ElasticIp: String = null, Status: String = null): ElasticIpStatus = {
    val __obj = js.Dynamic.literal()
    if (ElasticIp != null) __obj.updateDynamic("ElasticIp")(ElasticIp)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ElasticIpStatus]
  }
}


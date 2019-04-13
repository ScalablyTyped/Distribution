package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticIp extends js.Object {
  /**
    * The domain.
    */
  var Domain: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance that the address is attached to.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The IP address.
    */
  var Ip: js.UndefOr[String] = js.undefined
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The AWS region. For more information, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
}

object ElasticIp {
  @scala.inline
  def apply(
    Domain: String = null,
    InstanceId: String = null,
    Ip: String = null,
    Name: String = null,
    Region: String = null
  ): ElasticIp = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Ip != null) __obj.updateDynamic("Ip")(Ip)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    __obj.asInstanceOf[ElasticIp]
  }
}


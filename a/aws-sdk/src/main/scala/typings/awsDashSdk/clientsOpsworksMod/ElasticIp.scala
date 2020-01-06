package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticIp extends js.Object {
  /**
    * The domain.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * The ID of the instance that the address is attached to.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The IP address.
    */
  var Ip: js.UndefOr[String] = js.native
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The AWS region. For more information, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.native
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
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Ip != null) __obj.updateDynamic("Ip")(Ip.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticIp]
  }
}


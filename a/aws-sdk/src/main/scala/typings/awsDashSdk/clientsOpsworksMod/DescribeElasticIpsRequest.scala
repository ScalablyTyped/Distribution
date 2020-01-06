package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticIpsRequest extends js.Object {
  /**
    * The instance ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * An array of Elastic IP addresses to be described. If you include this parameter, DescribeElasticIps returns a description of the specified Elastic IP addresses. Otherwise, it returns a description of every Elastic IP address.
    */
  var Ips: js.UndefOr[Strings] = js.native
  /**
    * A stack ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses that are registered with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeElasticIpsRequest {
  @scala.inline
  def apply(InstanceId: String = null, Ips: Strings = null, StackId: String = null): DescribeElasticIpsRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Ips != null) __obj.updateDynamic("Ips")(Ips.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticIpsRequest]
  }
}


package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdFormatRequest extends js.Object {
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway 
    */
  var Resource: js.UndefOr[String] = js.undefined
}

object DescribeIdFormatRequest {
  @scala.inline
  def apply(Resource: String = null): DescribeIdFormatRequest = {
    val __obj = js.Dynamic.literal()
    if (Resource != null) __obj.updateDynamic("Resource")(Resource)
    __obj.asInstanceOf[DescribeIdFormatRequest]
  }
}


package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicLinkDnsSupport extends js.Object {
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object ClassicLinkDnsSupport {
  @scala.inline
  def apply(ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined, VpcId: String = null): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClassicLinkDnsSupported)) __obj.updateDynamic("ClassicLinkDnsSupported")(ClassicLinkDnsSupported)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
}


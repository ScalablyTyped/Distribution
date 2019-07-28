package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcClassicLink extends js.Object {
  /**
    * Indicates whether the VPC is enabled for ClassicLink.
    */
  var ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object VpcClassicLink {
  @scala.inline
  def apply(ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined, Tags: TagList = null, VpcId: String = null): VpcClassicLink = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClassicLinkEnabled)) __obj.updateDynamic("ClassicLinkEnabled")(ClassicLinkEnabled)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[VpcClassicLink]
  }
}


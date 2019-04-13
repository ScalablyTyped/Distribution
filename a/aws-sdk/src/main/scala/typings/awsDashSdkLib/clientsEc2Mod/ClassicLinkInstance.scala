package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassicLinkInstance extends js.Object {
  /**
    * A list of security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object ClassicLinkInstance {
  @scala.inline
  def apply(
    Groups: GroupIdentifierList = null,
    InstanceId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): ClassicLinkInstance = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[ClassicLinkInstance]
  }
}


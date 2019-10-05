package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroup extends js.Object {
  /**
    * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
    */
  var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the name of the engine that this option group can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.undefined
  /**
    * Indicates the major engine version associated with this option group.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the option group.
    */
  var OptionGroupArn: js.UndefOr[String] = js.undefined
  /**
    * Provides a description of the option group.
    */
  var OptionGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the option group.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * Indicates what options are available in the option group.
    */
  var Options: js.UndefOr[OptionsList] = js.undefined
  /**
    * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object OptionGroup {
  @scala.inline
  def apply(
    AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[scala.Boolean] = js.undefined,
    EngineName: String = null,
    MajorEngineVersion: String = null,
    OptionGroupArn: String = null,
    OptionGroupDescription: String = null,
    OptionGroupName: String = null,
    Options: OptionsList = null,
    VpcId: String = null
  ): OptionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowsVpcAndNonVpcInstanceMemberships)) __obj.updateDynamic("AllowsVpcAndNonVpcInstanceMemberships")(AllowsVpcAndNonVpcInstanceMemberships)
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName)
    if (MajorEngineVersion != null) __obj.updateDynamic("MajorEngineVersion")(MajorEngineVersion)
    if (OptionGroupArn != null) __obj.updateDynamic("OptionGroupArn")(OptionGroupArn)
    if (OptionGroupDescription != null) __obj.updateDynamic("OptionGroupDescription")(OptionGroupDescription)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[OptionGroup]
  }
}


package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accelerator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Indicates whether theaccelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
  /**
    * IP address set associated with the accelerator.
    */
  var IpSets: js.UndefOr[IpSets] = js.undefined
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.undefined
}

object Accelerator {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString = null,
    CreatedTime: Timestamp = null,
    Enabled: js.UndefOr[GenericBoolean] = js.undefined,
    IpAddressType: IpAddressType = null,
    IpSets: IpSets = null,
    LastModifiedTime: Timestamp = null,
    Name: GenericString = null,
    Status: AcceleratorStatus = null
  ): Accelerator = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorArn != null) __obj.updateDynamic("AcceleratorArn")(AcceleratorArn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (IpSets != null) __obj.updateDynamic("IpSets")(IpSets)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accelerator]
  }
}


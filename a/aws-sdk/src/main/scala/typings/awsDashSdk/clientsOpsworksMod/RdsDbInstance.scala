package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstance extends js.Object {
  /**
    * The instance's address.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The DB instance identifier.
    */
  var DbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var DbPassword: js.UndefOr[String] = js.native
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The instance's database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Set to true if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks Stacks attempts to discover the instance only once. If this value is set to true, you must deregister the instance, and then register it again.
    */
  var MissingOnRds: js.UndefOr[Boolean] = js.native
  /**
    * The instance's ARN.
    */
  var RdsDbInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the stack with which the instance is registered.
    */
  var StackId: js.UndefOr[String] = js.native
}

object RdsDbInstance {
  @scala.inline
  def apply(
    Address: String = null,
    DbInstanceIdentifier: String = null,
    DbPassword: String = null,
    DbUser: String = null,
    Engine: String = null,
    MissingOnRds: js.UndefOr[scala.Boolean] = js.undefined,
    RdsDbInstanceArn: String = null,
    Region: String = null,
    StackId: String = null
  ): RdsDbInstance = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (DbInstanceIdentifier != null) __obj.updateDynamic("DbInstanceIdentifier")(DbInstanceIdentifier.asInstanceOf[js.Any])
    if (DbPassword != null) __obj.updateDynamic("DbPassword")(DbPassword.asInstanceOf[js.Any])
    if (DbUser != null) __obj.updateDynamic("DbUser")(DbUser.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (!js.isUndefined(MissingOnRds)) __obj.updateDynamic("MissingOnRds")(MissingOnRds.asInstanceOf[js.Any])
    if (RdsDbInstanceArn != null) __obj.updateDynamic("RdsDbInstanceArn")(RdsDbInstanceArn.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsDbInstance]
  }
}


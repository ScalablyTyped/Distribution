package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB parameter group.
    */
  var DBParameterGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the customer-specified description for this DB parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}

object DBParameterGroup {
  @scala.inline
  def apply(
    DBParameterGroupArn: String = null,
    DBParameterGroupFamily: String = null,
    DBParameterGroupName: String = null,
    Description: String = null
  ): DBParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (DBParameterGroupArn != null) __obj.updateDynamic("DBParameterGroupArn")(DBParameterGroupArn.asInstanceOf[js.Any])
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily.asInstanceOf[js.Any])
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBParameterGroup]
  }
}


package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB cluster parameter group.
    */
  var DBClusterParameterGroupArn: js.UndefOr[String] = js.undefined
  /**
    * Provides the name of the DB cluster parameter group.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * Provides the customer-specified description for this DB cluster parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
}

object DBClusterParameterGroup {
  @scala.inline
  def apply(
    DBClusterParameterGroupArn: String = null,
    DBClusterParameterGroupName: String = null,
    DBParameterGroupFamily: String = null,
    Description: String = null
  ): DBClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroupArn != null) __obj.updateDynamic("DBClusterParameterGroupArn")(DBClusterParameterGroupArn)
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[DBClusterParameterGroup]
  }
}


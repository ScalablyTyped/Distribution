package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterMember extends js.Object {
  /**
    * Specifies the status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined
  /**
    * Specifies the instance identifier for this member of the DB cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Value that is true if the cluster member is the primary instance for the DB cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
}

object DBClusterMember {
  @scala.inline
  def apply(
    DBClusterParameterGroupStatus: String = null,
    DBInstanceIdentifier: String = null,
    IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  ): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroupStatus != null) __obj.updateDynamic("DBClusterParameterGroupStatus")(DBClusterParameterGroupStatus)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (!js.isUndefined(IsClusterWriter)) __obj.updateDynamic("IsClusterWriter")(IsClusterWriter)
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier)
    __obj.asInstanceOf[DBClusterMember]
  }
}


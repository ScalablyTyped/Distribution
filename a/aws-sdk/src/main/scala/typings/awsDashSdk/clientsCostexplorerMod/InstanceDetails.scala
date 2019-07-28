package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceDetails extends js.Object {
  /**
    * The Amazon EC2 instances that AWS recommends that you purchase.
    */
  var EC2InstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.EC2InstanceDetails] = js.undefined
  /**
    * The Amazon ES instances that AWS recommends that you purchase.
    */
  var ESInstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ESInstanceDetails] = js.undefined
  /**
    * The ElastiCache instances that AWS recommends that you purchase.
    */
  var ElastiCacheInstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.ElastiCacheInstanceDetails] = js.undefined
  /**
    * The Amazon RDS instances that AWS recommends that you purchase.
    */
  var RDSInstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.RDSInstanceDetails] = js.undefined
  /**
    * The Amazon Redshift instances that AWS recommends that you purchase.
    */
  var RedshiftInstanceDetails: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.RedshiftInstanceDetails] = js.undefined
}

object InstanceDetails {
  @scala.inline
  def apply(
    EC2InstanceDetails: EC2InstanceDetails = null,
    ESInstanceDetails: ESInstanceDetails = null,
    ElastiCacheInstanceDetails: ElastiCacheInstanceDetails = null,
    RDSInstanceDetails: RDSInstanceDetails = null,
    RedshiftInstanceDetails: RedshiftInstanceDetails = null
  ): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (EC2InstanceDetails != null) __obj.updateDynamic("EC2InstanceDetails")(EC2InstanceDetails)
    if (ESInstanceDetails != null) __obj.updateDynamic("ESInstanceDetails")(ESInstanceDetails)
    if (ElastiCacheInstanceDetails != null) __obj.updateDynamic("ElastiCacheInstanceDetails")(ElastiCacheInstanceDetails)
    if (RDSInstanceDetails != null) __obj.updateDynamic("RDSInstanceDetails")(RDSInstanceDetails)
    if (RedshiftInstanceDetails != null) __obj.updateDynamic("RedshiftInstanceDetails")(RedshiftInstanceDetails)
    __obj.asInstanceOf[InstanceDetails]
  }
}


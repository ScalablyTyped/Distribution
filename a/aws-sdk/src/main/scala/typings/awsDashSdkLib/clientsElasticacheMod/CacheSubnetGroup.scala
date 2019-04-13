package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheSubnetGroup extends js.Object {
  /**
    * The description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the cache subnet group.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A list of subnets associated with the cache subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object CacheSubnetGroup {
  @scala.inline
  def apply(
    CacheSubnetGroupDescription: String = null,
    CacheSubnetGroupName: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): CacheSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroupDescription != null) __obj.updateDynamic("CacheSubnetGroupDescription")(CacheSubnetGroupDescription)
    if (CacheSubnetGroupName != null) __obj.updateDynamic("CacheSubnetGroupName")(CacheSubnetGroupName)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[CacheSubnetGroup]
  }
}


package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheNode extends js.Object {
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  /**
    * The current state of this cache node.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.undefined
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.Endpoint] = js.undefined
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.undefined
}

object CacheNode {
  @scala.inline
  def apply(
    CacheNodeCreateTime: TStamp = null,
    CacheNodeId: String = null,
    CacheNodeStatus: String = null,
    CustomerAvailabilityZone: String = null,
    Endpoint: Endpoint = null,
    ParameterGroupStatus: String = null,
    SourceCacheNodeId: String = null
  ): CacheNode = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeCreateTime != null) __obj.updateDynamic("CacheNodeCreateTime")(CacheNodeCreateTime)
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId)
    if (CacheNodeStatus != null) __obj.updateDynamic("CacheNodeStatus")(CacheNodeStatus)
    if (CustomerAvailabilityZone != null) __obj.updateDynamic("CustomerAvailabilityZone")(CustomerAvailabilityZone)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (ParameterGroupStatus != null) __obj.updateDynamic("ParameterGroupStatus")(ParameterGroupStatus)
    if (SourceCacheNodeId != null) __obj.updateDynamic("SourceCacheNodeId")(SourceCacheNodeId)
    __obj.asInstanceOf[CacheNode]
  }
}


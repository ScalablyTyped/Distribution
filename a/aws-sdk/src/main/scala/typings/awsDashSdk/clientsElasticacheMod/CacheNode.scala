package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNode extends js.Object {
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The current state of this cache node.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.native
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.Endpoint] = js.native
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.native
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
    if (CacheNodeCreateTime != null) __obj.updateDynamic("CacheNodeCreateTime")(CacheNodeCreateTime.asInstanceOf[js.Any])
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId.asInstanceOf[js.Any])
    if (CacheNodeStatus != null) __obj.updateDynamic("CacheNodeStatus")(CacheNodeStatus.asInstanceOf[js.Any])
    if (CustomerAvailabilityZone != null) __obj.updateDynamic("CustomerAvailabilityZone")(CustomerAvailabilityZone.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (ParameterGroupStatus != null) __obj.updateDynamic("ParameterGroupStatus")(ParameterGroupStatus.asInstanceOf[js.Any])
    if (SourceCacheNodeId != null) __obj.updateDynamic("SourceCacheNodeId")(SourceCacheNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNode]
  }
}


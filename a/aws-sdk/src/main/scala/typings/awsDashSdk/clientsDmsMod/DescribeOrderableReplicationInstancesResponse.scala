package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrderableReplicationInstancesResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The order-able replication instances available.
    */
  var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined
}

object DescribeOrderableReplicationInstancesResponse {
  @scala.inline
  def apply(Marker: String = null, OrderableReplicationInstances: OrderableReplicationInstanceList = null): DescribeOrderableReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (OrderableReplicationInstances != null) __obj.updateDynamic("OrderableReplicationInstances")(OrderableReplicationInstances)
    __obj.asInstanceOf[DescribeOrderableReplicationInstancesResponse]
  }
}


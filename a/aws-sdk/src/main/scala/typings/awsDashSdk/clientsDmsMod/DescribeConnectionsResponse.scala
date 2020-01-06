package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConnectionsResponse extends js.Object {
  /**
    * A description of the connections.
    */
  var Connections: js.UndefOr[ConnectionList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeConnectionsResponse {
  @scala.inline
  def apply(Connections: ConnectionList = null, Marker: String = null): DescribeConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionsResponse]
  }
}


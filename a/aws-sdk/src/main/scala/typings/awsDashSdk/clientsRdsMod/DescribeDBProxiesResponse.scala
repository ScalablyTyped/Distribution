package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBProxiesResponse extends js.Object {
  /**
    * A return value representing an arbitrary number of DBProxy data structures.
    */
  var DBProxies: js.UndefOr[DBProxyList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeDBProxiesResponse {
  @scala.inline
  def apply(DBProxies: DBProxyList = null, Marker: String = null): DescribeDBProxiesResponse = {
    val __obj = js.Dynamic.literal()
    if (DBProxies != null) __obj.updateDynamic("DBProxies")(DBProxies.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxiesResponse]
  }
}


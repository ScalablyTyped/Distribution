package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBEngineVersionMessage extends js.Object {
  /**
    *  A list of DBEngineVersion elements.
    */
  var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBEngineVersionMessage {
  @scala.inline
  def apply(DBEngineVersions: DBEngineVersionList = null, Marker: String = null): DBEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    if (DBEngineVersions != null) __obj.updateDynamic("DBEngineVersions")(DBEngineVersions.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBEngineVersionMessage]
  }
}


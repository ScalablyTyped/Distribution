package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBEngineVersionMessage extends js.Object {
  /**
    * Detailed information about one or more DB engine versions.
    */
  var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBEngineVersionMessage {
  @scala.inline
  def apply(DBEngineVersions: DBEngineVersionList = null, Marker: String = null): DBEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    if (DBEngineVersions != null) __obj.updateDynamic("DBEngineVersions")(DBEngineVersions)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBEngineVersionMessage]
  }
}


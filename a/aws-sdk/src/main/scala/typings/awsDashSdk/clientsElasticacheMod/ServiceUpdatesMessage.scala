package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUpdatesMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of service updates
    */
  var ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.native
}

object ServiceUpdatesMessage {
  @scala.inline
  def apply(Marker: String = null, ServiceUpdates: ServiceUpdateList = null): ServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ServiceUpdates != null) __obj.updateDynamic("ServiceUpdates")(ServiceUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceUpdatesMessage]
  }
}


package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroup extends js.Object {
  /**
    * Geospatial column group that denotes a hierarchy.
    */
  var GeoSpatialColumnGroup: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.GeoSpatialColumnGroup] = js.native
}

object ColumnGroup {
  @scala.inline
  def apply(GeoSpatialColumnGroup: GeoSpatialColumnGroup = null): ColumnGroup = {
    val __obj = js.Dynamic.literal()
    if (GeoSpatialColumnGroup != null) __obj.updateDynamic("GeoSpatialColumnGroup")(GeoSpatialColumnGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroup]
  }
}


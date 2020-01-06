package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoSpatialColumnGroup extends js.Object {
  /**
    * Columns in this hierarchy.
    */
  var Columns: ColumnList = js.native
  /**
    * Country code.
    */
  var CountryCode: GeoSpatialCountryCode = js.native
  /**
    * A display name for the hierarchy.
    */
  var Name: ColumnGroupName = js.native
}

object GeoSpatialColumnGroup {
  @scala.inline
  def apply(Columns: ColumnList, CountryCode: GeoSpatialCountryCode, Name: ColumnGroupName): GeoSpatialColumnGroup = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoSpatialColumnGroup]
  }
}


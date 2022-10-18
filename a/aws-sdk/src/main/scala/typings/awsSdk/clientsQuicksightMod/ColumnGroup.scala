package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnGroup extends StObject {
  
  /**
    * Geospatial column group that denotes a hierarchy.
    */
  var GeoSpatialColumnGroup: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GeoSpatialColumnGroup] = js.undefined
}
object ColumnGroup {
  
  inline def apply(): ColumnGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroup]
  }
  
  extension [Self <: ColumnGroup](x: Self) {
    
    inline def setGeoSpatialColumnGroup(value: GeoSpatialColumnGroup): Self = StObject.set(x, "GeoSpatialColumnGroup", value.asInstanceOf[js.Any])
    
    inline def setGeoSpatialColumnGroupUndefined: Self = StObject.set(x, "GeoSpatialColumnGroup", js.undefined)
  }
}

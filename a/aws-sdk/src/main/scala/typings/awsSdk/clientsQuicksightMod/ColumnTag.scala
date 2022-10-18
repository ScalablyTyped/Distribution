package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTag extends StObject {
  
  /**
    * A description for a column.
    */
  var ColumnDescription: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnDescription] = js.undefined
  
  /**
    * A geospatial role for a column.
    */
  var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole] = js.undefined
}
object ColumnTag {
  
  inline def apply(): ColumnTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTag]
  }
  
  extension [Self <: ColumnTag](x: Self) {
    
    inline def setColumnDescription(value: ColumnDescription): Self = StObject.set(x, "ColumnDescription", value.asInstanceOf[js.Any])
    
    inline def setColumnDescriptionUndefined: Self = StObject.set(x, "ColumnDescription", js.undefined)
    
    inline def setColumnGeographicRole(value: GeoSpatialDataRole): Self = StObject.set(x, "ColumnGeographicRole", value.asInstanceOf[js.Any])
    
    inline def setColumnGeographicRoleUndefined: Self = StObject.set(x, "ColumnGeographicRole", js.undefined)
  }
}

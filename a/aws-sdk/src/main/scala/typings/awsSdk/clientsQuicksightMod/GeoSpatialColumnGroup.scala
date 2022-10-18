package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSpatialColumnGroup extends StObject {
  
  /**
    * Columns in this hierarchy.
    */
  var Columns: ColumnList
  
  /**
    * Country code.
    */
  var CountryCode: js.UndefOr[GeoSpatialCountryCode] = js.undefined
  
  /**
    * A display name for the hierarchy.
    */
  var Name: ColumnGroupName
}
object GeoSpatialColumnGroup {
  
  inline def apply(Columns: ColumnList, Name: ColumnGroupName): GeoSpatialColumnGroup = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSpatialColumnGroup]
  }
  
  extension [Self <: GeoSpatialColumnGroup](x: Self) {
    
    inline def setColumns(value: ColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setCountryCode(value: GeoSpatialCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setName(value: ColumnGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDataSource extends StObject {
  
  /**
    * The name of the table in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var dataSourceName: String
  
  /**
    * References the geodatabase version if multiple versions exist in the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var gdbVersion: String
  
  /**
    * This value is always `table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var `type`: String
  
  /**
    * The workspace where the table resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var workspaceId: String
}
object TableDataSource {
  
  inline def apply(dataSourceName: String, gdbVersion: String, `type`: String, workspaceId: String): TableDataSource = {
    val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataSource]
  }
  
  extension [Self <: TableDataSource](x: Self) {
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}

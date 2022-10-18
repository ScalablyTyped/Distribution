package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetColumnStatisticsForTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of the column names.
    */
  var ColumnNames: GetColumnNamesList
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString
}
object GetColumnStatisticsForTableRequest {
  
  inline def apply(ColumnNames: GetColumnNamesList, DatabaseName: NameString, TableName: NameString): GetColumnStatisticsForTableRequest = {
    val __obj = js.Dynamic.literal(ColumnNames = ColumnNames.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetColumnStatisticsForTableRequest]
  }
  
  extension [Self <: GetColumnStatisticsForTableRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setColumnNames(value: GetColumnNamesList): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ColumnNames", js.Array(value*))
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}

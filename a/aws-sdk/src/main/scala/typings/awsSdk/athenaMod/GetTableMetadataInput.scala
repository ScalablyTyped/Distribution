package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableMetadataInput extends StObject {
  
  /**
    * The name of the data catalog that contains the database and table metadata to return.
    */
  var CatalogName: CatalogNameString
  
  /**
    * The name of the database that contains the table metadata to return.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the table for which metadata is returned.
    */
  var TableName: NameString
}
object GetTableMetadataInput {
  
  @scala.inline
  def apply(CatalogName: CatalogNameString, DatabaseName: NameString, TableName: NameString): GetTableMetadataInput = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableMetadataInput]
  }
  
  @scala.inline
  implicit class GetTableMetadataInputMutableBuilder[Self <: GetTableMetadataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogName(value: CatalogNameString): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogEntry extends StObject {
  
  /**
    * The database in which the table metadata resides.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the table in question.
    */
  var TableName: NameString
}
object CatalogEntry {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): CatalogEntry = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogEntry] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}

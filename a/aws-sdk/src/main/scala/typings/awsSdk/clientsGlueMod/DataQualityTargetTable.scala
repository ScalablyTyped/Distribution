package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityTargetTable extends StObject {
  
  /**
    * The name of the database where the Glue table exists.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the Glue table.
    */
  var TableName: NameString
}
object DataQualityTargetTable {
  
  inline def apply(DatabaseName: NameString, TableName: NameString): DataQualityTargetTable = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualityTargetTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityTargetTable] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}

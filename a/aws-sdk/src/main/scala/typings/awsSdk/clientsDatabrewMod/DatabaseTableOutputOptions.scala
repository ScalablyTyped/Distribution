package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseTableOutputOptions extends StObject {
  
  /**
    * A prefix for the name of a table DataBrew will create in the database.
    */
  var TableName: DatabaseTableName
  
  /**
    * Represents an Amazon S3 location (bucket name and object key) where DataBrew can store intermediate results.
    */
  var TempDirectory: js.UndefOr[S3Location] = js.undefined
}
object DatabaseTableOutputOptions {
  
  inline def apply(TableName: DatabaseTableName): DatabaseTableOutputOptions = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseTableOutputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseTableOutputOptions] (val x: Self) extends AnyVal {
    
    inline def setTableName(value: DatabaseTableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTempDirectory(value: S3Location): Self = StObject.set(x, "TempDirectory", value.asInstanceOf[js.Any])
    
    inline def setTempDirectoryUndefined: Self = StObject.set(x, "TempDirectory", js.undefined)
  }
}

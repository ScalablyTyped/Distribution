package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupOutput extends StObject {
  
  /**
    * The description of the table created from an existing backup.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableDescription] = js.undefined
}
object RestoreTableFromBackupOutput {
  
  inline def apply(): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
  
  extension [Self <: RestoreTableFromBackupOutput](x: Self) {
    
    inline def setTableDescription(value: TableDescription): Self = StObject.set(x, "TableDescription", value.asInstanceOf[js.Any])
    
    inline def setTableDescriptionUndefined: Self = StObject.set(x, "TableDescription", js.undefined)
  }
}

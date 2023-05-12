package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableRestoreStatusResponse extends StObject {
  
  /**
    * The returned TableRestoreStatus object that contains information about the status of your RestoreTableFromSnapshot request.
    */
  var tableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
}
object GetTableRestoreStatusResponse {
  
  inline def apply(): GetTableRestoreStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableRestoreStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTableRestoreStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setTableRestoreStatus(value: TableRestoreStatus): Self = StObject.set(x, "tableRestoreStatus", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreStatusUndefined: Self = StObject.set(x, "tableRestoreStatus", js.undefined)
  }
}

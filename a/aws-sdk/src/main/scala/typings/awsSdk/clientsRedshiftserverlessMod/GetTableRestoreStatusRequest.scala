package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableRestoreStatusRequest extends StObject {
  
  /**
    * The ID of the RestoreTableFromSnapshot request to return status for.
    */
  var tableRestoreRequestId: String
}
object GetTableRestoreStatusRequest {
  
  inline def apply(tableRestoreRequestId: String): GetTableRestoreStatusRequest = {
    val __obj = js.Dynamic.literal(tableRestoreRequestId = tableRestoreRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableRestoreStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTableRestoreStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setTableRestoreRequestId(value: String): Self = StObject.set(x, "tableRestoreRequestId", value.asInstanceOf[js.Any])
  }
}

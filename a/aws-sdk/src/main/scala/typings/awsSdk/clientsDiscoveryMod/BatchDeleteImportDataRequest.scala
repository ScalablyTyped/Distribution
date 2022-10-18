package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImportDataRequest extends StObject {
  
  /**
    * The IDs for the import tasks that you want to delete.
    */
  var importTaskIds: ToDeleteIdentifierList
}
object BatchDeleteImportDataRequest {
  
  inline def apply(importTaskIds: ToDeleteIdentifierList): BatchDeleteImportDataRequest = {
    val __obj = js.Dynamic.literal(importTaskIds = importTaskIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImportDataRequest]
  }
  
  extension [Self <: BatchDeleteImportDataRequest](x: Self) {
    
    inline def setImportTaskIds(value: ToDeleteIdentifierList): Self = StObject.set(x, "importTaskIds", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdsVarargs(value: ImportTaskIdentifier*): Self = StObject.set(x, "importTaskIds", js.Array(value*))
  }
}

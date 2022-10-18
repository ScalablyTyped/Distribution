package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutPropertyValuesResponse extends StObject {
  
  /**
    * Entries that caused errors in the batch put operation.
    */
  var errorEntries: ErrorEntries
}
object BatchPutPropertyValuesResponse {
  
  inline def apply(errorEntries: ErrorEntries): BatchPutPropertyValuesResponse = {
    val __obj = js.Dynamic.literal(errorEntries = errorEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutPropertyValuesResponse]
  }
  
  extension [Self <: BatchPutPropertyValuesResponse](x: Self) {
    
    inline def setErrorEntries(value: ErrorEntries): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesVarargs(value: BatchPutPropertyErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value*))
  }
}

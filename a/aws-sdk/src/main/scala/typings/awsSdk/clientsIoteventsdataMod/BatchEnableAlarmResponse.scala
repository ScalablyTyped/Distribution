package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEnableAlarmResponse extends StObject {
  
  /**
    * A list of errors associated with the request, or null if there are no errors. Each error entry contains an entry ID that helps you identify the entry that failed.
    */
  var errorEntries: js.UndefOr[BatchAlarmActionErrorEntries] = js.undefined
}
object BatchEnableAlarmResponse {
  
  inline def apply(): BatchEnableAlarmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEnableAlarmResponse]
  }
  
  extension [Self <: BatchEnableAlarmResponse](x: Self) {
    
    inline def setErrorEntries(value: BatchAlarmActionErrorEntries): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesUndefined: Self = StObject.set(x, "errorEntries", js.undefined)
    
    inline def setErrorEntriesVarargs(value: BatchAlarmActionErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value*))
  }
}

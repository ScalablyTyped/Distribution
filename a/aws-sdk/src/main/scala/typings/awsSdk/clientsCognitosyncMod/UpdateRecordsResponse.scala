package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecordsResponse extends StObject {
  
  /**
    * A list of records that have been updated.
    */
  var Records: js.UndefOr[RecordList] = js.undefined
}
object UpdateRecordsResponse {
  
  inline def apply(): UpdateRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRecordsResponse]
  }
  
  extension [Self <: UpdateRecordsResponse](x: Self) {
    
    inline def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}

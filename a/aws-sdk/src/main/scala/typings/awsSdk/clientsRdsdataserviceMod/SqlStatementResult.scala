package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlStatementResult extends StObject {
  
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined
  
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.undefined
}
object SqlStatementResult {
  
  inline def apply(): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlStatementResult]
  }
  
  extension [Self <: SqlStatementResult](x: Self) {
    
    inline def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = StObject.set(x, "numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecordsUpdatedUndefined: Self = StObject.set(x, "numberOfRecordsUpdated", js.undefined)
    
    inline def setResultFrame(value: ResultFrame): Self = StObject.set(x, "resultFrame", value.asInstanceOf[js.Any])
    
    inline def setResultFrameUndefined: Self = StObject.set(x, "resultFrame", js.undefined)
  }
}

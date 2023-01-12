package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkUnitResultsResponse extends StObject {
  
  /**
    * Rows returned from the GetWorkUnitResults operation as a stream of Apache Arrow v1.0 messages.
    */
  var ResultStream: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ResultStream] = js.undefined
}
object GetWorkUnitResultsResponse {
  
  inline def apply(): GetWorkUnitResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkUnitResultsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkUnitResultsResponse] (val x: Self) extends AnyVal {
    
    inline def setResultStream(value: ResultStream): Self = StObject.set(x, "ResultStream", value.asInstanceOf[js.Any])
    
    inline def setResultStreamUndefined: Self = StObject.set(x, "ResultStream", js.undefined)
  }
}

package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerFleetsResponse extends StObject {
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var workerFleets: js.UndefOr[WorkerFleets] = js.undefined
}
object ListWorkerFleetsResponse {
  
  inline def apply(): ListWorkerFleetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerFleetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkerFleetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkerFleets(value: WorkerFleets): Self = StObject.set(x, "workerFleets", value.asInstanceOf[js.Any])
    
    inline def setWorkerFleetsUndefined: Self = StObject.set(x, "workerFleets", js.undefined)
    
    inline def setWorkerFleetsVarargs(value: WorkerFleet*): Self = StObject.set(x, "workerFleets", js.Array(value*))
  }
}

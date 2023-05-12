package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkersResponse extends StObject {
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var workers: js.UndefOr[Workers] = js.undefined
}
object ListWorkersResponse {
  
  inline def apply(): ListWorkersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkers(value: Workers): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    
    inline def setWorkersVarargs(value: Worker*): Self = StObject.set(x, "workers", js.Array(value*))
  }
}

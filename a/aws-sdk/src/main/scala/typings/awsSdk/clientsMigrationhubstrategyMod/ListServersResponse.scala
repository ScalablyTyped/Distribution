package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServersResponse extends StObject {
  
  /**
    *  The token you use to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The list of servers with detailed information about each server. 
    */
  var serverInfos: js.UndefOr[ServerDetails] = js.undefined
}
object ListServersResponse {
  
  inline def apply(): ListServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServerInfos(value: ServerDetails): Self = StObject.set(x, "serverInfos", value.asInstanceOf[js.Any])
    
    inline def setServerInfosUndefined: Self = StObject.set(x, "serverInfos", js.undefined)
    
    inline def setServerInfosVarargs(value: ServerDetail*): Self = StObject.set(x, "serverInfos", js.Array(value*))
  }
}

package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkgroupsResponse extends StObject {
  
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. To retrieve the next page, make the call again using the returned token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The returned array of workgroups.
    */
  var workgroups: WorkgroupList
}
object ListWorkgroupsResponse {
  
  inline def apply(workgroups: WorkgroupList): ListWorkgroupsResponse = {
    val __obj = js.Dynamic.literal(workgroups = workgroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkgroupsResponse]
  }
  
  extension [Self <: ListWorkgroupsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkgroups(value: WorkgroupList): Self = StObject.set(x, "workgroups", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupsVarargs(value: Workgroup*): Self = StObject.set(x, "workgroups", js.Array(value*))
  }
}

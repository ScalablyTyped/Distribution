package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityConfigsRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results. The default is 20.
    */
  var maxResults: js.UndefOr[ListSecurityConfigsRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListSecurityConfigs operation returns a nextToken, you can include the returned nextToken in subsequent ListSecurityConfigs operations, which returns results in the next page. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of security configuration.
    */
  var `type`: SecurityConfigType
}
object ListSecurityConfigsRequest {
  
  inline def apply(`type`: SecurityConfigType): ListSecurityConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityConfigsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityConfigsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSecurityConfigsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setType(value: SecurityConfigType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

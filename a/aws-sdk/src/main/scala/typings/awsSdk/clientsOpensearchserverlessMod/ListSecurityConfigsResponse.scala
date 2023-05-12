package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityConfigsResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the security configurations in your account.
    */
  var securityConfigSummaries: js.UndefOr[SecurityConfigSummaries] = js.undefined
}
object ListSecurityConfigsResponse {
  
  inline def apply(): ListSecurityConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSecurityConfigSummaries(value: SecurityConfigSummaries): Self = StObject.set(x, "securityConfigSummaries", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigSummariesUndefined: Self = StObject.set(x, "securityConfigSummaries", js.undefined)
    
    inline def setSecurityConfigSummariesVarargs(value: SecurityConfigSummary*): Self = StObject.set(x, "securityConfigSummaries", js.Array(value*))
  }
}

package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountId extends StObject {
  
  var accountId: String
  
  var apiId: String
  
  var queryString: String
  
  var requestId: String
  
  var variables: StringDictionary[Any]
}
object AccountId {
  
  inline def apply(
    accountId: String,
    apiId: String,
    queryString: String,
    requestId: String,
    variables: StringDictionary[Any]
  ): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], apiId = apiId.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
  
  extension [Self <: AccountId](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}

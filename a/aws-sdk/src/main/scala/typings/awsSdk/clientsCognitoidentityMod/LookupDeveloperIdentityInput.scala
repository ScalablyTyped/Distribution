package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupDeveloperIdentityInput extends StObject {
  
  /**
    * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity provider would issue many developer user identifiers, in keeping with the number of users.
    */
  var DeveloperUserIdentifier: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.DeveloperUserIdentifier] = js.undefined
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId
  
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.undefined
  
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object LookupDeveloperIdentityInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
  
  extension [Self <: LookupDeveloperIdentityInput](x: Self) {
    
    inline def setDeveloperUserIdentifier(value: DeveloperUserIdentifier): Self = StObject.set(x, "DeveloperUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUserIdentifierUndefined: Self = StObject.set(x, "DeveloperUserIdentifier", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: QueryLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

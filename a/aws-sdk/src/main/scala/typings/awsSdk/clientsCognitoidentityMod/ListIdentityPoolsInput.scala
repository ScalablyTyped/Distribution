package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoolsInput extends StObject {
  
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object ListIdentityPoolsInput {
  
  inline def apply(MaxResults: QueryLimit): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIdentityPoolsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: QueryLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

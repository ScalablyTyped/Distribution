package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCrlsResponse extends StObject {
  
  /**
    * A list of certificate revocation lists (CRL). 
    */
  var crls: js.UndefOr[CrlDetails] = js.undefined
  
  /**
    * A token that indicates where the output should continue from, if a previous operation did not show all results. To get the next results, call the operation again with this value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListCrlsResponse {
  
  inline def apply(): ListCrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCrlsResponse]
  }
  
  extension [Self <: ListCrlsResponse](x: Self) {
    
    inline def setCrls(value: CrlDetails): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: CrlDetail*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

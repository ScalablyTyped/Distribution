package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePrincipalIdFormatResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the ID format settings for the ARN.
    */
  var Principals: js.UndefOr[PrincipalIdFormatList] = js.undefined
}
object DescribePrincipalIdFormatResult {
  
  inline def apply(): DescribePrincipalIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrincipalIdFormatResult]
  }
  
  extension [Self <: DescribePrincipalIdFormatResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrincipals(value: PrincipalIdFormatList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "Principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: PrincipalIdFormat*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}

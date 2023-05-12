package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessTrustProvidersResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The IDs of the Verified Access trust providers.
    */
  var VerifiedAccessTrustProviders: js.UndefOr[VerifiedAccessTrustProviderList] = js.undefined
}
object DescribeVerifiedAccessTrustProvidersResult {
  
  inline def apply(): DescribeVerifiedAccessTrustProvidersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessTrustProvidersResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessTrustProvidersResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessTrustProviders(value: VerifiedAccessTrustProviderList): Self = StObject.set(x, "VerifiedAccessTrustProviders", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProvidersUndefined: Self = StObject.set(x, "VerifiedAccessTrustProviders", js.undefined)
    
    inline def setVerifiedAccessTrustProvidersVarargs(value: VerifiedAccessTrustProvider*): Self = StObject.set(x, "VerifiedAccessTrustProviders", js.Array(value*))
  }
}

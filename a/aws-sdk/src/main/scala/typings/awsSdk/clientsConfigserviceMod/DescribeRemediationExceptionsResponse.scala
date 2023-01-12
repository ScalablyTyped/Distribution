package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationExceptionsResponse extends StObject {
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of remediation exception objects.
    */
  var RemediationExceptions: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.RemediationExceptions] = js.undefined
}
object DescribeRemediationExceptionsResponse {
  
  inline def apply(): DescribeRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRemediationExceptions(value: RemediationExceptions): Self = StObject.set(x, "RemediationExceptions", value.asInstanceOf[js.Any])
    
    inline def setRemediationExceptionsUndefined: Self = StObject.set(x, "RemediationExceptions", js.undefined)
    
    inline def setRemediationExceptionsVarargs(value: RemediationException*): Self = StObject.set(x, "RemediationExceptions", js.Array(value*))
  }
}

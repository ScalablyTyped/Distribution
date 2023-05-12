package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessInstanceLoggingConfigurationsResult extends StObject {
  
  /**
    * The current logging configuration for the Verified Access instances.
    */
  var LoggingConfigurations: js.UndefOr[VerifiedAccessInstanceLoggingConfigurationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeVerifiedAccessInstanceLoggingConfigurationsResult {
  
  inline def apply(): DescribeVerifiedAccessInstanceLoggingConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessInstanceLoggingConfigurationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessInstanceLoggingConfigurationsResult] (val x: Self) extends AnyVal {
    
    inline def setLoggingConfigurations(value: VerifiedAccessInstanceLoggingConfigurationList): Self = StObject.set(x, "LoggingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationsUndefined: Self = StObject.set(x, "LoggingConfigurations", js.undefined)
    
    inline def setLoggingConfigurationsVarargs(value: VerifiedAccessInstanceLoggingConfiguration*): Self = StObject.set(x, "LoggingConfigurations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

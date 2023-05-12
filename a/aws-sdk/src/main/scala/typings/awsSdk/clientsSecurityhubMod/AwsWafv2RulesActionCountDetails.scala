package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2RulesActionCountDetails extends StObject {
  
  /**
    *  Defines custom handling for the web request. For more information, see Customizing web requests and responses in WAF in the WAF Developer Guide.. 
    */
  var CustomRequestHandling: js.UndefOr[AwsWafv2CustomRequestHandlingDetails] = js.undefined
}
object AwsWafv2RulesActionCountDetails {
  
  inline def apply(): AwsWafv2RulesActionCountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2RulesActionCountDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2RulesActionCountDetails] (val x: Self) extends AnyVal {
    
    inline def setCustomRequestHandling(value: AwsWafv2CustomRequestHandlingDetails): Self = StObject.set(x, "CustomRequestHandling", value.asInstanceOf[js.Any])
    
    inline def setCustomRequestHandlingUndefined: Self = StObject.set(x, "CustomRequestHandling", js.undefined)
  }
}

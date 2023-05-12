package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2RulesActionDetails extends StObject {
  
  /**
    *  Instructs WAF to allow the web request. 
    */
  var Allow: js.UndefOr[AwsWafv2ActionAllowDetails] = js.undefined
  
  /**
    *  Instructs WAF to block the web request. 
    */
  var Block: js.UndefOr[AwsWafv2ActionBlockDetails] = js.undefined
  
  /**
    *  Instructs WAF to run a CAPTCHA check against the web request. 
    */
  var Captcha: js.UndefOr[AwsWafv2RulesActionCaptchaDetails] = js.undefined
  
  /**
    *  Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the web ACL. 
    */
  var Count: js.UndefOr[AwsWafv2RulesActionCountDetails] = js.undefined
}
object AwsWafv2RulesActionDetails {
  
  inline def apply(): AwsWafv2RulesActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2RulesActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2RulesActionDetails] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: AwsWafv2ActionAllowDetails): Self = StObject.set(x, "Allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "Allow", js.undefined)
    
    inline def setBlock(value: AwsWafv2ActionBlockDetails): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    
    inline def setCaptcha(value: AwsWafv2RulesActionCaptchaDetails): Self = StObject.set(x, "Captcha", value.asInstanceOf[js.Any])
    
    inline def setCaptchaUndefined: Self = StObject.set(x, "Captcha", js.undefined)
    
    inline def setCount(value: AwsWafv2RulesActionCountDetails): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}

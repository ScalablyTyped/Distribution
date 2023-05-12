package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails extends StObject {
  
  /**
    *  The amount of time, in seconds, that a CAPTCHA or challenge timestamp is considered valid by WAF. 
    */
  var ImmunityTime: js.UndefOr[Long] = js.undefined
}
object AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails {
  
  inline def apply(): AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails] (val x: Self) extends AnyVal {
    
    inline def setImmunityTime(value: Long): Self = StObject.set(x, "ImmunityTime", value.asInstanceOf[js.Any])
    
    inline def setImmunityTimeUndefined: Self = StObject.set(x, "ImmunityTime", js.undefined)
  }
}

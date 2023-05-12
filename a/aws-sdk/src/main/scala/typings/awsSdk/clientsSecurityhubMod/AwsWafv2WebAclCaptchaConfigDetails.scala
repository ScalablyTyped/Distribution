package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2WebAclCaptchaConfigDetails extends StObject {
  
  /**
    *  Determines how long a CAPTCHA timestamp in the token remains valid after the client successfully solves a CAPTCHA puzzle. 
    */
  var ImmunityTimeProperty: js.UndefOr[AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails] = js.undefined
}
object AwsWafv2WebAclCaptchaConfigDetails {
  
  inline def apply(): AwsWafv2WebAclCaptchaConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2WebAclCaptchaConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2WebAclCaptchaConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setImmunityTimeProperty(value: AwsWafv2WebAclCaptchaConfigImmunityTimePropertyDetails): Self = StObject.set(x, "ImmunityTimeProperty", value.asInstanceOf[js.Any])
    
    inline def setImmunityTimePropertyUndefined: Self = StObject.set(x, "ImmunityTimeProperty", js.undefined)
  }
}

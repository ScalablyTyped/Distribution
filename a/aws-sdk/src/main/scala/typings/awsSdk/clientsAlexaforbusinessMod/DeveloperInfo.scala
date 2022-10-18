package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeveloperInfo extends StObject {
  
  /**
    * The name of the developer.
    */
  var DeveloperName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DeveloperName] = js.undefined
  
  /**
    * The email of the developer.
    */
  var Email: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Email] = js.undefined
  
  /**
    * The URL of the privacy policy.
    */
  var PrivacyPolicy: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.PrivacyPolicy] = js.undefined
  
  /**
    * The website of the developer.
    */
  var Url: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Url] = js.undefined
}
object DeveloperInfo {
  
  inline def apply(): DeveloperInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperInfo]
  }
  
  extension [Self <: DeveloperInfo](x: Self) {
    
    inline def setDeveloperName(value: DeveloperName): Self = StObject.set(x, "DeveloperName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperNameUndefined: Self = StObject.set(x, "DeveloperName", js.undefined)
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setPrivacyPolicy(value: PrivacyPolicy): Self = StObject.set(x, "PrivacyPolicy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyPolicyUndefined: Self = StObject.set(x, "PrivacyPolicy", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}

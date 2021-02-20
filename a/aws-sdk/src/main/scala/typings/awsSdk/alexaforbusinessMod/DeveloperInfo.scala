package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperInfo extends StObject {
  
  /**
    * The name of the developer.
    */
  var DeveloperName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DeveloperName] = js.native
  
  /**
    * The email of the developer.
    */
  var Email: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Email] = js.native
  
  /**
    * The URL of the privacy policy.
    */
  var PrivacyPolicy: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PrivacyPolicy] = js.native
  
  /**
    * The website of the developer.
    */
  var Url: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Url] = js.native
}
object DeveloperInfo {
  
  @scala.inline
  def apply(): DeveloperInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperInfo]
  }
  
  @scala.inline
  implicit class DeveloperInfoMutableBuilder[Self <: DeveloperInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperName(value: DeveloperName): Self = StObject.set(x, "DeveloperName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperNameUndefined: Self = StObject.set(x, "DeveloperName", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setPrivacyPolicy(value: PrivacyPolicy): Self = StObject.set(x, "PrivacyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyPolicyUndefined: Self = StObject.set(x, "PrivacyPolicy", js.undefined)
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}

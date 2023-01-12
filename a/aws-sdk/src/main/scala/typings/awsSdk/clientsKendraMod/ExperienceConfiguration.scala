package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperienceConfiguration extends StObject {
  
  /**
    * The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the BatchPutDocument API. This is the content you want to use for your Amazon Kendra experience.
    */
  var ContentSourceConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.ContentSourceConfiguration] = js.undefined
  
  /**
    * The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
    */
  var UserIdentityConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.UserIdentityConfiguration] = js.undefined
}
object ExperienceConfiguration {
  
  inline def apply(): ExperienceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperienceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperienceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContentSourceConfiguration(value: ContentSourceConfiguration): Self = StObject.set(x, "ContentSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setContentSourceConfigurationUndefined: Self = StObject.set(x, "ContentSourceConfiguration", js.undefined)
    
    inline def setUserIdentityConfiguration(value: UserIdentityConfiguration): Self = StObject.set(x, "UserIdentityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityConfigurationUndefined: Self = StObject.set(x, "UserIdentityConfiguration", js.undefined)
  }
}

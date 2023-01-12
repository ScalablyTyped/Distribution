package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityConfiguration extends StObject {
  
  /**
    * The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This is used for user context filtering and for granting access to your Amazon Kendra experience. You must set up IAM Identity Center with Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into your index. For more information, see Getting started with an IAM Identity Center identity source.
    */
  var IdentityAttributeName: js.UndefOr[typings.awsSdk.clientsKendraMod.IdentityAttributeName] = js.undefined
}
object UserIdentityConfiguration {
  
  inline def apply(): UserIdentityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserIdentityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIdentityAttributeName(value: IdentityAttributeName): Self = StObject.set(x, "IdentityAttributeName", value.asInstanceOf[js.Any])
    
    inline def setIdentityAttributeNameUndefined: Self = StObject.set(x, "IdentityAttributeName", js.undefined)
  }
}

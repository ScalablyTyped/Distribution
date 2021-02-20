package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAttributes extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var userAttributes: StringMap = js.native
}
object UserAttributes {
  
  @scala.inline
  def apply(userAttributes: StringMap): UserAttributes = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAttributes]
  }
  
  @scala.inline
  implicit class UserAttributesMutableBuilder[Self <: UserAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}

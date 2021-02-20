package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewDeviceUsed extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var newDeviceUsed: Boolean = js.native
  
  var userAttributes: StringMap = js.native
}
object NewDeviceUsed {
  
  @scala.inline
  def apply(newDeviceUsed: Boolean, userAttributes: StringMap): NewDeviceUsed = {
    val __obj = js.Dynamic.literal(newDeviceUsed = newDeviceUsed.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDeviceUsed]
  }
  
  @scala.inline
  implicit class NewDeviceUsedMutableBuilder[Self <: NewDeviceUsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setNewDeviceUsed(value: Boolean): Self = StObject.set(x, "newDeviceUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}

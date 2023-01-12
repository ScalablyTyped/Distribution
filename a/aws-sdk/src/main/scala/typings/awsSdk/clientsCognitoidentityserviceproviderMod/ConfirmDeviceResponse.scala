package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmDeviceResponse extends StObject {
  
  /**
    * Indicates whether the user confirmation must confirm the device response.
    */
  var UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined
}
object ConfirmDeviceResponse {
  
  inline def apply(): ConfirmDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setUserConfirmationNecessary(value: BooleanType): Self = StObject.set(x, "UserConfirmationNecessary", value.asInstanceOf[js.Any])
    
    inline def setUserConfirmationNecessaryUndefined: Self = StObject.set(x, "UserConfirmationNecessary", js.undefined)
  }
}

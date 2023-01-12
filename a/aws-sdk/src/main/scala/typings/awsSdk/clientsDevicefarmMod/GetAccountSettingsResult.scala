package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsResult extends StObject {
  
  /**
    * The account settings.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.undefined
}
object GetAccountSettingsResult {
  
  inline def apply(): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSettingsResult] (val x: Self) extends AnyVal {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
  }
}

package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsOutput extends StObject {
  
  /**
    * The Proton pipeline service role detail data that's returned by Proton.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.undefined
}
object GetAccountSettingsOutput {
  
  inline def apply(): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
  }
}

package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsOutput extends StObject {
  
  /**
    * A structure that displays the status of the optional features in the account.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.AccountSettings] = js.undefined
}
object UpdateAccountSettingsOutput {
  
  inline def apply(): UpdateAccountSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAccountSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "AccountSettings", js.undefined)
  }
}

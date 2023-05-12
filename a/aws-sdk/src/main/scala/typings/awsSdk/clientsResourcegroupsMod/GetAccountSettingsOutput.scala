package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsOutput extends StObject {
  
  /**
    * The current settings for the optional features in Resource Groups.
    */
  var AccountSettings: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.AccountSettings] = js.undefined
}
object GetAccountSettingsOutput {
  
  inline def apply(): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setAccountSettings(value: AccountSettings): Self = StObject.set(x, "AccountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "AccountSettings", js.undefined)
  }
}

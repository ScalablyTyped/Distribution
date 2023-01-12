package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSendingEnabledResponse extends StObject {
  
  /**
    * Describes whether email sending is enabled or disabled for your Amazon SES account in the current AWS Region.
    */
  var Enabled: js.UndefOr[typings.awsSdk.clientsSesMod.Enabled] = js.undefined
}
object GetAccountSendingEnabledResponse {
  
  inline def apply(): GetAccountSendingEnabledResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSendingEnabledResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSendingEnabledResponse] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}

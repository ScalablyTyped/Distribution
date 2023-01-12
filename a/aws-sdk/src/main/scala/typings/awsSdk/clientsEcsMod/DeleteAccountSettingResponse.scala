package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountSettingResponse extends StObject {
  
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.undefined
}
object DeleteAccountSettingResponse {
  
  inline def apply(): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccountSettingResponse] (val x: Self) extends AnyVal {
    
    inline def setSetting(value: Setting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}

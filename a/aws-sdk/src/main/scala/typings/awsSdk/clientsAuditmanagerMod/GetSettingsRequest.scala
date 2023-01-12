package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSettingsRequest extends StObject {
  
  /**
    *  The list of SettingAttribute enum values. 
    */
  var attribute: SettingAttribute
}
object GetSettingsRequest {
  
  inline def apply(attribute: SettingAttribute): GetSettingsRequest = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: SettingAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
  }
}

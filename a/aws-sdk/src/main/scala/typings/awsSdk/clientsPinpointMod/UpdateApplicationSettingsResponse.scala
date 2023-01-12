package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typings.awsSdk.clientsPinpointMod.ApplicationSettingsResource
}
object UpdateApplicationSettingsResponse {
  
  inline def apply(ApplicationSettingsResource: ApplicationSettingsResource): UpdateApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}

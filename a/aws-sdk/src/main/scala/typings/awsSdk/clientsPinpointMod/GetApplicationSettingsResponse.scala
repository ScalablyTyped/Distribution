package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationSettingsResponse extends StObject {
  
  var ApplicationSettingsResource: typings.awsSdk.clientsPinpointMod.ApplicationSettingsResource
}
object GetApplicationSettingsResponse {
  
  inline def apply(ApplicationSettingsResource: ApplicationSettingsResource): GetApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationSettingsResource(value: ApplicationSettingsResource): Self = StObject.set(x, "ApplicationSettingsResource", value.asInstanceOf[js.Any])
  }
}

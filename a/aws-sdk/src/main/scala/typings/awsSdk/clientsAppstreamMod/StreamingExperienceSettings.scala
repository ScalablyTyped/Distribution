package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingExperienceSettings extends StObject {
  
  /**
    * The preferred protocol that you want to use while streaming your application.
    */
  var PreferredProtocol: js.UndefOr[typings.awsSdk.clientsAppstreamMod.PreferredProtocol] = js.undefined
}
object StreamingExperienceSettings {
  
  inline def apply(): StreamingExperienceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingExperienceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingExperienceSettings] (val x: Self) extends AnyVal {
    
    inline def setPreferredProtocol(value: PreferredProtocol): Self = StObject.set(x, "PreferredProtocol", value.asInstanceOf[js.Any])
    
    inline def setPreferredProtocolUndefined: Self = StObject.set(x, "PreferredProtocol", js.undefined)
  }
}

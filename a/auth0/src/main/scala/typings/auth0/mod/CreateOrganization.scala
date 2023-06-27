package typings.auth0.mod

import typings.auth0.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganization extends StObject {
  
  var branding: js.UndefOr[Colors] = js.undefined
  
  var display_name: js.UndefOr[String] = js.undefined
  
  var enabled_connections: js.UndefOr[js.Array[AddOrganizationEnabledConnection]] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var name: String
}
object CreateOrganization {
  
  inline def apply(name: String): CreateOrganization = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrganization] (val x: Self) extends AnyVal {
    
    inline def setBranding(value: Colors): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setEnabled_connections(value: js.Array[AddOrganizationEnabledConnection]): Self = StObject.set(x, "enabled_connections", value.asInstanceOf[js.Any])
    
    inline def setEnabled_connectionsUndefined: Self = StObject.set(x, "enabled_connections", js.undefined)
    
    inline def setEnabled_connectionsVarargs(value: AddOrganizationEnabledConnection*): Self = StObject.set(x, "enabled_connections", js.Array(value*))
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

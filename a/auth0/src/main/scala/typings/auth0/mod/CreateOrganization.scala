package typings.auth0.mod

import typings.auth0.anon.Colors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganization extends StObject {
  
  var branding: js.UndefOr[Colors] = js.undefined
  
  var display_name: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var name: String
}
object CreateOrganization {
  
  inline def apply(name: String): CreateOrganization = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganization]
  }
  
  extension [Self <: CreateOrganization](x: Self) {
    
    inline def setBranding(value: Colors): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

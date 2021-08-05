package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  var resource: String
  
  var tech: String
}
object Resource {
  
  inline def apply(resource: String, tech: String): Resource = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTech(value: String): Self = StObject.set(x, "tech", value.asInstanceOf[js.Any])
  }
}

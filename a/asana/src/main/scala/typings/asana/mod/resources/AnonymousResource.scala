package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousResource extends StObject {
  
  var gid: String
  
  var resource_subtype: js.UndefOr[String] = js.undefined
  
  var resource_type: String
}
object AnonymousResource {
  
  inline def apply(gid: String, resource_type: String): AnonymousResource = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousResource] (val x: Self) extends AnyVal {
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
    
    inline def setResource_subtypeUndefined: Self = StObject.set(x, "resource_subtype", js.undefined)
    
    inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
  }
}

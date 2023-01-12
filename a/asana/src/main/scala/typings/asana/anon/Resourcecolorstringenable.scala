package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Resource & {  color :string,   enabled :boolean} */
trait Resourcecolorstringenable extends StObject {
  
  var color: String
  
  var enabled: Boolean
  
  var gid: String
  
  var name: String
  
  var resource_subtype: js.UndefOr[String] = js.undefined
  
  var resource_type: String
}
object Resourcecolorstringenable {
  
  inline def apply(color: String, enabled: Boolean, gid: String, name: String, resource_type: String): Resourcecolorstringenable = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resourcecolorstringenable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resourcecolorstringenable] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
    
    inline def setResource_subtypeUndefined: Self = StObject.set(x, "resource_subtype", js.undefined)
    
    inline def setResource_type(value: String): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
  }
}

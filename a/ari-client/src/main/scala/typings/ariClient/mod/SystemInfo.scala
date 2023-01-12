package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfo extends StObject {
  
  /**
    * Entity_id.
    */
  var entity_id: String
  
  /**
    * Asterisk version.
    */
  var version: String
}
object SystemInfo {
  
  inline def apply(entity_id: String, version: String): SystemInfo = {
    val __obj = js.Dynamic.literal(entity_id = entity_id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfo] (val x: Self) extends AnyVal {
    
    inline def setEntity_id(value: String): Self = StObject.set(x, "entity_id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

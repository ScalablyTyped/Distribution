package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /**
    * The description of this module.
    */
  var description: String
  
  /**
    * The name of this module.
    */
  var name: String
  
  /**
    * The running status of this module.
    */
  var status: String
  
  /**
    * The support state of this module.
    */
  var support_level: String
  
  /**
    * The number of times this module is being used.
    */
  var use_count: Double
}
object Module {
  
  inline def apply(description: String, name: String, status: String, support_level: String, use_count: Double): Module = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], support_level = support_level.asInstanceOf[js.Any], use_count = use_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupport_level(value: String): Self = StObject.set(x, "support_level", value.asInstanceOf[js.Any])
    
    inline def setUse_count(value: Double): Self = StObject.set(x, "use_count", value.asInstanceOf[js.Any])
  }
}

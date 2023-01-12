package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclarePipeFacade extends StObject {
  
  var isStandalone: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var pure: js.UndefOr[Boolean] = js.undefined
  
  var `type`: Type2
}
object R3DeclarePipeFacade {
  
  inline def apply(name: String, `type`: Type2): R3DeclarePipeFacade = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclarePipeFacade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclarePipeFacade] (val x: Self) extends AnyVal {
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsStandaloneUndefined: Self = StObject.set(x, "isStandalone", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

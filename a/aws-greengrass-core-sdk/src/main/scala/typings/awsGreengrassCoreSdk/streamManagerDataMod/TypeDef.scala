package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.awsGreengrassCoreSdk.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDef extends StObject {
  
  var subtype: Instantiable | Null
  
  var `type`: Instantiable
}
object TypeDef {
  
  inline def apply(`type`: Instantiable): TypeDef = {
    val __obj = js.Dynamic.literal(subtype = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDef]
  }
  
  extension [Self <: TypeDef](x: Self) {
    
    inline def setSubtype(value: Instantiable): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeNull: Self = StObject.set(x, "subtype", null)
    
    inline def setType(value: Instantiable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

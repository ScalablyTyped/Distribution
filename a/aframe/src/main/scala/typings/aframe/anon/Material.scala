package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  var material: js.Object
}
object Material {
  
  inline def apply(material: js.Object): Material = {
    val __obj = js.Dynamic.literal(material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
    
    inline def setMaterial(value: js.Object): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}

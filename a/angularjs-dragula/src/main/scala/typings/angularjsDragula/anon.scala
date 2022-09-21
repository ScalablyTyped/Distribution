package typings.angularjsDragula

import typings.dragula.mod.Drake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<angularjs-dragula.angularjs-dragula.angular.dragula.Bag> */
  trait ReadonlyBag extends StObject {
    
    val drake: Drake
    
    val name: String
  }
  object ReadonlyBag {
    
    inline def apply(drake: Drake, name: String): ReadonlyBag = {
      val __obj = js.Dynamic.literal(drake = drake.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyBag]
    }
    
    extension [Self <: ReadonlyBag](x: Self) {
      
      inline def setDrake(value: Drake): Self = StObject.set(x, "drake", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

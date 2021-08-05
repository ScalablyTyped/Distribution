package typings.athenajs.mod

import typings.athenajs.anon.InstantiableEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FXInstance extends StObject {
  
  def addFX(fxName: String, FxClass: InstantiableEffect): Unit
}
object FXInstance {
  
  inline def apply(addFX: (String, InstantiableEffect) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
    __obj.asInstanceOf[FXInstance]
  }
  
  extension [Self <: FXInstance](x: Self) {
    
    inline def setAddFX(value: (String, InstantiableEffect) => Unit): Self = StObject.set(x, "addFX", js.Any.fromFunction2(value))
  }
}

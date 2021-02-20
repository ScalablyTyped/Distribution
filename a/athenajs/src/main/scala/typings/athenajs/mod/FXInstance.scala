package typings.athenajs.mod

import typings.athenajs.anon.InstantiableEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FXInstance extends StObject {
  
  def addFX(fxName: String, FxClass: InstantiableEffect): Unit = js.native
}
object FXInstance {
  
  @scala.inline
  def apply(addFX: (String, InstantiableEffect) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
    __obj.asInstanceOf[FXInstance]
  }
  
  @scala.inline
  implicit class FXInstanceMutableBuilder[Self <: FXInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFX(value: (String, InstantiableEffect) => Unit): Self = StObject.set(x, "addFX", js.Any.fromFunction2(value))
  }
}

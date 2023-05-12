package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * The name of the DOM property to which the output property is bound.
    */
  var alias: js.UndefOr[String] = js.undefined
}
object Output {
  
  @JSImport("@angular/core", "Output")
  @js.native
  val ^ : OutputDecorator = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
  }
}

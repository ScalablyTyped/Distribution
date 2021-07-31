package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * The name of the DOM property to which the output property is bound.
    */
  var bindingPropertyName: js.UndefOr[String] = js.undefined
}
object Output {
  
  @JSImport("@angular/core", "Output")
  @js.native
  val ^ : OutputDecorator = js.native
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingPropertyName(value: String): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingPropertyNameUndefined: Self = StObject.set(x, "bindingPropertyName", js.undefined)
  }
}

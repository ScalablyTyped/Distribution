package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * The name of the attribute whose value can be injected.
    */
  var attributeName: String
}
object Attribute {
  
  @JSImport("@angular/core", "Attribute")
  @js.native
  val ^ : AttributeDecorator = js.native
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
  }
}

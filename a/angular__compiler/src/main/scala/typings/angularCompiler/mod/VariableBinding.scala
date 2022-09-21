package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "VariableBinding")
@js.native
open class VariableBinding protected ()
  extends StObject
     with TemplateBinding {
  /**
    * @param sourceSpan entire span of the binding.
    * @param key name of the LHS along with its span.
    * @param value optional value for the RHS along with its span.
    */
  def this(sourceSpan: AbsoluteSourceSpan, key: TemplateBindingIdentifier) = this()
  def this(sourceSpan: AbsoluteSourceSpan, key: TemplateBindingIdentifier, value: TemplateBindingIdentifier) = this()
  
  val key: TemplateBindingIdentifier = js.native
  
  val sourceSpan: AbsoluteSourceSpan = js.native
  
  val value: TemplateBindingIdentifier | Null = js.native
}

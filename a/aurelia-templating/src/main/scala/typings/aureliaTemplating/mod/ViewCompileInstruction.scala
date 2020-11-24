package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewCompileInstruction")
@js.native
/**
  * Creates an instance of ViewCompileInstruction.
  * @param targetShadowDOM Should the compilation target the Shadow DOM.
  * @param compileSurrogate Should the compilation also include surrogate bindings and behaviors.
  */
class ViewCompileInstruction () extends js.Object {
  def this(targetShadowDOM: Boolean) = this()
  def this(targetShadowDOM: js.UndefOr[scala.Nothing], compileSurrogate: Boolean) = this()
  def this(targetShadowDOM: Boolean, compileSurrogate: Boolean) = this()
  
  var associatedModuleId: js.Any = js.native
  
  var compileSurrogate: Boolean = js.native
  
  var targetShadowDOM: Boolean = js.native
}
/* static members */
@JSImport("aurelia-templating", "ViewCompileInstruction")
@js.native
object ViewCompileInstruction extends js.Object {
  
  /**
    * The normal configuration for view compilation.
    */
  var normal: ViewCompileInstruction = js.native
}

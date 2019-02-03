package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ViewCompileInstruction")
@js.native
/**
  * Creates an instance of ViewCompileInstruction.
  * @param targetShadowDOM Should the compilation target the Shadow DOM.
  * @param compileSurrogate Should the compilation also include surrogate bindings and behaviors.
  */
class ViewCompileInstruction () extends js.Object {
  def this(targetShadowDOM: scala.Boolean) = this()
  def this(targetShadowDOM: scala.Boolean, compileSurrogate: scala.Boolean) = this()
  var associatedModuleId: js.Any = js.native
  var compileSurrogate: scala.Boolean = js.native
  var targetShadowDOM: scala.Boolean = js.native
}

/* static members */
@JSImport("aurelia-templating", "ViewCompileInstruction")
@js.native
object ViewCompileInstruction extends js.Object {
  /**
    * The normal configuration for view compilation.
    */
  var normal: aureliaDashTemplatingLib.aureliaDashTemplatingMod.ViewCompileInstruction = js.native
}


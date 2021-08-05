package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewCompileInstruction")
@js.native
/**
  * Creates an instance of ViewCompileInstruction.
  * @param targetShadowDOM Should the compilation target the Shadow DOM.
  * @param compileSurrogate Should the compilation also include surrogate bindings and behaviors.
  */
class ViewCompileInstruction () extends StObject {
  def this(targetShadowDOM: Boolean) = this()
  def this(targetShadowDOM: Boolean, compileSurrogate: Boolean) = this()
  def this(targetShadowDOM: Unit, compileSurrogate: Boolean) = this()
  
  var associatedModuleId: js.Any = js.native
  
  var compileSurrogate: Boolean = js.native
  
  var targetShadowDOM: Boolean = js.native
}
/* static members */
object ViewCompileInstruction {
  
  @JSImport("aurelia-templating", "ViewCompileInstruction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The normal configuration for view compilation.
    */
  @JSImport("aurelia-templating", "ViewCompileInstruction.normal")
  @js.native
  def normal: ViewCompileInstruction = js.native
  inline def normal_=(x: ViewCompileInstruction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
}

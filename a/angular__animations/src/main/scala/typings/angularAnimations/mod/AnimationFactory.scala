package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/animations", "AnimationFactory")
@js.native
open class AnimationFactory () extends StObject {
  
  /**
    * Creates an `AnimationPlayer` instance for the reusable animation defined by
    * the <code>[AnimationBuilder.build](api/animations/AnimationBuilder#build)()</code>
    * method that created this factory and attaches the new player a DOM element.
    *
    * @param element The DOM element to which to attach the player.
    * @param options A set of options that can include a time delay and
    * additional developer-defined parameters.
    */
  def create(element: Any): AnimationPlayer = js.native
  def create(element: Any, options: AnimationOptions): AnimationPlayer = js.native
}

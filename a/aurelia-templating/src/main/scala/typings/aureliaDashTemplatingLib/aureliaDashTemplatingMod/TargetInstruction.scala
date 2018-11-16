package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "TargetInstruction")
@js.native
class TargetInstruction () extends js.Object {
  var anchorIsContainer: scala.Boolean = js.native
  var behaviorInstructions: js.Array[BehaviorInstruction] = js.native
  /**
       * Indicates if this instruction is targeting a text node
       */
  var contentExpression: js.Any = js.native
  var elementInstruction: BehaviorInstruction = js.native
  var expressions: js.Array[js.Object] = js.native
  var injectorId: scala.Double = js.native
  /**
       * Indicates if this instruction is a let element instruction
       */
  var letElement: scala.Boolean = js.native
  var lifting: scala.Boolean = js.native
  var parentInjectorId: scala.Double = js.native
  var providers: js.Array[js.Function] = js.native
  var shadowSlot: scala.Boolean = js.native
  var slotFallbackFactory: js.Any = js.native
  var slotName: java.lang.String = js.native
  var values: js.Object = js.native
  var viewFactory: ViewFactory = js.native
}

@JSImport("aurelia-templating", "TargetInstruction")
@js.native
object TargetInstruction extends js.Object {
  /**
      * An empty array used to represent a target with no binding expressions.
      */
  var noExpressions: js.Any = js.native
  /**
      * Creates an instruction that represents a binding expression in the content of an element.
      * @param expression The binding expression.
      * @return The created instruction.
      */
  def contentExpression(): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents a binding expression in the content of an element.
      * @param expression The binding expression.
      * @return The created instruction.
      */
  def contentExpression(expression: js.Any): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents an element with behaviors and bindings.
      * @param injectorId The id of the dependency injection container.
      * @param parentInjectorId The id of the parent dependency injection container.
      * @param providers The types which will provide behavior for this element.
      * @param behaviorInstructions The instructions for creating behaviors on this element.
      * @param expressions Bindings, listeners, triggers, etc.
      * @param elementInstruction The element behavior for this element.
      * @return The created instruction.
      */
  def letElement(expressions: js.Array[js.Object]): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents content that was lifted out of the DOM and into a ViewFactory.
      * @param parentInjectorId The id of the parent dependency injection container.
      * @param liftingInstruction The behavior instruction of the lifting behavior.
      * @return The created instruction.
      */
  def lifting(
    parentInjectorId: scala.Double,
    liftingInstruction: aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents an element with behaviors and bindings.
      * @param injectorId The id of the dependency injection container.
      * @param parentInjectorId The id of the parent dependency injection container.
      * @param providers The types which will provide behavior for this element.
      * @param behaviorInstructions The instructions for creating behaviors on this element.
      * @param expressions Bindings, listeners, triggers, etc.
      * @param elementInstruction The element behavior for this element.
      * @return The created instruction.
      */
  def normal(
    injectorId: scala.Double,
    parentInjectorId: scala.Double,
    providers: js.Array[js.Function],
    behaviorInstructions: js.Array[aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction],
    expressions: js.Array[js.Object],
    elementInstruction: aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents a shadow dom slot.
      * @param parentInjectorId The id of the parent dependency injection container.
      * @return The created instruction.
      */
  def shadowSlot(parentInjectorId: scala.Double): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
  /**
      * Creates an instruction that represents the surrogate behaviors and bindings for an element.
      * @param providers The types which will provide behavior for this element.
      * @param behaviorInstructions The instructions for creating behaviors on this element.
      * @param expressions Bindings, listeners, triggers, etc.
      * @param values A key/value lookup of attributes to transplant.
      * @return The created instruction.
      */
  def surrogate(
    providers: js.Array[js.Function],
    behaviorInstructions: js.Array[aureliaDashTemplatingLib.aureliaDashTemplatingMod.BehaviorInstruction],
    expressions: js.Array[js.Object],
    values: js.Object
  ): aureliaDashTemplatingLib.aureliaDashTemplatingMod.TargetInstruction = js.native
}


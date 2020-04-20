package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All implicit instruction state is stored here.
  *
  * It is useful to have a single object where all of the state is stored as a mental model
  * (rather it being spread across many different variables.)
  *
  * PERF NOTE: Turns out that writing to a true global variable is slower than
  * having an intermediate object with properties.
  */
trait InstructionState extends js.Object {
  /**
    * Stores whether directives should be matched to elements.
    *
    * When template contains `ngNonBindable` then we need to prevent the runtime from matching
    * directives on children of that element.
    *
    * Example:
    * ```
    * <my-comp my-directive>
    *   Should match component / directive.
    * </my-comp>
    * <div ngNonBindable>
    *   <my-comp my-directive>
    *     Should not match component / directive because we are in ngNonBindable.
    *   </my-comp>
    * </div>
    * ```
    */
  var bindingsEnabled: Boolean
  /**
    * In this mode, any changes in bindings will throw an ExpressionChangedAfterChecked error.
    *
    * Necessary to support ChangeDetectorRef.checkNoChanges().
    */
  var checkNoChangesMode: Boolean
  /**
    * Current `LFrame`
    *
    * `null` if we have not called `enterView`
    */
  var lFrame: LFrame
}

object InstructionState {
  @scala.inline
  def apply(bindingsEnabled: Boolean, checkNoChangesMode: Boolean, lFrame: LFrame): InstructionState = {
    val __obj = js.Dynamic.literal(bindingsEnabled = bindingsEnabled.asInstanceOf[js.Any], checkNoChangesMode = checkNoChangesMode.asInstanceOf[js.Any], lFrame = lFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionState]
  }
}


package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All implicit instruction state is stored here.
  *
  * It is useful to have a single object where all of the state is stored as a mental model
  * (rather it being spread across many different variables.)
  *
  * PERF NOTE: Turns out that writing to a true global variable is slower than
  * having an intermediate object with properties.
  */
@js.native
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
  var bindingsEnabled: Boolean = js.native
  /**
    * In this mode, any changes in bindings will throw an ExpressionChangedAfterChecked error.
    *
    * Necessary to support ChangeDetectorRef.checkNoChanges().
    */
  var checkNoChangesMode: Boolean = js.native
  /**
    * Current `LFrame`
    *
    * `null` if we have not called `enterView`
    */
  var lFrame: LFrame = js.native
}

object InstructionState {
  @scala.inline
  def apply(bindingsEnabled: Boolean, checkNoChangesMode: Boolean, lFrame: LFrame): InstructionState = {
    val __obj = js.Dynamic.literal(bindingsEnabled = bindingsEnabled.asInstanceOf[js.Any], checkNoChangesMode = checkNoChangesMode.asInstanceOf[js.Any], lFrame = lFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionState]
  }
  @scala.inline
  implicit class InstructionStateOps[Self <: InstructionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindingsEnabled(value: Boolean): Self = this.set("bindingsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckNoChangesMode(value: Boolean): Self = this.set("checkNoChangesMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLFrame(value: LFrame): Self = this.set("lFrame", value.asInstanceOf[js.Any])
  }
  
}


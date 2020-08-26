package typings.angularCompiler.stylingBuilderMod

import typings.angularCompiler.outputAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylingInstruction extends js.Object {
  /** Calls to individual styling instructions. Used when chaining calls to the same instruction. */
  var calls: js.Array[StylingInstructionCall] = js.native
  var reference: ExternalReference = js.native
}

object StylingInstruction {
  @scala.inline
  def apply(calls: js.Array[StylingInstructionCall], reference: ExternalReference): StylingInstruction = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstruction]
  }
  @scala.inline
  implicit class StylingInstructionOps[Self <: StylingInstruction] (val x: Self) extends AnyVal {
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
    def setCallsVarargs(value: StylingInstructionCall*): Self = this.set("calls", js.Array(value :_*))
    @scala.inline
    def setCalls(value: js.Array[StylingInstructionCall]): Self = this.set("calls", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: ExternalReference): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
  
}


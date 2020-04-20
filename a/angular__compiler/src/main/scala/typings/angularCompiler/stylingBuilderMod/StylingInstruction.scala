package typings.angularCompiler.stylingBuilderMod

import typings.angularCompiler.outputAstMod.ExternalReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylingInstruction extends js.Object {
  /** Calls to individual styling instructions. Used when chaining calls to the same instruction. */
  var calls: js.Array[StylingInstructionCall]
  var reference: ExternalReference
}

object StylingInstruction {
  @scala.inline
  def apply(calls: js.Array[StylingInstructionCall], reference: ExternalReference): StylingInstruction = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstruction]
  }
}


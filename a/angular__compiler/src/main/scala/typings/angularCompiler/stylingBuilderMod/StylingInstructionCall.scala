package typings.angularCompiler.stylingBuilderMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylingInstructionCall extends js.Object {
  var allocateBindingSlots: Double
  var sourceSpan: ParseSourceSpan | Null
  var supportsInterpolation: Boolean
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression]
}

object StylingInstructionCall {
  @scala.inline
  def apply(
    allocateBindingSlots: Double,
    params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression],
    supportsInterpolation: Boolean,
    sourceSpan: ParseSourceSpan = null
  ): StylingInstructionCall = {
    val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], params = js.Any.fromFunction1(params), supportsInterpolation = supportsInterpolation.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstructionCall]
  }
}


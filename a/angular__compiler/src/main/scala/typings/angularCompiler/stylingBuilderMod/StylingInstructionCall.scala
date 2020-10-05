package typings.angularCompiler.stylingBuilderMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylingInstructionCall extends js.Object {
  var allocateBindingSlots: Double = js.native
  var sourceSpan: ParseSourceSpan | Null = js.native
  var supportsInterpolation: Boolean = js.native
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression] = js.native
}

object StylingInstructionCall {
  @scala.inline
  def apply(
    allocateBindingSlots: Double,
    params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression],
    supportsInterpolation: Boolean
  ): StylingInstructionCall = {
    val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], params = js.Any.fromFunction1(params), supportsInterpolation = supportsInterpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstructionCall]
  }
  @scala.inline
  implicit class StylingInstructionCallOps[Self <: StylingInstructionCall] (val x: Self) extends AnyVal {
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
    def setAllocateBindingSlots(value: Double): Self = this.set("allocateBindingSlots", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression]): Self = this.set("params", js.Any.fromFunction1(value))
    @scala.inline
    def setSupportsInterpolation(value: Boolean): Self = this.set("supportsInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSpanNull: Self = this.set("sourceSpan", null)
  }
  
}


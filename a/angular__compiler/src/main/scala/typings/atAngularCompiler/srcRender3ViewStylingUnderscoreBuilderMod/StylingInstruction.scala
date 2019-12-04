package typings.atAngularCompiler.srcRender3ViewStylingUnderscoreBuilderMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylingInstruction extends js.Object {
  var allocateBindingSlots: Double
  var reference: ExternalReference
  var sourceSpan: ParseSourceSpan | Null
  var supportsInterpolation: js.UndefOr[Boolean] = js.undefined
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression]
}

object StylingInstruction {
  @scala.inline
  def apply(
    allocateBindingSlots: Double,
    params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression],
    reference: ExternalReference,
    sourceSpan: ParseSourceSpan = null,
    supportsInterpolation: js.UndefOr[Boolean] = js.undefined
  ): StylingInstruction = {
    val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], params = js.Any.fromFunction1(params), reference = reference.asInstanceOf[js.Any])
    if (sourceSpan != null) __obj.updateDynamic("sourceSpan")(sourceSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsInterpolation)) __obj.updateDynamic("supportsInterpolation")(supportsInterpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstruction]
  }
}


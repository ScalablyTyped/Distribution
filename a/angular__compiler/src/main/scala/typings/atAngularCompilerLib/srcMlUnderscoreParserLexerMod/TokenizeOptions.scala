package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
  /** How to tokenize interpolation markers. */
  var interpolationConfig: js.UndefOr[
    atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ] = js.undefined
  /** Whether to tokenize ICU messages (considered as text nodes when false). */
  var tokenizeExpansionForms: js.UndefOr[scala.Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = null,
    tokenizeExpansionForms: js.UndefOr[scala.Boolean] = js.undefined
  ): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig)
    if (!js.isUndefined(tokenizeExpansionForms)) __obj.updateDynamic("tokenizeExpansionForms")(tokenizeExpansionForms)
    __obj.asInstanceOf[TokenizeOptions]
  }
}


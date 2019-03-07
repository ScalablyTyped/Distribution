package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTemplateOptions extends js.Object {
  /**
    * How to parse interpolation markers.
    */
  var interpolationConfig: js.UndefOr[
    atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ] = js.undefined
  /**
    * Include whitespace nodes in the parsed output.
    */
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseTemplateOptions {
  @scala.inline
  def apply(
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    __obj.asInstanceOf[ParseTemplateOptions]
  }
}


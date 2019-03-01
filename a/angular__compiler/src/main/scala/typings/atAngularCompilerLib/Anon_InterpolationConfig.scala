package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InterpolationConfig extends js.Object {
  var interpolationConfig: js.UndefOr[
    atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ] = js.undefined
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_InterpolationConfig {
  @scala.inline
  def apply(
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_InterpolationConfig = {
    val __obj = js.Dynamic.literal()
    if (interpolationConfig != null) __obj.updateDynamic("interpolationConfig")(interpolationConfig)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    __obj.asInstanceOf[Anon_InterpolationConfig]
  }
}


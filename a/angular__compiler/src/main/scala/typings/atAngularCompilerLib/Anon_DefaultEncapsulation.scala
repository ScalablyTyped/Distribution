package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEncapsulation extends js.Object {
  var defaultEncapsulation: js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewEncapsulation] = js.undefined
  var jitDevMode: js.UndefOr[scala.Boolean] = js.undefined
  var missingTranslation: js.UndefOr[atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy | scala.Null] = js.undefined
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  var strictInjectionParameters: js.UndefOr[scala.Boolean] = js.undefined
  var useJit: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DefaultEncapsulation {
  @scala.inline
  def apply(
    defaultEncapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation = null,
    jitDevMode: js.UndefOr[scala.Boolean] = js.undefined,
    missingTranslation: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    strictInjectionParameters: js.UndefOr[scala.Boolean] = js.undefined,
    useJit: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    if (defaultEncapsulation != null) __obj.updateDynamic("defaultEncapsulation")(defaultEncapsulation)
    if (!js.isUndefined(jitDevMode)) __obj.updateDynamic("jitDevMode")(jitDevMode)
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (!js.isUndefined(strictInjectionParameters)) __obj.updateDynamic("strictInjectionParameters")(strictInjectionParameters)
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit)
    __obj.asInstanceOf[Anon_DefaultEncapsulation]
  }
}


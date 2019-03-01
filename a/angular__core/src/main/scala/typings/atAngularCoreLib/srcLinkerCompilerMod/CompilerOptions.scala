package typings
package atAngularCoreLib.srcLinkerCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerOptions extends js.Object {
  var defaultEncapsulation: js.UndefOr[atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation] = js.undefined
  var missingTranslation: js.UndefOr[atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy] = js.undefined
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  var providers: js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]] = js.undefined
  var useJit: js.UndefOr[scala.Boolean] = js.undefined
}

object CompilerOptions {
  @scala.inline
  def apply(
    defaultEncapsulation: atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation = null,
    missingTranslation: atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = null,
    useJit: js.UndefOr[scala.Boolean] = js.undefined
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEncapsulation != null) __obj.updateDynamic("defaultEncapsulation")(defaultEncapsulation)
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit)
    __obj.asInstanceOf[CompilerOptions]
  }
}


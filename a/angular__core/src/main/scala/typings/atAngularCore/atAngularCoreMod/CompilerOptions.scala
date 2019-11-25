package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerOptions extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var providers: js.UndefOr[js.Array[StaticProvider]] = js.undefined
  var useJit: js.UndefOr[Boolean] = js.undefined
}

object CompilerOptions {
  @scala.inline
  def apply(
    defaultEncapsulation: ViewEncapsulation = null,
    missingTranslation: MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    providers: js.Array[StaticProvider] = null,
    useJit: js.UndefOr[Boolean] = js.undefined
  ): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultEncapsulation != null) __obj.updateDynamic("defaultEncapsulation")(defaultEncapsulation.asInstanceOf[js.Any])
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerOptions]
  }
}


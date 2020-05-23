package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultEncapsulation extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var jitDevMode: js.UndefOr[Boolean] = js.undefined
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  var useJit: js.UndefOr[Boolean] = js.undefined
}

object DefaultEncapsulation {
  @scala.inline
  def apply(
    defaultEncapsulation: ViewEncapsulation = null,
    jitDevMode: js.UndefOr[Boolean] = js.undefined,
    missingTranslation: js.UndefOr[Null | MissingTranslationStrategy] = js.undefined,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    strictInjectionParameters: js.UndefOr[Boolean] = js.undefined,
    useJit: js.UndefOr[Boolean] = js.undefined
  ): DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    if (defaultEncapsulation != null) __obj.updateDynamic("defaultEncapsulation")(defaultEncapsulation.asInstanceOf[js.Any])
    if (!js.isUndefined(jitDevMode)) __obj.updateDynamic("jitDevMode")(jitDevMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(missingTranslation)) __obj.updateDynamic("missingTranslation")(missingTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictInjectionParameters)) __obj.updateDynamic("strictInjectionParameters")(strictInjectionParameters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultEncapsulation]
  }
}


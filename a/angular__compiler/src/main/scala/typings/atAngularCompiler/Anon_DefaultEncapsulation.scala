package typings.atAngularCompiler

import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultEncapsulation extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  var jitDevMode: js.UndefOr[Boolean] = js.undefined
  var missingTranslation: js.UndefOr[MissingTranslationStrategy | Null] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  var useJit: js.UndefOr[Boolean] = js.undefined
}

object Anon_DefaultEncapsulation {
  @scala.inline
  def apply(
    defaultEncapsulation: ViewEncapsulation = null,
    jitDevMode: js.UndefOr[Boolean] = js.undefined,
    missingTranslation: MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    strictInjectionParameters: js.UndefOr[Boolean] = js.undefined,
    useJit: js.UndefOr[Boolean] = js.undefined
  ): Anon_DefaultEncapsulation = {
    val __obj = js.Dynamic.literal()
    if (defaultEncapsulation != null) __obj.updateDynamic("defaultEncapsulation")(defaultEncapsulation.asInstanceOf[js.Any])
    if (!js.isUndefined(jitDevMode)) __obj.updateDynamic("jitDevMode")(jitDevMode.asInstanceOf[js.Any])
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(strictInjectionParameters)) __obj.updateDynamic("strictInjectionParameters")(strictInjectionParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultEncapsulation]
  }
}


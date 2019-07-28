package typings.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod

import typings.atAngularCompiler.atAngularCompilerStrings.ngtsc
import typings.atAngularCompiler.atAngularCompilerStrings.tsc
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotCompilerOptions extends js.Object {
  var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.undefined
  var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.undefined
  var enableIvy: js.UndefOr[Boolean | ngtsc | tsc] = js.undefined
  var enableSummariesForJit: js.UndefOr[Boolean] = js.undefined
  var fullTemplateTypeCheck: js.UndefOr[Boolean] = js.undefined
  var i18nFormat: js.UndefOr[String] = js.undefined
  var i18nUseExternalIds: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.undefined
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  var strictInjectionParameters: js.UndefOr[Boolean] = js.undefined
  var translations: js.UndefOr[String] = js.undefined
}

object AotCompilerOptions {
  @scala.inline
  def apply(
    allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.undefined,
    createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.undefined,
    enableIvy: Boolean | ngtsc | tsc = null,
    enableSummariesForJit: js.UndefOr[Boolean] = js.undefined,
    fullTemplateTypeCheck: js.UndefOr[Boolean] = js.undefined,
    i18nFormat: String = null,
    i18nUseExternalIds: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    missingTranslation: MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[Boolean] = js.undefined,
    strictInjectionParameters: js.UndefOr[Boolean] = js.undefined,
    translations: String = null
  ): AotCompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyCodegenFiles)) __obj.updateDynamic("allowEmptyCodegenFiles")(allowEmptyCodegenFiles)
    if (!js.isUndefined(createExternalSymbolFactoryReexports)) __obj.updateDynamic("createExternalSymbolFactoryReexports")(createExternalSymbolFactoryReexports)
    if (enableIvy != null) __obj.updateDynamic("enableIvy")(enableIvy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSummariesForJit)) __obj.updateDynamic("enableSummariesForJit")(enableSummariesForJit)
    if (!js.isUndefined(fullTemplateTypeCheck)) __obj.updateDynamic("fullTemplateTypeCheck")(fullTemplateTypeCheck)
    if (i18nFormat != null) __obj.updateDynamic("i18nFormat")(i18nFormat)
    if (!js.isUndefined(i18nUseExternalIds)) __obj.updateDynamic("i18nUseExternalIds")(i18nUseExternalIds)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation)
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    if (!js.isUndefined(strictInjectionParameters)) __obj.updateDynamic("strictInjectionParameters")(strictInjectionParameters)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[AotCompilerOptions]
  }
}


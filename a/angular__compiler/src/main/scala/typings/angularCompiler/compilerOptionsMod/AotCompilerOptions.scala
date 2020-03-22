package typings.angularCompiler.compilerOptionsMod

import typings.angularCompiler.angularCompilerStrings.ngtsc
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotCompilerOptions extends js.Object {
  var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.undefined
  var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.undefined
  var enableIvy: js.UndefOr[Boolean | ngtsc] = js.undefined
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
    enableIvy: Boolean | ngtsc = null,
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
    if (!js.isUndefined(allowEmptyCodegenFiles)) __obj.updateDynamic("allowEmptyCodegenFiles")(allowEmptyCodegenFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(createExternalSymbolFactoryReexports)) __obj.updateDynamic("createExternalSymbolFactoryReexports")(createExternalSymbolFactoryReexports.asInstanceOf[js.Any])
    if (enableIvy != null) __obj.updateDynamic("enableIvy")(enableIvy.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSummariesForJit)) __obj.updateDynamic("enableSummariesForJit")(enableSummariesForJit.asInstanceOf[js.Any])
    if (!js.isUndefined(fullTemplateTypeCheck)) __obj.updateDynamic("fullTemplateTypeCheck")(fullTemplateTypeCheck.asInstanceOf[js.Any])
    if (i18nFormat != null) __obj.updateDynamic("i18nFormat")(i18nFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(i18nUseExternalIds)) __obj.updateDynamic("i18nUseExternalIds")(i18nUseExternalIds.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (missingTranslation != null) __obj.updateDynamic("missingTranslation")(missingTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespaces)) __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(strictInjectionParameters)) __obj.updateDynamic("strictInjectionParameters")(strictInjectionParameters.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AotCompilerOptions]
  }
}


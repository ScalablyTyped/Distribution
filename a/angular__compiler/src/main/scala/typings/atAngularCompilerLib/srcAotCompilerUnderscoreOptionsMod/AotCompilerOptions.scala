package typings
package atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotCompilerOptions extends js.Object {
  var allowEmptyCodegenFiles: js.UndefOr[scala.Boolean] = js.undefined
  var createExternalSymbolFactoryReexports: js.UndefOr[scala.Boolean] = js.undefined
  var enableIvy: js.UndefOr[
    scala.Boolean | atAngularCompilerLib.atAngularCompilerLibStrings.ngtsc | atAngularCompilerLib.atAngularCompilerLibStrings.tsc
  ] = js.undefined
  var enableSummariesForJit: js.UndefOr[scala.Boolean] = js.undefined
  var fullTemplateTypeCheck: js.UndefOr[scala.Boolean] = js.undefined
  var i18nFormat: js.UndefOr[java.lang.String] = js.undefined
  var i18nUseExternalIds: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var missingTranslation: js.UndefOr[atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy] = js.undefined
  var preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  var strictInjectionParameters: js.UndefOr[scala.Boolean] = js.undefined
  var translations: js.UndefOr[java.lang.String] = js.undefined
}

object AotCompilerOptions {
  @scala.inline
  def apply(
    allowEmptyCodegenFiles: js.UndefOr[scala.Boolean] = js.undefined,
    createExternalSymbolFactoryReexports: js.UndefOr[scala.Boolean] = js.undefined,
    enableIvy: scala.Boolean | atAngularCompilerLib.atAngularCompilerLibStrings.ngtsc | atAngularCompilerLib.atAngularCompilerLibStrings.tsc = null,
    enableSummariesForJit: js.UndefOr[scala.Boolean] = js.undefined,
    fullTemplateTypeCheck: js.UndefOr[scala.Boolean] = js.undefined,
    i18nFormat: java.lang.String = null,
    i18nUseExternalIds: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    missingTranslation: atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy = null,
    preserveWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    strictInjectionParameters: js.UndefOr[scala.Boolean] = js.undefined,
    translations: java.lang.String = null
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


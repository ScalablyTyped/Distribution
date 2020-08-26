package typings.angularCompiler.compilerOptionsMod

import typings.angularCompiler.angularCompilerStrings.ngtsc
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AotCompilerOptions extends js.Object {
  var allowEmptyCodegenFiles: js.UndefOr[Boolean] = js.native
  var createExternalSymbolFactoryReexports: js.UndefOr[Boolean] = js.native
  var enableIvy: js.UndefOr[Boolean | ngtsc] = js.native
  var enableSummariesForJit: js.UndefOr[Boolean] = js.native
  var fullTemplateTypeCheck: js.UndefOr[Boolean] = js.native
  var i18nFormat: js.UndefOr[String] = js.native
  var i18nUseExternalIds: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.native
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  var strictInjectionParameters: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[String] = js.native
}

object AotCompilerOptions {
  @scala.inline
  def apply(): AotCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AotCompilerOptions]
  }
  @scala.inline
  implicit class AotCompilerOptionsOps[Self <: AotCompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowEmptyCodegenFiles(value: Boolean): Self = this.set("allowEmptyCodegenFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptyCodegenFiles: Self = this.set("allowEmptyCodegenFiles", js.undefined)
    @scala.inline
    def setCreateExternalSymbolFactoryReexports(value: Boolean): Self = this.set("createExternalSymbolFactoryReexports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateExternalSymbolFactoryReexports: Self = this.set("createExternalSymbolFactoryReexports", js.undefined)
    @scala.inline
    def setEnableIvy(value: Boolean | ngtsc): Self = this.set("enableIvy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIvy: Self = this.set("enableIvy", js.undefined)
    @scala.inline
    def setEnableSummariesForJit(value: Boolean): Self = this.set("enableSummariesForJit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSummariesForJit: Self = this.set("enableSummariesForJit", js.undefined)
    @scala.inline
    def setFullTemplateTypeCheck(value: Boolean): Self = this.set("fullTemplateTypeCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTemplateTypeCheck: Self = this.set("fullTemplateTypeCheck", js.undefined)
    @scala.inline
    def setI18nFormat(value: String): Self = this.set("i18nFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18nFormat: Self = this.set("i18nFormat", js.undefined)
    @scala.inline
    def setI18nUseExternalIds(value: Boolean): Self = this.set("i18nUseExternalIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18nUseExternalIds: Self = this.set("i18nUseExternalIds", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMissingTranslation(value: MissingTranslationStrategy): Self = this.set("missingTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingTranslation: Self = this.set("missingTranslation", js.undefined)
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
    @scala.inline
    def setStrictInjectionParameters(value: Boolean): Self = this.set("strictInjectionParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictInjectionParameters: Self = this.set("strictInjectionParameters", js.undefined)
    @scala.inline
    def setTranslations(value: String): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}


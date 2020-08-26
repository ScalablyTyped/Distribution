package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptions extends js.Object {
  var defaultEncapsulation: js.UndefOr[ViewEncapsulation] = js.native
  var missingTranslation: js.UndefOr[MissingTranslationStrategy] = js.native
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  var providers: js.UndefOr[js.Array[StaticProvider]] = js.native
  var useJit: js.UndefOr[Boolean] = js.native
}

object CompilerOptions {
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
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
    def setDefaultEncapsulation(value: ViewEncapsulation): Self = this.set("defaultEncapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncapsulation: Self = this.set("defaultEncapsulation", js.undefined)
    @scala.inline
    def setMissingTranslation(value: MissingTranslationStrategy): Self = this.set("missingTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingTranslation: Self = this.set("missingTranslation", js.undefined)
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespaces: Self = this.set("preserveWhitespaces", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: StaticProvider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[StaticProvider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setUseJit(value: Boolean): Self = this.set("useJit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseJit: Self = this.set("useJit", js.undefined)
  }
  
}


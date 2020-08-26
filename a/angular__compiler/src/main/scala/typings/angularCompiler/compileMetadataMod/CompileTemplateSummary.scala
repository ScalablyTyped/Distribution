package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.coreMod.ViewEncapsulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTemplateSummary extends js.Object {
  var animations: js.Array[_] | Null = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var ngContentSelectors: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
}

object CompileTemplateSummary {
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], styles: js.Array[String]): CompileTemplateSummary = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTemplateSummary]
  }
  @scala.inline
  implicit class CompileTemplateSummaryOps[Self <: CompileTemplateSummary] (val x: Self) extends AnyVal {
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
    def setNgContentSelectorsVarargs(value: String*): Self = this.set("ngContentSelectors", js.Array(value :_*))
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = this.set("ngContentSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationsNull: Self = this.set("animations", null)
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulationNull: Self = this.set("encapsulation", null)
  }
  
}


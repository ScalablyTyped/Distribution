package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typings.angularCompiler.coreMod.ViewEncapsulation
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animations extends js.Object {
  var animations: js.Array[_] = js.native
  var encapsulation: ViewEncapsulation | Null = js.native
  var externalStylesheets: js.Array[CompileStylesheetMetadata] = js.native
  var htmlAst: ParseTreeResult | Null = js.native
  var interpolation: (js.Tuple2[String, String]) | Null = js.native
  var isInline: Boolean = js.native
  var ngContentSelectors: js.Array[String] = js.native
  var preserveWhitespaces: Boolean = js.native
  var styleUrls: js.Array[String] = js.native
  var styles: js.Array[String] = js.native
  var template: String | Null = js.native
  var templateUrl: String | Null = js.native
}

object Animations {
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Animations = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], externalStylesheets = externalStylesheets.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], preserveWhitespaces = preserveWhitespaces.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  @scala.inline
  implicit class AnimationsOps[Self <: Animations] (val x: Self) extends AnyVal {
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
    def setAnimationsVarargs(value: js.Any*): Self = this.set("animations", js.Array(value :_*))
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalStylesheetsVarargs(value: CompileStylesheetMetadata*): Self = this.set("externalStylesheets", js.Array(value :_*))
    @scala.inline
    def setExternalStylesheets(value: js.Array[CompileStylesheetMetadata]): Self = this.set("externalStylesheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgContentSelectorsVarargs(value: String*): Self = this.set("ngContentSelectors", js.Array(value :_*))
    @scala.inline
    def setNgContentSelectors(value: js.Array[String]): Self = this.set("ngContentSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = this.set("preserveWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = this.set("styleUrls", js.Array(value :_*))
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = this.set("styleUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncapsulationNull: Self = this.set("encapsulation", null)
    @scala.inline
    def setHtmlAst(value: ParseTreeResult): Self = this.set("htmlAst", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlAstNull: Self = this.set("htmlAst", null)
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolationNull: Self = this.set("interpolation", null)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateUrlNull: Self = this.set("templateUrl", null)
  }
  
}


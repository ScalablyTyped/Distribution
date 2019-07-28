package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
import typings.atAngularCompiler.srcCoreMod.ViewEncapsulation
import typings.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animations extends js.Object {
  var animations: js.Array[_]
  var encapsulation: ViewEncapsulation | Null
  var externalStylesheets: js.Array[CompileStylesheetMetadata]
  var htmlAst: ParseTreeResult | Null
  var interpolation: (js.Tuple2[String, String]) | Null
  var isInline: Boolean
  var ngContentSelectors: js.Array[String]
  var preserveWhitespaces: Boolean
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
  var template: String | Null
  var templateUrl: String | Null
}

object Anon_Animations {
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[CompileStylesheetMetadata],
    isInline: Boolean,
    ngContentSelectors: js.Array[String],
    preserveWhitespaces: Boolean,
    styleUrls: js.Array[String],
    styles: js.Array[String],
    encapsulation: ViewEncapsulation = null,
    htmlAst: ParseTreeResult = null,
    interpolation: js.Tuple2[String, String] = null,
    template: String = null,
    templateUrl: String = null
  ): Anon_Animations = {
    val __obj = js.Dynamic.literal(animations = animations, externalStylesheets = externalStylesheets, isInline = isInline, ngContentSelectors = ngContentSelectors, preserveWhitespaces = preserveWhitespaces, styleUrls = styleUrls, styles = styles)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    if (htmlAst != null) __obj.updateDynamic("htmlAst")(htmlAst)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[Anon_Animations]
  }
}


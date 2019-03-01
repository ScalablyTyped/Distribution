package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animations extends js.Object {
  var animations: js.Array[_]
  var encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation | scala.Null
  var externalStylesheets: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata]
  var htmlAst: atAngularCompilerLib.srcMlUnderscoreParserParserMod.ParseTreeResult | scala.Null
  var interpolation: (js.Tuple2[java.lang.String, java.lang.String]) | scala.Null
  var isInline: scala.Boolean
  var ngContentSelectors: js.Array[java.lang.String]
  var preserveWhitespaces: scala.Boolean
  var styleUrls: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
  var template: java.lang.String | scala.Null
  var templateUrl: java.lang.String | scala.Null
}

object Anon_Animations {
  @scala.inline
  def apply(
    animations: js.Array[_],
    externalStylesheets: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata],
    isInline: scala.Boolean,
    ngContentSelectors: js.Array[java.lang.String],
    preserveWhitespaces: scala.Boolean,
    styleUrls: js.Array[java.lang.String],
    styles: js.Array[java.lang.String],
    encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation = null,
    htmlAst: atAngularCompilerLib.srcMlUnderscoreParserParserMod.ParseTreeResult = null,
    interpolation: js.Tuple2[java.lang.String, java.lang.String] = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null
  ): Anon_Animations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animations")(animations)
    __obj.updateDynamic("externalStylesheets")(externalStylesheets)
    __obj.updateDynamic("isInline")(isInline)
    __obj.updateDynamic("ngContentSelectors")(ngContentSelectors)
    __obj.updateDynamic("preserveWhitespaces")(preserveWhitespaces)
    __obj.updateDynamic("styleUrls")(styleUrls)
    __obj.updateDynamic("styles")(styles)
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation)
    if (htmlAst != null) __obj.updateDynamic("htmlAst")(htmlAst)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[Anon_Animations]
  }
}


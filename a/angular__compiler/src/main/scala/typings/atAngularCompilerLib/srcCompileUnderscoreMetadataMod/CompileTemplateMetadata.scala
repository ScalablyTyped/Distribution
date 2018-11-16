package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompileTemplateMetadata")
@js.native
class CompileTemplateMetadata protected () extends js.Object {
  def this(hasEncapsulationTemplateTemplateUrlHtmlAstStylesStyleUrlsExternalStylesheetsAnimationsNgContentSelectorsInterpolationIsInlinePreserveWhitespaces: atAngularCompilerLib.Anon_PreserveWhitespacesExternalStylesheets) = this()
  var animations: js.Array[_] = js.native
  var encapsulation: atAngularCompilerLib.srcCoreMod.ViewEncapsulation | scala.Null = js.native
  var externalStylesheets: js.Array[CompileStylesheetMetadata] = js.native
  var htmlAst: atAngularCompilerLib.srcMlUnderscoreParserParserMod.ParseTreeResult | scala.Null = js.native
  var interpolation: (js.Tuple2[java.lang.String, java.lang.String]) | scala.Null = js.native
  var isInline: scala.Boolean = js.native
  var ngContentSelectors: js.Array[java.lang.String] = js.native
  var preserveWhitespaces: scala.Boolean = js.native
  var styleUrls: js.Array[java.lang.String] = js.native
  var styles: js.Array[java.lang.String] = js.native
  var template: java.lang.String | scala.Null = js.native
  var templateUrl: java.lang.String | scala.Null = js.native
  def toSummary(): CompileTemplateSummary = js.native
}


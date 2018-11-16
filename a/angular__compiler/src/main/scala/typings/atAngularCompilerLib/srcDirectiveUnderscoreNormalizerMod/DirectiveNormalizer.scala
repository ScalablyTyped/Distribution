package typings
package atAngularCompilerLib.srcDirectiveUnderscoreNormalizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/directive_normalizer", "DirectiveNormalizer")
@js.native
class DirectiveNormalizer protected () extends js.Object {
  def this(_resourceLoader: atAngularCompilerLib.srcResourceUnderscoreLoaderMod.ResourceLoader, _urlResolver: atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver, _htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _config: atAngularCompilerLib.srcConfigMod.CompilerConfig) = this()
  var _config: js.Any = js.native
  var _fetch: js.Any = js.native
  var _htmlParser: js.Any = js.native
  var _inlineStyles: js.Any = js.native
  var _loadMissingExternalStylesheets: js.Any = js.native
  var _normalizeLoadedTemplateMetadata: js.Any = js.native
  var _normalizeStylesheet: js.Any = js.native
  var _normalizeTemplateMetadata: js.Any = js.native
  var _preParseTemplate: js.Any = js.native
  var _preparseLoadedTemplate: js.Any = js.native
  var _resourceLoader: js.Any = js.native
  var _resourceLoaderCache: js.Any = js.native
  var _urlResolver: js.Any = js.native
  def clearCache(): scala.Unit = js.native
  def clearCacheFor(normalizedDirective: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata): scala.Unit = js.native
  def normalizeTemplate(prenormData: PrenormalizedTemplateMetadata): atAngularCompilerLib.srcUtilMod.SyncAsync[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTemplateMetadata] = js.native
}


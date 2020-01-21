package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "DirectiveNormalizer")
@js.native
class DirectiveNormalizer protected ()
  extends typings.angularCompiler.srcCompilerMod.DirectiveNormalizer {
  def this(
    _resourceLoader: typings.angularCompiler.resourceLoaderMod.ResourceLoader,
    _urlResolver: typings.angularCompiler.urlResolverMod.UrlResolver,
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _config: typings.angularCompiler.configMod.CompilerConfig
  ) = this()
}


package typings.atAngularCompiler.srcI18nExtractorMod

import typings.atAngularCompiler.Anon_Extractor
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typings.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle
import typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
@js.native
class Extractor protected () extends js.Object {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: StaticSymbolResolver,
    messageBundle: MessageBundle,
    metadataResolver: CompileMetadataResolver
  ) = this()
  var host: ExtractorHost = js.native
  var messageBundle: js.Any = js.native
  var metadataResolver: js.Any = js.native
  var staticSymbolResolver: js.Any = js.native
  def extract(rootFiles: js.Array[String]): js.Promise[MessageBundle] = js.native
}

/* static members */
@JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): Anon_Extractor = js.native
  def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
}


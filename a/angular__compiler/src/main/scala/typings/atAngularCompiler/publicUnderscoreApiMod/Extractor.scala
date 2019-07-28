package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.Anon_Extractor
import typings.atAngularCompiler.srcI18nExtractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Extractor")
@js.native
class Extractor protected ()
  extends typings.atAngularCompiler.srcCompilerMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver,
    messageBundle: typings.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle,
    metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): Anon_Extractor = js.native
  def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
}


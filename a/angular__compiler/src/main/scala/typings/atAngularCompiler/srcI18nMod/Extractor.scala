package typings.atAngularCompiler.srcI18nMod

import typings.atAngularCompiler.Anon_Extractor
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
import typings.atAngularCompiler.srcI18nExtractorMod.ExtractorHost
import typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n", "Extractor")
@js.native
class Extractor protected ()
  extends typings.atAngularCompiler.srcI18nExtractorMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: StaticSymbolResolver,
    messageBundle: typings.atAngularCompiler.srcI18nMessageUnderscoreBundleMod.MessageBundle,
    metadataResolver: CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/i18n", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): Anon_Extractor = js.native
  def create(host: ExtractorHost, locale: String): Anon_Extractor = js.native
}


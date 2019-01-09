package typings
package atAngularCompilerLib.srcI18nExtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
@js.native
class Extractor protected () extends js.Object {
  def this(host: ExtractorHost, staticSymbolResolver: atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver, messageBundle: atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod.MessageBundle, metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver) = this()
  var host: ExtractorHost = js.native
  var messageBundle: js.Any = js.native
  var metadataResolver: js.Any = js.native
  var staticSymbolResolver: js.Any = js.native
  def extract(rootFiles: js.Array[java.lang.String]): js.Promise[atAngularCompilerLib.srcI18nMessageUnderscoreBundleMod.MessageBundle] = js.native
}

@JSImport("@angular/compiler/src/i18n/extractor", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: atAngularCompilerLib.srcI18nExtractorMod.ExtractorHost): atAngularCompilerLib.Anon_Extractor = js.native
  def create(host: atAngularCompilerLib.srcI18nExtractorMod.ExtractorHost, locale: java.lang.String): atAngularCompilerLib.Anon_Extractor = js.native
}


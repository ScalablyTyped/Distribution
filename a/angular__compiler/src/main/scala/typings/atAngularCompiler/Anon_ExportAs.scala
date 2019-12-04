package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExportAs extends js.Object {
  var exportAs: String
  var symbol: StaticSymbol
}

object Anon_ExportAs {
  @scala.inline
  def apply(exportAs: String, symbol: StaticSymbol): Anon_ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExportAs]
  }
}


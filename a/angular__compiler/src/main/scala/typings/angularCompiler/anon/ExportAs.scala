package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportAs extends js.Object {
  var exportAs: String
  var symbol: StaticSymbol
}

object ExportAs {
  @scala.inline
  def apply(exportAs: String, symbol: StaticSymbol): ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAs]
  }
}


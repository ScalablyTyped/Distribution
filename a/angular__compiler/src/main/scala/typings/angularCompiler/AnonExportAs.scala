package typings.angularCompiler

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExportAs extends js.Object {
  var exportAs: String
  var symbol: StaticSymbol
}

object AnonExportAs {
  @scala.inline
  def apply(exportAs: String, symbol: StaticSymbol): AnonExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExportAs]
  }
}


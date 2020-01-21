package typings.angularCompiler

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImportAs extends js.Object {
  var importAs: StaticSymbol
  var symbol: StaticSymbol
}

object AnonImportAs {
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): AnonImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImportAs]
  }
}


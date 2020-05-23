package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportAs extends js.Object {
  var importAs: StaticSymbol
  var symbol: StaticSymbol
}

object ImportAs {
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAs]
  }
}


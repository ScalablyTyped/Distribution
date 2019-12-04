package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportAs extends js.Object {
  var importAs: StaticSymbol
  var symbol: StaticSymbol
}

object Anon_ImportAs {
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): Anon_ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ImportAs]
  }
}


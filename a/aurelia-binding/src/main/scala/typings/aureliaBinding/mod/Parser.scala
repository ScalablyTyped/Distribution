package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "Parser")
@js.native
class Parser () extends js.Object {
  /**
    * Parses a string containing a javascript expression and returns a data-binding specialized AST. Memoized.
    */
  def parse(input: String): Expression = js.native
}


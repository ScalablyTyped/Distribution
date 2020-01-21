package typings.acorn.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizer extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Token, _, js.UndefOr[scala.Nothing]]] = js.native
  def getToken(): Token = js.native
}


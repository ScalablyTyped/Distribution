package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenizer extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[stdLib.Iterator[Token]]
  def getToken(): Token
}

object ITokenizer {
  @scala.inline
  def apply(getToken: js.Function0[Token], iterator: js.Function0[stdLib.Iterator[Token]]): ITokenizer = {
    val __obj = js.Dynamic.literal(getToken = getToken, iterator = iterator)
  
    __obj.asInstanceOf[ITokenizer]
  }
}


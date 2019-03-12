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
  def apply(getToken: () => Token, iterator: () => stdLib.Iterator[Token]): ITokenizer = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), iterator = js.Any.fromFunction0(iterator))
  
    __obj.asInstanceOf[ITokenizer]
  }
}


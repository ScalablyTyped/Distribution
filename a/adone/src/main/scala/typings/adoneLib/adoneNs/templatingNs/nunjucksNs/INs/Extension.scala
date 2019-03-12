package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var tags: js.Array[java.lang.String]
  def parse(parser: js.Any, nodes: js.Any, lexer: js.Any): js.Any
}

object Extension {
  @scala.inline
  def apply(parse: (js.Any, js.Any, js.Any) => js.Any, tags: js.Array[java.lang.String]): Extension = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3(parse), tags = tags)
  
    __obj.asInstanceOf[Extension]
  }
}


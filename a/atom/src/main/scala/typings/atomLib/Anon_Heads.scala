package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heads extends js.Object {
  var heads: js.Array[java.lang.String]
  var remotes: js.Array[java.lang.String]
  var tags: js.Array[java.lang.String]
}

object Anon_Heads {
  @scala.inline
  def apply(
    heads: js.Array[java.lang.String],
    remotes: js.Array[java.lang.String],
    tags: js.Array[java.lang.String]
  ): Anon_Heads = {
    val __obj = js.Dynamic.literal(heads = heads, remotes = remotes, tags = tags)
  
    __obj.asInstanceOf[Anon_Heads]
  }
}


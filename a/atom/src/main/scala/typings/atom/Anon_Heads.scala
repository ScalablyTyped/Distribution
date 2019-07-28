package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heads extends js.Object {
  var heads: js.Array[String]
  var remotes: js.Array[String]
  var tags: js.Array[String]
}

object Anon_Heads {
  @scala.inline
  def apply(heads: js.Array[String], remotes: js.Array[String], tags: js.Array[String]): Anon_Heads = {
    val __obj = js.Dynamic.literal(heads = heads, remotes = remotes, tags = tags)
  
    __obj.asInstanceOf[Anon_Heads]
  }
}


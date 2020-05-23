package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heads extends js.Object {
  var heads: js.Array[String]
  var remotes: js.Array[String]
  var tags: js.Array[String]
}

object Heads {
  @scala.inline
  def apply(heads: js.Array[String], remotes: js.Array[String], tags: js.Array[String]): Heads = {
    val __obj = js.Dynamic.literal(heads = heads.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heads]
  }
}


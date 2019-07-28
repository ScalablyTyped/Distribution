package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var id: String
  var src: String
  var `type`: String
}

object Res {
  @scala.inline
  def apply(id: String, src: String, `type`: String): Res = {
    val __obj = js.Dynamic.literal(id = id, src = src)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Res]
  }
}


package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var id: java.lang.String
  var src: java.lang.String
  var `type`: java.lang.String
}

object Res {
  @scala.inline
  def apply(id: java.lang.String, src: java.lang.String, `type`: java.lang.String): Res = {
    val __obj = js.Dynamic.literal(id = id, src = src)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Res]
  }
}


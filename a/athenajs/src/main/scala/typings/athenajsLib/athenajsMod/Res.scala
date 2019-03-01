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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Res]
  }
}


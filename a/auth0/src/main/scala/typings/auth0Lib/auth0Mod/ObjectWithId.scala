package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithId extends js.Object {
  var id: java.lang.String
}

object ObjectWithId {
  @scala.inline
  def apply(id: java.lang.String): ObjectWithId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ObjectWithId]
  }
}


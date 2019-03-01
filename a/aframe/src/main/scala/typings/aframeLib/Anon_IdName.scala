package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var newData: js.Any
  var oldData: js.Any
}

object Anon_IdName {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, newData: js.Any, oldData: js.Any): Anon_IdName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("newData")(newData)
    __obj.updateDynamic("oldData")(oldData)
    __obj.asInstanceOf[Anon_IdName]
  }
}


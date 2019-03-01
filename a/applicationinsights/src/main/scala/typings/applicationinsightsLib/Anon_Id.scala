package typings
package applicationinsightsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var parentId: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, parentId: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[Anon_Id]
  }
}


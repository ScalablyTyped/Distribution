package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var configClass: String
  var fields: js.UndefOr[Containers] = js.undefined
  var id: String
  var objectType: String
}

object Fields {
  @scala.inline
  def apply(configClass: String, id: String, objectType: String, fields: Containers = null): Fields = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}


package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var displayName: String
  var name: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(displayName: String, name: String, description: String = null, tags: js.Array[String] = null): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}


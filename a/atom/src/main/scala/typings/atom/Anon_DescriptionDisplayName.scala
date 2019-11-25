package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionDisplayName extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var displayName: String
  var name: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_DescriptionDisplayName {
  @scala.inline
  def apply(displayName: String, name: String, description: String = null, tags: js.Array[String] = null): Anon_DescriptionDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionDisplayName]
  }
}


package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionDisplayName extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var displayName: java.lang.String
  var name: java.lang.String
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_DescriptionDisplayName {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    name: java.lang.String,
    description: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Anon_DescriptionDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_DescriptionDisplayName]
  }
}


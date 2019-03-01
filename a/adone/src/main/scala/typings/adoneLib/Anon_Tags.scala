package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tags extends js.Object {
  var tags: js.UndefOr[Anon_BlockEnd] = js.undefined
}

object Anon_Tags {
  @scala.inline
  def apply(tags: Anon_BlockEnd = null): Anon_Tags = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Tags]
  }
}


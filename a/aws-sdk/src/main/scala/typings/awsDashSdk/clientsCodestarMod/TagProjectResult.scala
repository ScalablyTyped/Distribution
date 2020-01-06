package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagProjectResult extends js.Object {
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object TagProjectResult {
  @scala.inline
  def apply(tags: Tags = null): TagProjectResult = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProjectResult]
  }
}


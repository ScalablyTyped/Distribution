package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForVaultOutput extends js.Object {
  /**
    * The tags attached to the vault. Each tag is composed of a key and a value.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object ListTagsForVaultOutput {
  @scala.inline
  def apply(Tags: TagMap = null): ListTagsForVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForVaultOutput]
  }
}


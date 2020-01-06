package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyResponse extends js.Object {
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typings.awsDashSdk.clientsKmsMod.KeyMetadata] = js.native
}

object DescribeKeyResponse {
  @scala.inline
  def apply(KeyMetadata: KeyMetadata = null): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyResponse]
  }
}


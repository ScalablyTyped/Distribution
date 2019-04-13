package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeKeyResponse extends js.Object {
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
}

object DescribeKeyResponse {
  @scala.inline
  def apply(KeyMetadata: KeyMetadata = null): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyMetadata != null) __obj.updateDynamic("KeyMetadata")(KeyMetadata)
    __obj.asInstanceOf[DescribeKeyResponse]
  }
}


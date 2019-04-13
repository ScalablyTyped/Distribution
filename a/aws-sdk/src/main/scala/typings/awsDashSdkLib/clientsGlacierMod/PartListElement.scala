package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartListElement extends js.Object {
  /**
    * The byte range of a part, inclusive of the upper value of the range.
    */
  var RangeInBytes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never null.
    */
  var SHA256TreeHash: js.UndefOr[java.lang.String] = js.undefined
}

object PartListElement {
  @scala.inline
  def apply(RangeInBytes: java.lang.String = null, SHA256TreeHash: java.lang.String = null): PartListElement = {
    val __obj = js.Dynamic.literal()
    if (RangeInBytes != null) __obj.updateDynamic("RangeInBytes")(RangeInBytes)
    if (SHA256TreeHash != null) __obj.updateDynamic("SHA256TreeHash")(SHA256TreeHash)
    __obj.asInstanceOf[PartListElement]
  }
}


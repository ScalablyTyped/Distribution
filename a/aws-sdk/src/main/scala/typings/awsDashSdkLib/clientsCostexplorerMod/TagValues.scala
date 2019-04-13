package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagValues extends js.Object {
  /**
    * The key for the tag.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  /**
    * The specific value of the tag.
    */
  var Values: js.UndefOr[Values] = js.undefined
}

object TagValues {
  @scala.inline
  def apply(Key: TagKey = null, Values: Values = null): TagValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[TagValues]
  }
}


package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * EC2 instance tag key.
    */
  var Key: js.UndefOr[__string] = js.undefined
  /**
    * EC2 instance tag value.
    */
  var Value: js.UndefOr[__string] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: __string = null, Value: __string = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}


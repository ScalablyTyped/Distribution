package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  /**
    *  A complex type that contains Tag elements.
    */
  var Items: js.UndefOr[TagList] = js.native
}

object Tags {
  @scala.inline
  def apply(Items: TagList = null): Tags = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
}


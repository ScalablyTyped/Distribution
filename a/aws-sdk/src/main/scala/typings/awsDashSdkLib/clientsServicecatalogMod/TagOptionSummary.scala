package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagOptionSummary extends js.Object {
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  /**
    * The TagOption value.
    */
  var Values: js.UndefOr[TagOptionValues] = js.undefined
}

object TagOptionSummary {
  @scala.inline
  def apply(Key: TagOptionKey = null, Values: TagOptionValues = null): TagOptionSummary = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[TagOptionSummary]
  }
}


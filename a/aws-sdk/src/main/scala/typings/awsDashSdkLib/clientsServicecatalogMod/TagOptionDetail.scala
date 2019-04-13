package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagOptionDetail extends js.Object {
  /**
    * The TagOption active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  /**
    * The TagOption identifier.
    */
  var Id: js.UndefOr[TagOptionId] = js.undefined
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}

object TagOptionDetail {
  @scala.inline
  def apply(
    Active: js.UndefOr[TagOptionActive] = js.undefined,
    Id: TagOptionId = null,
    Key: TagOptionKey = null,
    Value: TagOptionValue = null
  ): TagOptionDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[TagOptionDetail]
  }
}


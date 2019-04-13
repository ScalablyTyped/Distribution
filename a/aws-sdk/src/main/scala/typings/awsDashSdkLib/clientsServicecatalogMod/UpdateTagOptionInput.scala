package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTagOptionInput extends js.Object {
  /**
    * The updated active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
  /**
    * The updated value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}

object UpdateTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId, Active: js.UndefOr[TagOptionActive] = js.undefined, Value: TagOptionValue = null): UpdateTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[UpdateTagOptionInput]
  }
}


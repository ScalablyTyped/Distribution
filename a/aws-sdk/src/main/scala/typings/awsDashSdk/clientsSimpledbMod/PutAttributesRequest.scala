package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAttributesRequest extends js.Object {
  /**
    * The list of attributes.
    */
  var Attributes: ReplaceableAttributeList
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String
  /**
    * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.undefined
  /**
    * The name of the item.
    */
  var ItemName: String
}

object PutAttributesRequest {
  @scala.inline
  def apply(
    Attributes: ReplaceableAttributeList,
    DomainName: String,
    ItemName: String,
    Expected: UpdateCondition = null
  ): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, DomainName = DomainName, ItemName = ItemName)
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    __obj.asInstanceOf[PutAttributesRequest]
  }
}


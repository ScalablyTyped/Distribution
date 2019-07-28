package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAttributesRequest extends js.Object {
  /**
    * A list of Attributes. Similar to columns on a spreadsheet, attributes represent categories of data that can be assigned to items.
    */
  var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String
  /**
    * The update condition which, if specified, determines whether the specified attributes will be deleted or not. The update condition must be satisfied in order for this request to be processed and the attributes to be deleted.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.undefined
  /**
    * The name of the item. Similar to rows on a spreadsheet, items represent individual objects that contain one or more value-attribute pairs.
    */
  var ItemName: String
}

object DeleteAttributesRequest {
  @scala.inline
  def apply(
    DomainName: String,
    ItemName: String,
    Attributes: DeletableAttributeList = null,
    Expected: UpdateCondition = null
  ): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, ItemName = ItemName)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
}


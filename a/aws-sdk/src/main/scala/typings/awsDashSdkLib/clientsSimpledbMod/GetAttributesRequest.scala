package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAttributesRequest extends js.Object {
  /**
    * The names of the attributes.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String
  /**
    * The name of the item.
    */
  var ItemName: String
}

object GetAttributesRequest {
  @scala.inline
  def apply(
    DomainName: String,
    ItemName: String,
    AttributeNames: AttributeNameList = null,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined
  ): GetAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, ItemName = ItemName)
    if (AttributeNames != null) __obj.updateDynamic("AttributeNames")(AttributeNames)
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    __obj.asInstanceOf[GetAttributesRequest]
  }
}


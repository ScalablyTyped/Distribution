package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteAttributesRequest extends js.Object {
  /**
    * The name of the domain in which the attributes are being deleted.
    */
  var DomainName: String
  /**
    * A list of items on which to perform the operation.
    */
  var Items: DeletableItemList
}

object BatchDeleteAttributesRequest {
  @scala.inline
  def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Items = Items)
  
    __obj.asInstanceOf[BatchDeleteAttributesRequest]
  }
}


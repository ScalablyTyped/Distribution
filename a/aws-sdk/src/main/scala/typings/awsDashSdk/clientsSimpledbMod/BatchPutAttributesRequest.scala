package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutAttributesRequest extends js.Object {
  /**
    * The name of the domain in which the attributes are being stored.
    */
  var DomainName: String = js.native
  /**
    * A list of items on which to perform the operation.
    */
  var Items: ReplaceableItemList = js.native
}

object BatchPutAttributesRequest {
  @scala.inline
  def apply(DomainName: String, Items: ReplaceableItemList): BatchPutAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchPutAttributesRequest]
  }
}


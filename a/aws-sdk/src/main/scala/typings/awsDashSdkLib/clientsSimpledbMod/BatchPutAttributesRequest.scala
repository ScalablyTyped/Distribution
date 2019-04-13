package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutAttributesRequest extends js.Object {
  /**
    * The name of the domain in which the attributes are being stored.
    */
  var DomainName: String
  /**
    * A list of items on which to perform the operation.
    */
  var Items: ReplaceableItemList
}

object BatchPutAttributesRequest {
  @scala.inline
  def apply(DomainName: String, Items: ReplaceableItemList): BatchPutAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Items = Items)
  
    __obj.asInstanceOf[BatchPutAttributesRequest]
  }
}


package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReceiptFilterRequest extends js.Object {
  /**
    * The name of the IP address filter to delete.
    */
  var FilterName: ReceiptFilterName
}

object DeleteReceiptFilterRequest {
  @scala.inline
  def apply(FilterName: ReceiptFilterName): DeleteReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(FilterName = FilterName)
  
    __obj.asInstanceOf[DeleteReceiptFilterRequest]
  }
}


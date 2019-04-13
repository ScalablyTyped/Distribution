package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseRequest extends js.Object {
  /**
    * The number of instances.
    */
  var InstanceCount: Integer
  /**
    * The purchase token.
    */
  var PurchaseToken: String
}

object PurchaseRequest {
  @scala.inline
  def apply(InstanceCount: Integer, PurchaseToken: String): PurchaseRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, PurchaseToken = PurchaseToken)
  
    __obj.asInstanceOf[PurchaseRequest]
  }
}


package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLagRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
}

object DeleteLagRequest {
  @scala.inline
  def apply(lagId: LagId): DeleteLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId)
  
    __obj.asInstanceOf[DeleteLagRequest]
  }
}


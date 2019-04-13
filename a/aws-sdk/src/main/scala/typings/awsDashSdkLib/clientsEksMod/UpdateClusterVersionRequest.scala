package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterVersionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String
  /**
    * The desired Kubernetes version following a successful update.
    */
  var version: String
}

object UpdateClusterVersionRequest {
  @scala.inline
  def apply(name: String, version: String, clientRequestToken: String = null): UpdateClusterVersionRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    __obj.asInstanceOf[UpdateClusterVersionRequest]
  }
}


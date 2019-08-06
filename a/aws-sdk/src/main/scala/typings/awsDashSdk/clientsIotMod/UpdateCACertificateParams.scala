package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCACertificateParams extends js.Object {
  /**
    * The action that you want to apply to the CA cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: CACertificateUpdateAction
}

object UpdateCACertificateParams {
  @scala.inline
  def apply(action: CACertificateUpdateAction): UpdateCACertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCACertificateParams]
  }
}


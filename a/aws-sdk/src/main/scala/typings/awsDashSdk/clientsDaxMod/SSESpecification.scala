package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
    */
  var Enabled: SSEEnabled = js.native
}

object SSESpecification {
  @scala.inline
  def apply(Enabled: SSEEnabled): SSESpecification = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSESpecification]
  }
}


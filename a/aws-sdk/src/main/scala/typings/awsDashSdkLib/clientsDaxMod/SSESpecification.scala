package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
    */
  var Enabled: SSEEnabled
}

object SSESpecification {
  @scala.inline
  def apply(Enabled: SSEEnabled): SSESpecification = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
  
    __obj.asInstanceOf[SSESpecification]
  }
}


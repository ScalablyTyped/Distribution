package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientAuthentication extends js.Object {
  /**
    * 
    Details for ClientAuthentication using TLS.
    
    */
  var Tls: js.UndefOr[Tls] = js.undefined
}

object ClientAuthentication {
  @scala.inline
  def apply(Tls: Tls = null): ClientAuthentication = {
    val __obj = js.Dynamic.literal()
    if (Tls != null) __obj.updateDynamic("Tls")(Tls)
    __obj.asInstanceOf[ClientAuthentication]
  }
}


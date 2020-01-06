package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    * The name of the domain to delete.
    */
  var DomainName: String = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainName: String): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}


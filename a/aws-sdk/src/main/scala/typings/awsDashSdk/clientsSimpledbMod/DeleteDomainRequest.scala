package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainRequest extends js.Object {
  /**
    * The name of the domain to delete.
    */
  var DomainName: String
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainName: String): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}


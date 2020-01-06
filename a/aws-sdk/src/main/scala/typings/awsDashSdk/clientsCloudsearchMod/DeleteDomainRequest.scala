package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    * The name of the domain you want to permanently delete.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}


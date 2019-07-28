package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainRequest extends js.Object {
  /**
    * The name of the domain you want to permanently delete.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}


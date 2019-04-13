package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainDetailRequest extends js.Object {
  /**
    * The name of the domain that you want to get detailed information about.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
}

object GetDomainDetailRequest {
  @scala.inline
  def apply(DomainName: DomainName): GetDomainDetailRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[GetDomainDetailRequest]
  }
}


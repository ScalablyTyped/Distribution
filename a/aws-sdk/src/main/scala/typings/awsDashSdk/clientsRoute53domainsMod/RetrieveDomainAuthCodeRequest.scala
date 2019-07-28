package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveDomainAuthCodeRequest extends js.Object {
  /**
    * The name of the domain that you want to get an authorization code for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object RetrieveDomainAuthCodeRequest {
  @scala.inline
  def apply(DomainName: DomainName): RetrieveDomainAuthCodeRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[RetrieveDomainAuthCodeRequest]
  }
}


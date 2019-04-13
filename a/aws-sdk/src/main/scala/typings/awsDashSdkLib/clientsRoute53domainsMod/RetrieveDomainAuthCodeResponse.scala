package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveDomainAuthCodeResponse extends js.Object {
  /**
    * The authorization code for the domain.
    */
  var AuthCode: DomainAuthCode
}

object RetrieveDomainAuthCodeResponse {
  @scala.inline
  def apply(AuthCode: DomainAuthCode): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal(AuthCode = AuthCode)
  
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
}


package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityMailFromDomainAttributesResponse extends js.Object {
  /**
    * A map of identities to custom MAIL FROM attributes.
    */
  var MailFromDomainAttributes: typings.awsDashSdk.clientsSesMod.MailFromDomainAttributes
}

object GetIdentityMailFromDomainAttributesResponse {
  @scala.inline
  def apply(MailFromDomainAttributes: MailFromDomainAttributes): GetIdentityMailFromDomainAttributesResponse = {
    val __obj = js.Dynamic.literal(MailFromDomainAttributes = MailFromDomainAttributes)
  
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesResponse]
  }
}


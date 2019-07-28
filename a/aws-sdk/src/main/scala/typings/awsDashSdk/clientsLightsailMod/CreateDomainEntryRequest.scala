package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain entry request.
    */
  var domainEntry: DomainEntry
  /**
    * The domain name (e.g., example.com) for which you want to create the domain entry.
    */
  var domainName: DomainName
}

object CreateDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): CreateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry, domainName = domainName)
  
    __obj.asInstanceOf[CreateDomainEntryRequest]
  }
}


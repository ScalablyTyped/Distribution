package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about your domain entries.
    */
  var domainEntry: DomainEntry
  /**
    * The name of the domain entry to delete.
    */
  var domainName: DomainName
}

object DeleteDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): DeleteDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry, domainName = domainName)
  
    __obj.asInstanceOf[DeleteDomainEntryRequest]
  }
}


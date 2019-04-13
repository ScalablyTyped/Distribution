package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain entry.
    */
  var domainEntry: DomainEntry
  /**
    * The name of the domain recordset to update.
    */
  var domainName: DomainName
}

object UpdateDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): UpdateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry, domainName = domainName)
  
    __obj.asInstanceOf[UpdateDomainEntryRequest]
  }
}


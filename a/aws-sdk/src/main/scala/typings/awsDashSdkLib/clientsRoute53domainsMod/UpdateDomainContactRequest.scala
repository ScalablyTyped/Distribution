package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainContactRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: js.UndefOr[ContactDetail] = js.undefined
  /**
    * The name of the domain that you want to update contact information for.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: js.UndefOr[ContactDetail] = js.undefined
  /**
    * Provides detailed contact information.
    */
  var TechContact: js.UndefOr[ContactDetail] = js.undefined
}

object UpdateDomainContactRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AdminContact: ContactDetail = null,
    RegistrantContact: ContactDetail = null,
    TechContact: ContactDetail = null
  ): UpdateDomainContactRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (AdminContact != null) __obj.updateDynamic("AdminContact")(AdminContact)
    if (RegistrantContact != null) __obj.updateDynamic("RegistrantContact")(RegistrantContact)
    if (TechContact != null) __obj.updateDynamic("TechContact")(TechContact)
    __obj.asInstanceOf[UpdateDomainContactRequest]
  }
}


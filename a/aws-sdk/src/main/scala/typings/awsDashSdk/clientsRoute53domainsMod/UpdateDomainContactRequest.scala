package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainContactRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: js.UndefOr[ContactDetail] = js.native
  /**
    * The name of the domain that you want to update contact information for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName = js.native
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: js.UndefOr[ContactDetail] = js.native
  /**
    * Provides detailed contact information.
    */
  var TechContact: js.UndefOr[ContactDetail] = js.native
}

object UpdateDomainContactRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AdminContact: ContactDetail = null,
    RegistrantContact: ContactDetail = null,
    TechContact: ContactDetail = null
  ): UpdateDomainContactRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (AdminContact != null) __obj.updateDynamic("AdminContact")(AdminContact.asInstanceOf[js.Any])
    if (RegistrantContact != null) __obj.updateDynamic("RegistrantContact")(RegistrantContact.asInstanceOf[js.Any])
    if (TechContact != null) __obj.updateDynamic("TechContact")(TechContact.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactRequest]
  }
}


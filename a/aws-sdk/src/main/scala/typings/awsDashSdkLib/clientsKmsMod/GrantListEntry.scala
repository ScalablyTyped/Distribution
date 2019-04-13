package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantListEntry extends js.Object {
  /**
    * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.undefined
  /**
    * The date and time when the grant was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The unique identifier for the grant.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.undefined
  /**
    * The principal that receives the grant's permissions.
    */
  var GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined
  /**
    * The AWS account under which the grant was issued.
    */
  var IssuingAccount: js.UndefOr[PrincipalIdType] = js.undefined
  /**
    * The unique identifier for the customer master key (CMK) to which the grant applies.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  /**
    * The friendly name that identifies the grant. If a name was provided in the CreateGrant request, that name is returned. Otherwise this value is null.
    */
  var Name: js.UndefOr[GrantNameType] = js.undefined
  /**
    * The list of operations permitted by the grant.
    */
  var Operations: js.UndefOr[GrantOperationList] = js.undefined
  /**
    * The principal that can retire the grant.
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
}

object GrantListEntry {
  @scala.inline
  def apply(
    Constraints: GrantConstraints = null,
    CreationDate: DateType = null,
    GrantId: GrantIdType = null,
    GranteePrincipal: PrincipalIdType = null,
    IssuingAccount: PrincipalIdType = null,
    KeyId: KeyIdType = null,
    Name: GrantNameType = null,
    Operations: GrantOperationList = null,
    RetiringPrincipal: PrincipalIdType = null
  ): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    if (Constraints != null) __obj.updateDynamic("Constraints")(Constraints)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (GrantId != null) __obj.updateDynamic("GrantId")(GrantId)
    if (GranteePrincipal != null) __obj.updateDynamic("GranteePrincipal")(GranteePrincipal)
    if (IssuingAccount != null) __obj.updateDynamic("IssuingAccount")(IssuingAccount)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Operations != null) __obj.updateDynamic("Operations")(Operations)
    if (RetiringPrincipal != null) __obj.updateDynamic("RetiringPrincipal")(RetiringPrincipal)
    __obj.asInstanceOf[GrantListEntry]
  }
}


package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trust extends js.Object {
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined
  /**
    * The Directory ID of the AWS directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.undefined
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[TrustDirection] = js.undefined
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[TrustId] = js.undefined
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[TrustState] = js.undefined
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[TrustStateReason] = js.undefined
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[TrustType] = js.undefined
}

object Trust {
  @scala.inline
  def apply(
    CreatedDateTime: CreatedDateTime = null,
    DirectoryId: DirectoryId = null,
    LastUpdatedDateTime: LastUpdatedDateTime = null,
    RemoteDomainName: RemoteDomainName = null,
    SelectiveAuth: SelectiveAuth = null,
    StateLastUpdatedDateTime: StateLastUpdatedDateTime = null,
    TrustDirection: TrustDirection = null,
    TrustId: TrustId = null,
    TrustState: TrustState = null,
    TrustStateReason: TrustStateReason = null,
    TrustType: TrustType = null
  ): Trust = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (LastUpdatedDateTime != null) __obj.updateDynamic("LastUpdatedDateTime")(LastUpdatedDateTime)
    if (RemoteDomainName != null) __obj.updateDynamic("RemoteDomainName")(RemoteDomainName)
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    if (StateLastUpdatedDateTime != null) __obj.updateDynamic("StateLastUpdatedDateTime")(StateLastUpdatedDateTime)
    if (TrustDirection != null) __obj.updateDynamic("TrustDirection")(TrustDirection.asInstanceOf[js.Any])
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId)
    if (TrustState != null) __obj.updateDynamic("TrustState")(TrustState.asInstanceOf[js.Any])
    if (TrustStateReason != null) __obj.updateDynamic("TrustStateReason")(TrustStateReason)
    if (TrustType != null) __obj.updateDynamic("TrustType")(TrustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trust]
  }
}


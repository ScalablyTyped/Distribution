package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDetail extends StObject {
  
  /**
    * The Amazon Web Services account identifier for the member account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsDetectiveMod.AccountId] = js.undefined
  
  /**
    * The Amazon Web Services account identifier of the administrator account for the behavior graph.
    */
  var AdministratorId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The state of a data source package for the behavior graph.
    */
  var DatasourcePackageIngestStates: js.UndefOr[typings.awsSdk.clientsDetectiveMod.DatasourcePackageIngestStates] = js.undefined
  
  /**
    * For member accounts with a status of ACCEPTED_BUT_DISABLED, the reason that the member account is not enabled. The reason can have one of the following values:    VOLUME_TOO_HIGH - Indicates that adding the member account would cause the data volume for the behavior graph to be too high.    VOLUME_UNKNOWN - Indicates that Detective is unable to verify the data volume for the member account. This is usually because the member account is not enrolled in Amazon GuardDuty.   
    */
  var DisabledReason: js.UndefOr[MemberDisabledReason] = js.undefined
  
  /**
    * The Amazon Web Services account root user email address for the member account.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.clientsDetectiveMod.EmailAddress] = js.undefined
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.clientsDetectiveMod.GraphArn] = js.undefined
  
  /**
    * The type of behavior graph membership. For an organization account in the organization behavior graph, the type is ORGANIZATION. For an account that was invited to a behavior graph, the type is INVITATION. 
    */
  var InvitationType: js.UndefOr[typings.awsSdk.clientsDetectiveMod.InvitationType] = js.undefined
  
  /**
    * For invited accounts, the date and time that Detective sent the invitation to the account. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var InvitedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account identifier of the administrator account for the behavior graph.
    */
  var MasterId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The member account data volume as a percentage of the maximum allowed data volume. 0 indicates 0 percent, and 100 indicates 100 percent. Note that this is not the percentage of the behavior graph data volume. For example, the data volume for the behavior graph is 80 GB per day. The maximum data volume is 160 GB per day. If the data volume for the member account is 40 GB per day, then PercentOfGraphUtilization is 25. It represents 25% of the maximum allowed data volume. 
    */
  var PercentOfGraphUtilization: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The date and time when the graph utilization percentage was last updated. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var PercentOfGraphUtilizationUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current membership status of the member account. The status can have one of the following values:    INVITED - For invited accounts only. Indicates that the member was sent an invitation but has not yet responded.    VERIFICATION_IN_PROGRESS - For invited accounts only, indicates that Detective is verifying that the account identifier and email address provided for the member account match. If they do match, then Detective sends the invitation. If the email address and account identifier don't match, then the member cannot be added to the behavior graph. For organization accounts in the organization behavior graph, indicates that Detective is verifying that the account belongs to the organization.    VERIFICATION_FAILED - For invited accounts only. Indicates that the account and email address provided for the member account do not match, and Detective did not send an invitation to the account.    ENABLED - Indicates that the member account currently contributes data to the behavior graph. For invited accounts, the member account accepted the invitation. For organization accounts in the organization behavior graph, the Detective administrator account enabled the organization account as a member account.    ACCEPTED_BUT_DISABLED - The account accepted the invitation, or was enabled by the Detective administrator account, but is prevented from contributing data to the behavior graph. DisabledReason provides the reason why the member account is not enabled.   Invited accounts that declined an invitation or that were removed from the behavior graph are not included. In the organization behavior graph, organization accounts that the Detective administrator account did not enable are not included.
    */
  var Status: js.UndefOr[MemberStatus] = js.undefined
  
  /**
    * The date and time that the member account was last updated. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var UpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details on the volume of usage for each data source package in a behavior graph.
    */
  var VolumeUsageByDatasourcePackage: js.UndefOr[typings.awsSdk.clientsDetectiveMod.VolumeUsageByDatasourcePackage] = js.undefined
  
  /**
    * The data volume in bytes per day for the member account.
    */
  var VolumeUsageInBytes: js.UndefOr[ByteValue] = js.undefined
  
  /**
    * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var VolumeUsageUpdatedTime: js.UndefOr[js.Date] = js.undefined
}
object MemberDetail {
  
  inline def apply(): MemberDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberDetail]
  }
  
  extension [Self <: MemberDetail](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAdministratorId(value: AccountId): Self = StObject.set(x, "AdministratorId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorIdUndefined: Self = StObject.set(x, "AdministratorId", js.undefined)
    
    inline def setDatasourcePackageIngestStates(value: DatasourcePackageIngestStates): Self = StObject.set(x, "DatasourcePackageIngestStates", value.asInstanceOf[js.Any])
    
    inline def setDatasourcePackageIngestStatesUndefined: Self = StObject.set(x, "DatasourcePackageIngestStates", js.undefined)
    
    inline def setDisabledReason(value: MemberDisabledReason): Self = StObject.set(x, "DisabledReason", value.asInstanceOf[js.Any])
    
    inline def setDisabledReasonUndefined: Self = StObject.set(x, "DisabledReason", js.undefined)
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
    
    inline def setInvitationType(value: InvitationType): Self = StObject.set(x, "InvitationType", value.asInstanceOf[js.Any])
    
    inline def setInvitationTypeUndefined: Self = StObject.set(x, "InvitationType", js.undefined)
    
    inline def setInvitedTime(value: js.Date): Self = StObject.set(x, "InvitedTime", value.asInstanceOf[js.Any])
    
    inline def setInvitedTimeUndefined: Self = StObject.set(x, "InvitedTime", js.undefined)
    
    inline def setMasterId(value: AccountId): Self = StObject.set(x, "MasterId", value.asInstanceOf[js.Any])
    
    inline def setMasterIdUndefined: Self = StObject.set(x, "MasterId", js.undefined)
    
    inline def setPercentOfGraphUtilization(value: Percentage): Self = StObject.set(x, "PercentOfGraphUtilization", value.asInstanceOf[js.Any])
    
    inline def setPercentOfGraphUtilizationUndefined: Self = StObject.set(x, "PercentOfGraphUtilization", js.undefined)
    
    inline def setPercentOfGraphUtilizationUpdatedTime(value: js.Date): Self = StObject.set(x, "PercentOfGraphUtilizationUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setPercentOfGraphUtilizationUpdatedTimeUndefined: Self = StObject.set(x, "PercentOfGraphUtilizationUpdatedTime", js.undefined)
    
    inline def setStatus(value: MemberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTime(value: js.Date): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
    
    inline def setVolumeUsageByDatasourcePackage(value: VolumeUsageByDatasourcePackage): Self = StObject.set(x, "VolumeUsageByDatasourcePackage", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsageByDatasourcePackageUndefined: Self = StObject.set(x, "VolumeUsageByDatasourcePackage", js.undefined)
    
    inline def setVolumeUsageInBytes(value: ByteValue): Self = StObject.set(x, "VolumeUsageInBytes", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsageInBytesUndefined: Self = StObject.set(x, "VolumeUsageInBytes", js.undefined)
    
    inline def setVolumeUsageUpdatedTime(value: js.Date): Self = StObject.set(x, "VolumeUsageUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsageUpdatedTimeUndefined: Self = StObject.set(x, "VolumeUsageUpdatedTime", js.undefined)
  }
}

package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/guardduty", "GuardDuty")
@js.native
object GuardDutyNs extends js.Object {
  trait AcceptInvitationRequest extends js.Object {
    /**
      * The unique ID of the detector of the GuardDuty member account.
      */
    var DetectorId: __string
    /**
      * This value is used to validate the master account to the member account.
      */
    var InvitationId: InvitationId
    /**
      * The account ID of the master GuardDuty account whose invitation you're accepting.
      */
    var MasterId: MasterId
  }
  
  trait AcceptInvitationResponse extends js.Object
  
  trait AccessKeyDetails extends js.Object {
    /**
      * Access key ID of the user.
      */
    var AccessKeyId: js.UndefOr[__string] = js.undefined
    /**
      * The principal ID of the user.
      */
    var PrincipalId: js.UndefOr[__string] = js.undefined
    /**
      * The name of the user.
      */
    var UserName: js.UndefOr[__string] = js.undefined
    /**
      * The type of the user.
      */
    var UserType: js.UndefOr[__string] = js.undefined
  }
  
  trait AccountDetail extends js.Object {
    /**
      * Member account ID.
      */
    var AccountId: AccountId
    /**
      * Member account's email address.
      */
    var Email: Email
  }
  
  trait Action extends js.Object {
    /**
      * GuardDuty Finding activity type.
      */
    var ActionType: js.UndefOr[__string] = js.undefined
    /**
      * Information about the AWS_API_CALL action described in this finding.
      */
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction] = js.undefined
    /**
      * Information about the DNS_REQUEST action described in this finding.
      */
    var DnsRequestAction: js.UndefOr[DnsRequestAction] = js.undefined
    /**
      * Information about the NETWORK_CONNECTION action described in this finding.
      */
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction] = js.undefined
    /**
      * Information about the PORT_PROBE action described in this finding.
      */
    var PortProbeAction: js.UndefOr[PortProbeAction] = js.undefined
  }
  
  trait ArchiveFindingsRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
      */
    var DetectorId: __string
    /**
      * IDs of the findings that you want to archive.
      */
    var FindingIds: FindingIds
  }
  
  trait ArchiveFindingsResponse extends js.Object
  
  trait AwsApiCallAction extends js.Object {
    /**
      * AWS API name.
      */
    var Api: js.UndefOr[__string] = js.undefined
    /**
      * AWS API caller type.
      */
    var CallerType: js.UndefOr[__string] = js.undefined
    /**
      * Domain information for the AWS API call.
      */
    var DomainDetails: js.UndefOr[DomainDetails] = js.undefined
    /**
      * Remote IP information of the connection.
      */
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
    /**
      * AWS service name whose API was invoked.
      */
    var ServiceName: js.UndefOr[__string] = js.undefined
  }
  
  trait City extends js.Object {
    /**
      * City name of the remote IP address.
      */
    var CityName: js.UndefOr[__string] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Condition extends js.Object {
    /**
      * Represents the equal condition to be applied to a single field when querying for findings.
      */
    var Eq: js.UndefOr[Eq] = js.undefined
    /**
      * Represents the greater than condition to be applied to a single field when querying for findings.
      */
    var Gt: js.UndefOr[__integer] = js.undefined
    /**
      * Represents the greater than equal condition to be applied to a single field when querying for findings.
      */
    var Gte: js.UndefOr[__integer] = js.undefined
    /**
      * Represents the less than condition to be applied to a single field when querying for findings.
      */
    var Lt: js.UndefOr[__integer] = js.undefined
    /**
      * Represents the less than equal condition to be applied to a single field when querying for findings.
      */
    var Lte: js.UndefOr[__integer] = js.undefined
    /**
      * Represents the not equal condition to be applied to a single field when querying for findings.
      */
    var Neq: js.UndefOr[Neq] = js.undefined
  }
  
  trait Country extends js.Object {
    /**
      * Country code of the remote IP address.
      */
    var CountryCode: js.UndefOr[__string] = js.undefined
    /**
      * Country name of the remote IP address.
      */
    var CountryName: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDetectorRequest extends js.Object {
    /**
      * The idempotency token for the create request.
      */
    var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    /**
      * A boolean value that specifies whether the detector is to be enabled.
      */
    var Enable: Enable
    /**
      * A enum value that specifies how frequently customer got Finding updates published.
      */
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  }
  
  trait CreateDetectorResponse extends js.Object {
    /**
      * The unique ID of the created detector.
      */
    var DetectorId: js.UndefOr[DetectorId] = js.undefined
  }
  
  trait CreateFilterRequest extends js.Object {
    /**
      * Specifies the action that is to be applied to the findings that match the filter.
      */
    var Action: js.UndefOr[FilterAction] = js.undefined
    /**
      * The idempotency token for the create request.
      */
    var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    /**
      * The description of the filter.
      */
    var Description: js.UndefOr[FilterDescription] = js.undefined
    /**
      * The unique ID of the detector that you want to update.
      */
    var DetectorId: __string
    /**
      * Represents the criteria to be used in the filter for querying findings.
      */
    var FindingCriteria: FindingCriteria
    /**
      * The name of the filter.
      */
    var Name: FilterName
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    var Rank: js.UndefOr[FilterRank] = js.undefined
  }
  
  trait CreateFilterResponse extends js.Object {
    /**
      * The name of the successfully created filter.
      */
    var Name: js.UndefOr[FilterName] = js.undefined
  }
  
  trait CreateIPSetRequest extends js.Object {
    /**
      * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
      */
    var Activate: Activate
    /**
      * The idempotency token for the create request.
      */
    var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    /**
      * The unique ID of the detector that you want to update.
      */
    var DetectorId: __string
    /**
      * The format of the file that contains the IPSet.
      */
    var Format: IpSetFormat
    /**
      * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
      */
    var Location: Location
    /**
      * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
      */
    var Name: Name
  }
  
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: js.UndefOr[IpSetId] = js.undefined
  }
  
  trait CreateMembersRequest extends js.Object {
    /**
      * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty account.
      */
    var AccountDetails: AccountDetails
    /**
      * The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
      */
    var DetectorId: __string
  }
  
  trait CreateMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait CreateSampleFindingsRequest extends js.Object {
    /**
      * The ID of the detector to create sample findings for.
      */
    var DetectorId: __string
    /**
      * Types of sample findings that you want to generate.
      */
    var FindingTypes: js.UndefOr[FindingTypes] = js.undefined
  }
  
  trait CreateSampleFindingsResponse extends js.Object
  
  trait CreateThreatIntelSetRequest extends js.Object {
    /**
      * A boolean value that indicates whether GuardDuty is to start using the uploaded ThreatIntelSet.
      */
    var Activate: Activate
    /**
      * The idempotency token for the create request.
      */
    var ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    /**
      * The unique ID of the detector that you want to update.
      */
    var DetectorId: __string
    /**
      * The format of the file that contains the ThreatIntelSet.
      */
    var Format: ThreatIntelSetFormat
    /**
      * The URI of the file that contains the ThreatIntelSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
      */
    var Location: Location
    /**
      * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP addresses included in this ThreatIntelSet.
      */
    var Name: Name
  }
  
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: js.UndefOr[ThreatIntelSetId] = js.undefined
  }
  
  trait DeclineInvitationsRequest extends js.Object {
    /**
      * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to decline invitations from.
      */
    var AccountIds: AccountIds
  }
  
  trait DeclineInvitationsResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait DeleteDetectorRequest extends js.Object {
    /**
      * The unique ID that specifies the detector that you want to delete.
      */
    var DetectorId: __string
  }
  
  trait DeleteDetectorResponse extends js.Object
  
  trait DeleteFilterRequest extends js.Object {
    /**
      * The unique ID that specifies the detector where you want to delete a filter.
      */
    var DetectorId: __string
    /**
      * The name of the filter.
      */
    var FilterName: __string
  }
  
  trait DeleteFilterResponse extends js.Object
  
  trait DeleteIPSetRequest extends js.Object {
    /**
      * The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
      */
    var DetectorId: __string
    /**
      * The unique ID that specifies the IPSet that you want to delete.
      */
    var IpSetId: __string
  }
  
  trait DeleteIPSetResponse extends js.Object
  
  trait DeleteInvitationsRequest extends js.Object {
    /**
      * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to delete invitations from.
      */
    var AccountIds: AccountIds
  }
  
  trait DeleteInvitationsResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait DeleteMembersRequest extends js.Object {
    /**
      * A list of account IDs of the GuardDuty member accounts that you want to delete.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account whose members you want to delete.
      */
    var DetectorId: __string
  }
  
  trait DeleteMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait DeleteThreatIntelSetRequest extends js.Object {
    /**
      * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to delete.
      */
    var DetectorId: __string
    /**
      * The unique ID that specifies the ThreatIntelSet that you want to delete.
      */
    var ThreatIntelSetId: __string
  }
  
  trait DeleteThreatIntelSetResponse extends js.Object
  
  trait DisassociateFromMasterAccountRequest extends js.Object {
    /**
      * The unique ID of the detector of the GuardDuty member account.
      */
    var DetectorId: __string
  }
  
  trait DisassociateFromMasterAccountResponse extends js.Object
  
  trait DisassociateMembersRequest extends js.Object {
    /**
      * A list of account IDs of the GuardDuty member accounts that you want to disassociate from master.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account whose members you want to disassociate from master.
      */
    var DetectorId: __string
  }
  
  trait DisassociateMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait DnsRequestAction extends js.Object {
    /**
      * Domain information for the DNS request.
      */
    var Domain: js.UndefOr[Domain] = js.undefined
  }
  
  trait DomainDetails extends js.Object
  
  trait Finding extends js.Object {
    /**
      * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
      */
    var AccountId: __string
    /**
      * The ARN of a finding described by the action.
      */
    var Arn: __string
    /**
      * The confidence level of a finding.
      */
    var Confidence: js.UndefOr[__double] = js.undefined
    /**
      * The time stamp at which a finding was generated.
      */
    var CreatedAt: CreatedAt
    /**
      * The description of a finding.
      */
    var Description: js.UndefOr[__string] = js.undefined
    /**
      * The identifier that corresponds to a finding described by the action.
      */
    var Id: __string
    /**
      * The AWS resource partition.
      */
    var Partition: js.UndefOr[__string] = js.undefined
    /**
      * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
      */
    var Region: __string
    /**
      * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
      */
    var Resource: Resource
    /**
      * Findings' schema version.
      */
    var SchemaVersion: __string
    /**
      * Additional information assigned to the generated finding by GuardDuty.
      */
    var Service: js.UndefOr[Service] = js.undefined
    /**
      * The severity of a finding.
      */
    var Severity: __double
    /**
      * The title of a finding.
      */
    var Title: js.UndefOr[__string] = js.undefined
    /**
      * The type of a finding described by the action.
      */
    var Type: __string
    /**
      * The time stamp at which a finding was last updated.
      */
    var UpdatedAt: UpdatedAt
  }
  
  trait FindingCriteria extends js.Object {
    /**
      * Represents a map of finding properties that match specified conditions and values when querying findings.
      */
    var Criterion: js.UndefOr[__mapOfCondition] = js.undefined
  }
  
  trait FindingStatistics extends js.Object {
    /**
      * Represents a map of severity to count statistic for a set of findings
      */
    var CountBySeverity: js.UndefOr[__mapOfCountBySeverityFindingStatistic] = js.undefined
  }
  
  trait GeoLocation extends js.Object {
    /**
      * Latitude information of remote IP address.
      */
    var Lat: js.UndefOr[__double] = js.undefined
    /**
      * Longitude information of remote IP address.
      */
    var Lon: js.UndefOr[__double] = js.undefined
  }
  
  trait GetDetectorRequest extends js.Object {
    /**
      * The unique ID of the detector that you want to retrieve.
      */
    var DetectorId: __string
  }
  
  trait GetDetectorResponse extends js.Object {
    var CreatedAt: js.UndefOr[CreatedAt] = js.undefined
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
    var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
    var Status: js.UndefOr[DetectorStatus] = js.undefined
    var UpdatedAt: js.UndefOr[UpdatedAt] = js.undefined
  }
  
  trait GetFilterRequest extends js.Object {
    /**
      * The detector ID that specifies the GuardDuty service where you want to list the details of the specified filter.
      */
    var DetectorId: __string
    /**
      * The name of the filter whose details you want to get.
      */
    var FilterName: __string
  }
  
  trait GetFilterResponse extends js.Object {
    /**
      * Specifies the action that is to be applied to the findings that match the filter.
      */
    var Action: js.UndefOr[FilterAction] = js.undefined
    /**
      * The description of the filter.
      */
    var Description: js.UndefOr[FilterDescription] = js.undefined
    /**
      * Represents the criteria to be used in the filter for querying findings.
      */
    var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    /**
      * The name of the filter.
      */
    var Name: js.UndefOr[FilterName] = js.undefined
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    var Rank: js.UndefOr[FilterRank] = js.undefined
  }
  
  trait GetFindingsRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings you want to retrieve.
      */
    var DetectorId: __string
    /**
      * IDs of the findings that you want to retrieve.
      */
    var FindingIds: FindingIds
    /**
      * Represents the criteria used for sorting findings.
      */
    var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
  }
  
  trait GetFindingsResponse extends js.Object {
    var Findings: js.UndefOr[Findings] = js.undefined
  }
  
  trait GetFindingsStatisticsRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
      */
    var DetectorId: __string
    /**
      * Represents the criteria used for querying findings.
      */
    var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    /**
      * Types of finding statistics to retrieve.
      */
    var FindingStatisticTypes: FindingStatisticTypes
  }
  
  trait GetFindingsStatisticsResponse extends js.Object {
    /**
      * Finding statistics object.
      */
    var FindingStatistics: js.UndefOr[FindingStatistics] = js.undefined
  }
  
  trait GetIPSetRequest extends js.Object {
    /**
      * The detectorID that specifies the GuardDuty service whose IPSet you want to retrieve.
      */
    var DetectorId: __string
    /**
      * The unique ID that specifies the IPSet that you want to describe.
      */
    var IpSetId: __string
  }
  
  trait GetIPSetResponse extends js.Object {
    /**
      * The format of the file that contains the IPSet.
      */
    var Format: js.UndefOr[IpSetFormat] = js.undefined
    /**
      * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
      */
    var Location: js.UndefOr[Location] = js.undefined
    /**
      * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The status of ipSet file uploaded.
      */
    var Status: js.UndefOr[IpSetStatus] = js.undefined
  }
  
  trait GetInvitationsCountRequest extends js.Object
  
  trait GetInvitationsCountResponse extends js.Object {
    /**
      * The number of received invitations.
      */
    var InvitationsCount: js.UndefOr[__integer] = js.undefined
  }
  
  trait GetMasterAccountRequest extends js.Object {
    /**
      * The unique ID of the detector of the GuardDuty member account.
      */
    var DetectorId: __string
  }
  
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Master] = js.undefined
  }
  
  trait GetMembersRequest extends js.Object {
    /**
      * A list of account IDs of the GuardDuty member accounts that you want to describe.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account whose members you want to retrieve.
      */
    var DetectorId: __string
  }
  
  trait GetMembersResponse extends js.Object {
    var Members: js.UndefOr[Members] = js.undefined
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait GetThreatIntelSetRequest extends js.Object {
    /**
      * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to describe.
      */
    var DetectorId: __string
    /**
      * The unique ID that specifies the ThreatIntelSet that you want to describe.
      */
    var ThreatIntelSetId: __string
  }
  
  trait GetThreatIntelSetResponse extends js.Object {
    /**
      * The format of the threatIntelSet.
      */
    var Format: js.UndefOr[ThreatIntelSetFormat] = js.undefined
    /**
      * The URI of the file that contains the ThreatIntelSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
      */
    var Location: js.UndefOr[Location] = js.undefined
    /**
      * A user-friendly ThreatIntelSet name that is displayed in all finding generated by activity that involves IP addresses included in this ThreatIntelSet.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The status of threatIntelSet file uploaded.
      */
    var Status: js.UndefOr[ThreatIntelSetStatus] = js.undefined
  }
  
  trait IamInstanceProfile extends js.Object {
    /**
      * AWS EC2 instance profile ARN.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * AWS EC2 instance profile ID.
      */
    var Id: js.UndefOr[__string] = js.undefined
  }
  
  trait InstanceDetails extends js.Object {
    /**
      * The availability zone of the EC2 instance.
      */
    var AvailabilityZone: js.UndefOr[__string] = js.undefined
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined
    /**
      * The image description of the EC2 instance.
      */
    var ImageDescription: js.UndefOr[__string] = js.undefined
    /**
      * The image ID of the EC2 instance.
      */
    var ImageId: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the EC2 instance.
      */
    var InstanceId: js.UndefOr[__string] = js.undefined
    /**
      * The state of the EC2 instance.
      */
    var InstanceState: js.UndefOr[__string] = js.undefined
    /**
      * The type of the EC2 instance.
      */
    var InstanceType: js.UndefOr[__string] = js.undefined
    /**
      * The launch time of the EC2 instance.
      */
    var LaunchTime: js.UndefOr[__string] = js.undefined
    /**
      * The network interface information of the EC2 instance.
      */
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
    /**
      * The platform of the EC2 instance.
      */
    var Platform: js.UndefOr[__string] = js.undefined
    /**
      * The product code of the EC2 instance.
      */
    var ProductCodes: js.UndefOr[ProductCodes] = js.undefined
    /**
      * The tags of the EC2 instance.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Invitation extends js.Object {
    /**
      * Inviter account ID
      */
    var AccountId: js.UndefOr[__string] = js.undefined
    /**
      * This value is used to validate the inviter account to the member account.
      */
    var InvitationId: js.UndefOr[InvitationId] = js.undefined
    /**
      * Timestamp at which the invitation was sent
      */
    var InvitedAt: js.UndefOr[InvitedAt] = js.undefined
    /**
      * The status of the relationship between the inviter and invitee accounts.
      */
    var RelationshipStatus: js.UndefOr[__string] = js.undefined
  }
  
  trait InviteMembersRequest extends js.Object {
    /**
      * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account with which you want to invite members.
      */
    var DetectorId: __string
    /**
      * A boolean value that specifies whether you want to disable email notification to the accounts that you’re inviting to GuardDuty as members.
      */
    var DisableEmailNotification: js.UndefOr[__boolean] = js.undefined
    /**
      * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
      */
    var Message: js.UndefOr[Message] = js.undefined
  }
  
  trait InviteMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait ListDetectorsRequest extends js.Object {
    /**
      * You can use this parameter to indicate the maximum number of detectors that you want in the response.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListDetectors action. For subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: js.UndefOr[DetectorIds] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListFiltersRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service where you want to list filters.
      */
    var DetectorId: __string
    /**
      * Indicates the maximum number of items that you want in the response. The maximum value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Paginates results. Set the value of this parameter to NULL on your first call to the ListFilters operation.For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFiltersResponse extends js.Object {
    var FilterNames: js.UndefOr[FilterNames] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListFindingsRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
      */
    var DetectorId: __string
    /**
      * Represents the criteria used for querying findings.
      */
    var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    /**
      * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListFindings action. For subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Represents the criteria used for sorting findings.
      */
    var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
  }
  
  trait ListFindingsResponse extends js.Object {
    var FindingIds: js.UndefOr[FindingIds] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIPSetsRequest extends js.Object {
    /**
      * The unique ID of the detector that you want to retrieve.
      */
    var DetectorId: __string
    /**
      * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 7. The maximum value is 7.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListIPSet action. For subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListIPSetsResponse extends js.Object {
    var IpSetIds: js.UndefOr[IpSetIds] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListInvitationsRequest extends js.Object {
    /**
      * You can use this parameter to indicate the maximum number of invitations you want in the response. The default value is 50. The maximum value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListInvitations action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[Invitations] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListMembersRequest extends js.Object {
    /**
      * The unique ID of the detector of the GuardDuty account whose members you want to list.
      */
    var DetectorId: __string
    /**
      * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 1. The maximum value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListMembers action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Specifies what member accounts the response is to include based on their relationship status with the master account. The default value is TRUE. If onlyAssociated is set to TRUE, the response will include member accounts whose relationship status with the master is set to Enabled, Disabled. If onlyAssociated is set to FALSE, the response will include all existing member accounts.
      */
    var OnlyAssociated: js.UndefOr[__string] = js.undefined
  }
  
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[Members] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListThreatIntelSetsRequest extends js.Object {
    /**
      * The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
      */
    var DetectorId: __string
    /**
      * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 7. The maximum value is 7.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Pagination token to start retrieving threat intel sets from.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListThreatIntelSetsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken] = js.undefined
    var ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds] = js.undefined
  }
  
  trait LocalPortDetails extends js.Object {
    /**
      * Port number of the local connection.
      */
    var Port: js.UndefOr[__integer] = js.undefined
    /**
      * Port name of the local connection.
      */
    var PortName: js.UndefOr[__string] = js.undefined
  }
  
  trait Master extends js.Object {
    /**
      * Master account ID
      */
    var AccountId: js.UndefOr[__string] = js.undefined
    /**
      * This value is used to validate the master account to the member account.
      */
    var InvitationId: js.UndefOr[InvitationId] = js.undefined
    /**
      * Timestamp at which the invitation was sent
      */
    var InvitedAt: js.UndefOr[InvitedAt] = js.undefined
    /**
      * The status of the relationship between the master and member accounts.
      */
    var RelationshipStatus: js.UndefOr[__string] = js.undefined
  }
  
  trait Member extends js.Object {
    var AccountId: AccountId
    var DetectorId: js.UndefOr[DetectorId] = js.undefined
    /**
      * Member account's email address.
      */
    var Email: Email
    /**
      * Timestamp at which the invitation was sent
      */
    var InvitedAt: js.UndefOr[InvitedAt] = js.undefined
    var MasterId: MasterId
    /**
      * The status of the relationship between the member and the master.
      */
    var RelationshipStatus: __string
    var UpdatedAt: UpdatedAt
  }
  
  trait NetworkConnectionAction extends js.Object {
    /**
      * Network connection blocked information.
      */
    var Blocked: js.UndefOr[__boolean] = js.undefined
    /**
      * Network connection direction.
      */
    var ConnectionDirection: js.UndefOr[__string] = js.undefined
    /**
      * Local port information of the connection.
      */
    var LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined
    /**
      * Network connection protocol.
      */
    var Protocol: js.UndefOr[__string] = js.undefined
    /**
      * Remote IP information of the connection.
      */
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
    /**
      * Remote port information of the connection.
      */
    var RemotePortDetails: js.UndefOr[RemotePortDetails] = js.undefined
  }
  
  trait NetworkInterface extends js.Object {
    /**
      * A list of EC2 instance IPv6 address information.
      */
    var Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined
    /**
      * The ID of the network interface
      */
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
    /**
      * Private DNS name of the EC2 instance.
      */
    var PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined
    /**
      * Private IP address of the EC2 instance.
      */
    var PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined
    /**
      * Other private IP address information of the EC2 instance.
      */
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined
    /**
      * Public DNS name of the EC2 instance.
      */
    var PublicDnsName: js.UndefOr[__string] = js.undefined
    /**
      * Public IP address of the EC2 instance.
      */
    var PublicIp: js.UndefOr[__string] = js.undefined
    /**
      * Security groups associated with the EC2 instance.
      */
    var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
      * The subnet ID of the EC2 instance.
      */
    var SubnetId: js.UndefOr[__string] = js.undefined
    /**
      * The VPC ID of the EC2 instance.
      */
    var VpcId: js.UndefOr[__string] = js.undefined
  }
  
  trait Organization extends js.Object {
    /**
      * Autonomous system number of the internet provider of the remote IP address.
      */
    var Asn: js.UndefOr[__string] = js.undefined
    /**
      * Organization that registered this ASN.
      */
    var AsnOrg: js.UndefOr[__string] = js.undefined
    /**
      * ISP information for the internet provider.
      */
    var Isp: js.UndefOr[__string] = js.undefined
    /**
      * Name of the internet provider.
      */
    var Org: js.UndefOr[__string] = js.undefined
  }
  
  trait PortProbeAction extends js.Object {
    /**
      * Port probe blocked information.
      */
    var Blocked: js.UndefOr[__boolean] = js.undefined
    /**
      * A list of port probe details objects.
      */
    var PortProbeDetails: js.UndefOr[__listOfPortProbeDetail] = js.undefined
  }
  
  trait PortProbeDetail extends js.Object {
    /**
      * Local port information of the connection.
      */
    var LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined
    /**
      * Remote IP information of the connection.
      */
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
  }
  
  trait PrivateIpAddressDetails extends js.Object {
    /**
      * Private DNS name of the EC2 instance.
      */
    var PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined
    /**
      * Private IP address of the EC2 instance.
      */
    var PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined
  }
  
  trait ProductCode extends js.Object {
    /**
      * Product code information.
      */
    var Code: js.UndefOr[__string] = js.undefined
    /**
      * Product code type.
      */
    var ProductType: js.UndefOr[__string] = js.undefined
  }
  
  trait RemoteIpDetails extends js.Object {
    /**
      * City information of the remote IP address.
      */
    var City: js.UndefOr[City] = js.undefined
    /**
      * Country code of the remote IP address.
      */
    var Country: js.UndefOr[Country] = js.undefined
    /**
      * Location information of the remote IP address.
      */
    var GeoLocation: js.UndefOr[GeoLocation] = js.undefined
    /**
      * IPV4 remote address of the connection.
      */
    var IpAddressV4: js.UndefOr[__string] = js.undefined
    /**
      * ISP Organization information of the remote IP address.
      */
    var Organization: js.UndefOr[Organization] = js.undefined
  }
  
  trait RemotePortDetails extends js.Object {
    /**
      * Port number of the remote connection.
      */
    var Port: js.UndefOr[__integer] = js.undefined
    /**
      * Port name of the remote connection.
      */
    var PortName: js.UndefOr[__string] = js.undefined
  }
  
  trait Resource extends js.Object {
    var AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined
    var InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined
    /**
      * The type of the AWS resource.
      */
    var ResourceType: js.UndefOr[__string] = js.undefined
  }
  
  trait SecurityGroup extends js.Object {
    /**
      * EC2 instance's security group ID.
      */
    var GroupId: js.UndefOr[__string] = js.undefined
    /**
      * EC2 instance's security group name.
      */
    var GroupName: js.UndefOr[__string] = js.undefined
  }
  
  trait Service extends js.Object {
    /**
      * Information about the activity described in a finding.
      */
    var Action: js.UndefOr[Action] = js.undefined
    /**
      * Indicates whether this finding is archived.
      */
    var Archived: js.UndefOr[__boolean] = js.undefined
    /**
      * Total count of the occurrences of this finding type.
      */
    var Count: js.UndefOr[__integer] = js.undefined
    /**
      * Detector ID for the GuardDuty service.
      */
    var DetectorId: js.UndefOr[DetectorId] = js.undefined
    /**
      * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
      */
    var EventFirstSeen: js.UndefOr[__string] = js.undefined
    /**
      * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
      */
    var EventLastSeen: js.UndefOr[__string] = js.undefined
    /**
      * Resource role information for this finding.
      */
    var ResourceRole: js.UndefOr[__string] = js.undefined
    /**
      * The name of the AWS service (GuardDuty) that generated a finding.
      */
    var ServiceName: js.UndefOr[__string] = js.undefined
    /**
      * Feedback left about the finding.
      */
    var UserFeedback: js.UndefOr[__string] = js.undefined
  }
  
  trait SortCriteria extends js.Object {
    /**
      * Represents the finding attribute (for example, accountId) by which to sort findings.
      */
    var AttributeName: js.UndefOr[__string] = js.undefined
    /**
      * Order by which the sorted findings are to be displayed.
      */
    var OrderBy: js.UndefOr[OrderBy] = js.undefined
  }
  
  trait StartMonitoringMembersRequest extends js.Object {
    /**
      * A list of account IDs of the GuardDuty member accounts whose findings you want the master account to monitor.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account whom you want to re-enable to monitor members' findings.
      */
    var DetectorId: __string
  }
  
  trait StartMonitoringMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait StopMonitoringMembersRequest extends js.Object {
    /**
      * A list of account IDs of the GuardDuty member accounts whose findings you want the master account to stop monitoring.
      */
    var AccountIds: AccountIds
    /**
      * The unique ID of the detector of the GuardDuty account that you want to stop from monitor members' findings.
      */
    var DetectorId: __string
  }
  
  trait StopMonitoringMembersResponse extends js.Object {
    /**
      * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
      */
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * EC2 instance tag key.
      */
    var Key: js.UndefOr[__string] = js.undefined
    /**
      * EC2 instance tag value.
      */
    var Value: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Accepts the invitation to be monitored by a master GuardDuty account.
      */
    def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptInvitation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Accepts the invitation to be monitored by a master GuardDuty account.
      */
    def acceptInvitation(params: AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptInvitation(
      params: AcceptInvitationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Archives Amazon GuardDuty findings specified by the list of finding IDs.
      */
    def archiveFindings(): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def archiveFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Archives Amazon GuardDuty findings specified by the list of finding IDs.
      */
    def archiveFindings(params: ArchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def archiveFindings(
      params: ArchiveFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
      */
    def createDetector(): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDetector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
      */
    def createDetector(params: CreateDetectorRequest): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDetector(
      params: CreateDetectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a filter using the specified finding criteria.
      */
    def createFilter(): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a filter using the specified finding criteria.
      */
    def createFilter(params: CreateFilterRequest): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFilter(
      params: CreateFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
      */
    def createIPSet(): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
      */
    def createIPSet(params: CreateIPSetRequest): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIPSet(
      params: CreateIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
      */
    def createMembers(): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
      */
    def createMembers(params: CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMembers(
      params: CreateMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
      */
    def createSampleFindings(): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSampleFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSampleFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
      */
    def createSampleFindings(params: CreateSampleFindingsRequest): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSampleFindings(
      params: CreateSampleFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSampleFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
      */
    def createThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThreatIntelSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
      */
    def createThreatIntelSet(params: CreateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createThreatIntelSet(
      params: CreateThreatIntelSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Declines invitations sent to the current member account by AWS account specified by their account IDs.
      */
    def declineInvitations(): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def declineInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeclineInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Declines invitations sent to the current member account by AWS account specified by their account IDs.
      */
    def declineInvitations(params: DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def declineInvitations(
      params: DeclineInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeclineInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Amazon GuardDuty detector specified by the detector ID.
      */
    def deleteDetector(): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDetector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a Amazon GuardDuty detector specified by the detector ID.
      */
    def deleteDetector(params: DeleteDetectorRequest): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDetector(
      params: DeleteDetectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the filter specified by the filter name.
      */
    def deleteFilter(): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the filter specified by the filter name.
      */
    def deleteFilter(params: DeleteFilterRequest): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFilter(
      params: DeleteFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the IPSet specified by the IPSet ID.
      */
    def deleteIPSet(): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the IPSet specified by the IPSet ID.
      */
    def deleteIPSet(params: DeleteIPSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIPSet(
      params: DeleteIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
      */
    def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
      */
    def deleteInvitations(params: DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteInvitations(
      params: DeleteInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def deleteMembers(): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def deleteMembers(params: DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMembers(
      params: DeleteMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
      */
    def deleteThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThreatIntelSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
      */
    def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThreatIntelSet(
      params: DeleteThreatIntelSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the current GuardDuty member account from its master account.
      */
    def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateFromMasterAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFromMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the current GuardDuty member account from its master account.
      */
    def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateFromMasterAccount(
      params: DisassociateFromMasterAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFromMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def disassociateMembers(params: DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateMembers(
      params: DisassociateMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an Amazon GuardDuty detector specified by the detectorId.
      */
    def getDetector(): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDetector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an Amazon GuardDuty detector specified by the detectorId.
      */
    def getDetector(params: GetDetectorRequest): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDetector(
      params: GetDetectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the filter specified by the filter name.
      */
    def getFilter(): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the details of the filter specified by the filter name.
      */
    def getFilter(params: GetFilterRequest): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFilter(
      params: GetFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon GuardDuty findings specified by finding IDs.
      */
    def getFindings(): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes Amazon GuardDuty findings specified by finding IDs.
      */
    def getFindings(params: GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFindings(
      params: GetFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
      */
    def getFindingsStatistics(): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFindingsStatistics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsStatisticsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
      */
    def getFindingsStatistics(params: GetFindingsStatisticsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFindingsStatistics(
      params: GetFindingsStatisticsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsStatisticsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the IPSet specified by the IPSet ID.
      */
    def getIPSet(): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the IPSet specified by the IPSet ID.
      */
    def getIPSet(params: GetIPSetRequest): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIPSet(
      params: GetIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
      */
    def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvitationsCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationsCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
      */
    def getInvitationsCount(params: GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvitationsCount(
      params: GetInvitationsCountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationsCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides the details for the GuardDuty master account to the current GuardDuty member account.
      */
    def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMasterAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides the details for the GuardDuty master account to the current GuardDuty member account.
      */
    def getMasterAccount(params: GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMasterAccount(
      params: GetMasterAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def getMembers(): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
      */
    def getMembers(params: GetMembersRequest): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMembers(
      params: GetMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
      */
    def getThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThreatIntelSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
      */
    def getThreatIntelSet(params: GetThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThreatIntelSet(
      params: GetThreatIntelSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
      */
    def inviteMembers(): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def inviteMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
      */
    def inviteMembers(params: InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def inviteMembers(
      params: InviteMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
      */
    def listDetectors(): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDetectors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDetectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
      */
    def listDetectors(params: ListDetectorsRequest): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDetectors(
      params: ListDetectorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDetectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a paginated list of the current filters.
      */
    def listFilters(): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFilters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a paginated list of the current filters.
      */
    def listFilters(params: ListFiltersRequest): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFilters(
      params: ListFiltersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFiltersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists Amazon GuardDuty findings for the specified detector ID.
      */
    def listFindings(): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists Amazon GuardDuty findings for the specified detector ID.
      */
    def listFindings(params: ListFindingsRequest): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFindings(
      params: ListFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IPSets of the GuardDuty service specified by the detector ID.
      */
    def listIPSets(): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIPSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIPSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the IPSets of the GuardDuty service specified by the detector ID.
      */
    def listIPSets(params: ListIPSetsRequest): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIPSets(
      params: ListIPSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIPSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all GuardDuty membership invitations that were sent to the current AWS account.
      */
    def listInvitations(): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all GuardDuty membership invitations that were sent to the current AWS account.
      */
    def listInvitations(params: ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInvitations(
      params: ListInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists details about all member accounts for the current GuardDuty master account.
      */
    def listMembers(): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists details about all member accounts for the current GuardDuty master account.
      */
    def listMembers(params: ListMembersRequest): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMembers(
      params: ListMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
      */
    def listThreatIntelSets(): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThreatIntelSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThreatIntelSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
      */
    def listThreatIntelSets(params: ListThreatIntelSetsRequest): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listThreatIntelSets(
      params: ListThreatIntelSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListThreatIntelSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
      */
    def startMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMonitoringMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMonitoringMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
      */
    def startMonitoringMembers(params: StartMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMonitoringMembers(
      params: StartMonitoringMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMonitoringMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
      */
    def stopMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopMonitoringMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopMonitoringMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
      */
    def stopMonitoringMembers(params: StopMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopMonitoringMembers(
      params: StopMonitoringMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopMonitoringMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
      */
    def unarchiveFindings(): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unarchiveFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UnarchiveFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
      */
    def unarchiveFindings(params: UnarchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unarchiveFindings(
      params: UnarchiveFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UnarchiveFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon GuardDuty detector specified by the detectorId.
      */
    def updateDetector(): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDetector(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon GuardDuty detector specified by the detectorId.
      */
    def updateDetector(params: UpdateDetectorRequest): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDetector(
      params: UpdateDetectorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDetectorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the filter specified by the filter name.
      */
    def updateFilter(): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFilter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the filter specified by the filter name.
      */
    def updateFilter(params: UpdateFilterRequest): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFilter(
      params: UpdateFilterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFilterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Marks specified Amazon GuardDuty findings as useful or not useful.
      */
    def updateFindingsFeedback(): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFindingsFeedback(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFindingsFeedbackResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Marks specified Amazon GuardDuty findings as useful or not useful.
      */
    def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFindingsFeedback(
      params: UpdateFindingsFeedbackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFindingsFeedbackResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the IPSet specified by the IPSet ID.
      */
    def updateIPSet(): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the IPSet specified by the IPSet ID.
      */
    def updateIPSet(params: UpdateIPSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateIPSet(
      params: UpdateIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
      */
    def updateThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThreatIntelSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
      */
    def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThreatIntelSet(
      params: UpdateThreatIntelSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThreatIntelSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnarchiveFindingsRequest extends js.Object {
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings you want to unarchive.
      */
    var DetectorId: __string
    /**
      * IDs of the findings that you want to unarchive.
      */
    var FindingIds: FindingIds
  }
  
  trait UnarchiveFindingsResponse extends js.Object
  
  trait UnprocessedAccount extends js.Object {
    /**
      * AWS Account ID.
      */
    var AccountId: __string
    /**
      * A reason why the account hasn't been processed.
      */
    var Result: __string
  }
  
  trait UpdateDetectorRequest extends js.Object {
    /**
      * The unique ID of the detector that you want to update.
      */
    var DetectorId: __string
    /**
      * Updated boolean value for the detector that specifies whether the detector is enabled.
      */
    var Enable: js.UndefOr[Enable] = js.undefined
    /**
      * A enum value that specifies how frequently customer got Finding updates published.
      */
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
  }
  
  trait UpdateDetectorResponse extends js.Object
  
  trait UpdateFilterRequest extends js.Object {
    /**
      * Specifies the action that is to be applied to the findings that match the filter.
      */
    var Action: js.UndefOr[FilterAction] = js.undefined
    /**
      * The description of the filter.
      */
    var Description: js.UndefOr[FilterDescription] = js.undefined
    /**
      * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
      */
    var DetectorId: __string
    /**
      * The name of the filter.
      */
    var FilterName: __string
    /**
      * Represents the criteria to be used in the filter for querying findings.
      */
    var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    /**
      * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
      */
    var Rank: js.UndefOr[FilterRank] = js.undefined
  }
  
  trait UpdateFilterResponse extends js.Object {
    /**
      * The name of the filter.
      */
    var Name: js.UndefOr[FilterName] = js.undefined
  }
  
  trait UpdateFindingsFeedbackRequest extends js.Object {
    /**
      * Additional feedback about the GuardDuty findings.
      */
    var Comments: js.UndefOr[Comments] = js.undefined
    /**
      * The ID of the detector that specifies the GuardDuty service whose findings you want to mark as useful or not useful.
      */
    var DetectorId: __string
    /**
      * Valid values: USEFUL | NOT_USEFUL
      */
    var Feedback: Feedback
    /**
      * IDs of the findings that you want to mark as useful or not useful.
      */
    var FindingIds: FindingIds
  }
  
  trait UpdateFindingsFeedbackResponse extends js.Object
  
  trait UpdateIPSetRequest extends js.Object {
    /**
      * The updated boolean value that specifies whether the IPSet is active or not.
      */
    var Activate: js.UndefOr[Activate] = js.undefined
    /**
      * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
      */
    var DetectorId: __string
    /**
      * The unique ID that specifies the IPSet that you want to update.
      */
    var IpSetId: __string
    /**
      * The updated URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
      */
    var Location: js.UndefOr[Location] = js.undefined
    /**
      * The unique ID that specifies the IPSet that you want to update.
      */
    var Name: js.UndefOr[Name] = js.undefined
  }
  
  trait UpdateIPSetResponse extends js.Object
  
  trait UpdateThreatIntelSetRequest extends js.Object {
    /**
      * The updated boolean value that specifies whether the ThreateIntelSet is active or not.
      */
    var Activate: js.UndefOr[Activate] = js.undefined
    /**
      * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
      */
    var DetectorId: __string
    /**
      * The updated URI of the file that contains the ThreateIntelSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
      */
    var Location: js.UndefOr[Location] = js.undefined
    /**
      * The unique ID that specifies the ThreatIntelSet that you want to update.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The unique ID that specifies the ThreatIntelSet that you want to update.
      */
    var ThreatIntelSetId: __string
  }
  
  trait UpdateThreatIntelSetResponse extends js.Object
  
  trait _DetectorStatus extends js.Object
  
  trait _Feedback extends js.Object
  
  trait _FilterAction extends js.Object
  
  trait _FindingPublishingFrequency extends js.Object
  
  trait _IpSetFormat extends js.Object
  
  trait _IpSetStatus extends js.Object
  
  trait _OrderBy extends js.Object
  
  trait _ThreatIntelSetFormat extends js.Object
  
  trait _ThreatIntelSetStatus extends js.Object
  
  trait __mapOfCondition
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Condition]
  
  trait __mapOfCountBySeverityFindingStatistic
    extends /* key */ org.scalablytyped.runtime.StringDictionary[CountBySeverityFindingStatistic]
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountDetails = js.Array[AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[__string]
  type Activate = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Comments = java.lang.String
  type CountBySeverityFindingStatistic = scala.Double
  type CreatedAt = java.lang.String
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[DetectorId]
  type DetectorStatus = _DetectorStatus | java.lang.String
  type Domain = java.lang.String
  type Email = java.lang.String
  type Enable = scala.Boolean
  type Eq = js.Array[__string]
  type Feedback = _Feedback | java.lang.String
  type FilterAction = _FilterAction | java.lang.String
  type FilterDescription = java.lang.String
  type FilterName = java.lang.String
  type FilterNames = js.Array[FilterName]
  type FilterRank = scala.Double
  type FindingId = java.lang.String
  type FindingIds = js.Array[FindingId]
  type FindingPublishingFrequency = _FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = awsDashSdkLib.awsDashSdkLibStrings.COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[FindingType]
  type Findings = js.Array[Finding]
  type InvitationId = java.lang.String
  type Invitations = js.Array[Invitation]
  type InvitedAt = java.lang.String
  type IpSetFormat = _IpSetFormat | java.lang.String
  type IpSetId = java.lang.String
  type IpSetIds = js.Array[IpSetId]
  type IpSetStatus = _IpSetStatus | java.lang.String
  type Ipv6Address = java.lang.String
  type Ipv6Addresses = js.Array[Ipv6Address]
  type Location = java.lang.String
  type MasterId = java.lang.String
  type MaxResults = scala.Double
  type Members = js.Array[Member]
  type Message = java.lang.String
  type Name = java.lang.String
  type Neq = js.Array[__string]
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NextToken = java.lang.String
  type OrderBy = _OrderBy | java.lang.String
  type PrivateDnsName = java.lang.String
  type PrivateIpAddress = java.lang.String
  type PrivateIpAddresses = js.Array[PrivateIpAddressDetails]
  type ProductCodes = js.Array[ProductCode]
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceRole = java.lang.String
  type Tags = js.Array[Tag]
  type ThreatIntelSetFormat = _ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetId = java.lang.String
  type ThreatIntelSetIds = js.Array[ThreatIntelSetId]
  type ThreatIntelSetStatus = _ThreatIntelSetStatus | java.lang.String
  type UnprocessedAccounts = js.Array[UnprocessedAccount]
  type UpdatedAt = java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __listOfPortProbeDetail = js.Array[PortProbeDetail]
  type __string = java.lang.String
  type __stringMin0Max64 = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}


package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsManagedblockchainMod {
  import typings.awsDashSdk.awsDashSdkStrings.HYPERLEDGER_FABRIC
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AvailabilityZoneString = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STARTER
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - java.lang.String
  */
  type Edition = _Edition | java.lang.String
  type Framework = HYPERLEDGER_FABRIC | java.lang.String
  type FrameworkVersionString = java.lang.String
  type InstanceTypeString = java.lang.String
  type InvitationList = js.Array[Invitation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPTED
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPTING
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type InvitationStatus = _InvitationStatus | java.lang.String
  type InviteActionList = js.Array[InviteAction]
  type IsOwned = Boolean
  type MemberListMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type MemberStatus = _MemberStatus | java.lang.String
  type MemberSummaryList = js.Array[MemberSummary]
  type NameString = java.lang.String
  type NetworkListMaxResults = Double
  type NetworkMemberNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type NetworkStatus = _NetworkStatus | java.lang.String
  type NetworkSummaryList = js.Array[NetworkSummary]
  type NodeListMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type NodeStatus = _NodeStatus | java.lang.String
  type NodeSummaryList = js.Array[NodeSummary]
  type PaginationToken = java.lang.String
  type PasswordString = java.lang.String
  type PrincipalString = java.lang.String
  type ProposalDurationInt = Double
  type ProposalListMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.APPROVED
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - typings.awsDashSdk.awsDashSdkStrings.ACTION_FAILED
    - java.lang.String
  */
  type ProposalStatus = _ProposalStatus | java.lang.String
  type ProposalSummaryList = js.Array[ProposalSummary]
  type ProposalVoteList = js.Array[VoteSummary]
  type RemoveActionList = js.Array[RemoveAction]
  type ResourceIdString = java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN
    - typings.awsDashSdk.awsDashSdkStrings.GREATER_THAN_OR_EQUAL_TO
    - java.lang.String
  */
  type ThresholdComparator = _ThresholdComparator | java.lang.String
  type ThresholdPercentageInt = Double
  type Timestamp = Date
  type UsernameString = java.lang.String
  type VoteCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.YES
    - typings.awsDashSdk.awsDashSdkStrings.NO
    - java.lang.String
  */
  type VoteValue = _VoteValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-09-24`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

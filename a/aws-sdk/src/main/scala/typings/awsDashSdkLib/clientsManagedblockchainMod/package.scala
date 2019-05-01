package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsManagedblockchainMod {
  type AvailabilityZoneString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STARTER
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - java.lang.String
  */
  type Edition = _Edition | java.lang.String
  type Framework = awsDashSdkLib.awsDashSdkLibStrings.HYPERLEDGER_FABRIC | java.lang.String
  type FrameworkVersionString = java.lang.String
  type InstanceTypeString = java.lang.String
  type InvitationList = js.Array[Invitation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPTED
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPTING
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type InvitationStatus = _InvitationStatus | java.lang.String
  type InviteActionList = js.Array[InviteAction]
  type IsOwned = scala.Boolean
  type MemberListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type MemberStatus = _MemberStatus | java.lang.String
  type MemberSummaryList = js.Array[MemberSummary]
  type NameString = java.lang.String
  type NetworkListMaxResults = scala.Double
  type NetworkMemberNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type NetworkStatus = _NetworkStatus | java.lang.String
  type NetworkSummaryList = js.Array[NetworkSummary]
  type NodeListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type NodeStatus = _NodeStatus | java.lang.String
  type NodeSummaryList = js.Array[NodeSummary]
  type PaginationToken = java.lang.String
  type PasswordString = java.lang.String
  type PrincipalString = java.lang.String
  type ProposalDurationInt = scala.Double
  type ProposalListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.APPROVED
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - awsDashSdkLib.awsDashSdkLibStrings.ACTION_FAILED
    - java.lang.String
  */
  type ProposalStatus = _ProposalStatus | java.lang.String
  type ProposalSummaryList = js.Array[ProposalSummary]
  type ProposalVoteList = js.Array[VoteSummary]
  type RemoveActionList = js.Array[RemoveAction]
  type ResourceIdString = java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN
    - awsDashSdkLib.awsDashSdkLibStrings.GREATER_THAN_OR_EQUAL_TO
    - java.lang.String
  */
  type ThresholdComparator = _ThresholdComparator | java.lang.String
  type ThresholdPercentageInt = scala.Double
  type Timestamp = stdLib.Date
  type UsernameString = java.lang.String
  type VoteCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.YES
    - awsDashSdkLib.awsDashSdkLibStrings.NO
    - java.lang.String
  */
  type VoteValue = _VoteValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-09-24`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

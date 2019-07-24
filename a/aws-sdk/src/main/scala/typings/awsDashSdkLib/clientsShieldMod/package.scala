package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsShieldMod {
  type AttackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NETWORK
    - awsDashSdkLib.awsDashSdkLibStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = _AttackLayer | java.lang.String
  type AttackProperties = js.Array[AttackProperty]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DESTINATION_URL
    - awsDashSdkLib.awsDashSdkLibStrings.REFERRER
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_ASN
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_COUNTRY
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_IP_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_USER_AGENT
    - awsDashSdkLib.awsDashSdkLibStrings.WORDPRESS_PINGBACK_REFLECTOR
    - awsDashSdkLib.awsDashSdkLibStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = _AttackPropertyIdentifier | java.lang.String
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = stdLib.Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = _AutoRenew | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EmailAddress = java.lang.String
  type EmergencyContactList = js.Array[EmergencyContact]
  type Integer = scala.Double
  type Limits = js.Array[Limit]
  type LogBucket = java.lang.String
  type LogBucketList = js.Array[LogBucket]
  type Long = scala.Double
  type MaxResults = scala.Double
  type MitigationList = js.Array[Mitigation]
  type ProtectionId = java.lang.String
  type ProtectionName = java.lang.String
  type Protections = js.Array[Protection]
  type ResourceArn = java.lang.String
  type ResourceArnFilterList = js.Array[ResourceArn]
  type RoleArn = java.lang.String
  type String = java.lang.String
  type SubResourceSummaryList = js.Array[SubResourceSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IP
    - awsDashSdkLib.awsDashSdkLibStrings.URL
    - java.lang.String
  */
  type SubResourceType = _SubResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = _SubscriptionState | java.lang.String
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TopContributors = js.Array[Contributor]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BITS
    - awsDashSdkLib.awsDashSdkLibStrings.BYTES
    - awsDashSdkLib.awsDashSdkLibStrings.PACKETS
    - awsDashSdkLib.awsDashSdkLibStrings.REQUESTS
    - java.lang.String
  */
  type Unit = _Unit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-06-02`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

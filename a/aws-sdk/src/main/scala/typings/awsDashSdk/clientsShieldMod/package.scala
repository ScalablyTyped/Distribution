package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsShieldMod {
  type AttackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NETWORK
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = _AttackLayer | java.lang.String
  type AttackProperties = js.Array[AttackProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DESTINATION_URL
    - typings.awsDashSdk.awsDashSdkStrings.REFERRER
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_ASN
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_COUNTRY
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_IP_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.SOURCE_USER_AGENT
    - typings.awsDashSdk.awsDashSdkStrings.WORDPRESS_PINGBACK_REFLECTOR
    - typings.awsDashSdk.awsDashSdkStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = _AttackPropertyIdentifier | java.lang.String
  type AttackSummaries = js.Array[AttackSummary]
  type AttackTimestamp = Date
  type AttackVectorDescriptionList = js.Array[AttackVectorDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = _AutoRenew | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
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
    - typings.awsDashSdk.awsDashSdkStrings.IP
    - typings.awsDashSdk.awsDashSdkStrings.URL
    - java.lang.String
  */
  type SubResourceType = _SubResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = _SubscriptionState | java.lang.String
  type SummarizedAttackVectorList = js.Array[SummarizedAttackVector]
  type SummarizedCounterList = js.Array[SummarizedCounter]
  type Timestamp = Date
  type Token = java.lang.String
  type TopContributors = js.Array[Contributor]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BITS
    - typings.awsDashSdk.awsDashSdkStrings.BYTES
    - typings.awsDashSdk.awsDashSdkStrings.PACKETS
    - typings.awsDashSdk.awsDashSdkStrings.REQUESTS
    - java.lang.String
  */
  type Unit = _Unit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-06-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

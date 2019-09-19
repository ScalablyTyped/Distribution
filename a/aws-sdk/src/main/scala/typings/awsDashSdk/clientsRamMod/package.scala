package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRamMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DateTime = Date
  type MaxResults = Double
  type Policy = java.lang.String
  type PolicyList = js.Array[Policy]
  type PrincipalArnOrIdList = js.Array[String]
  type PrincipalList = js.Array[Principal]
  type ResourceArnList = js.Array[String]
  type ResourceList = js.Array[Resource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SELF
    - typings.awsDashSdk.awsDashSdkStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = _ResourceOwner | java.lang.String
  type ResourceShareArnList = js.Array[String]
  type ResourceShareAssociationList = js.Array[ResourceShareAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATING
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATING
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = _ResourceShareAssociationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRINCIPAL
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = _ResourceShareAssociationType | java.lang.String
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList = js.Array[ResourceShareInvitation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACCEPTED
    - typings.awsDashSdk.awsDashSdkStrings.REJECTED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = _ResourceShareInvitationStatus | java.lang.String
  type ResourceShareList = js.Array[ResourceShare]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = _ResourceShareStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.ZONAL_RESOURCE_INACCESSIBLE
    - typings.awsDashSdk.awsDashSdkStrings.LIMIT_EXCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - java.lang.String
  */
  type ResourceStatus = _ResourceStatus | java.lang.String
  type String = java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TagValueList = js.Array[TagValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-01-04`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRamMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DateTime = stdLib.Date
  type MaxResults = scala.Double
  type Policy = java.lang.String
  type PolicyList = js.Array[Policy]
  type PrincipalArnOrIdList = js.Array[String]
  type PrincipalList = js.Array[Principal]
  type ResourceArnList = js.Array[String]
  type ResourceList = js.Array[Resource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SELF
    - awsDashSdkLib.awsDashSdkLibStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = _ResourceOwner | java.lang.String
  type ResourceShareArnList = js.Array[String]
  type ResourceShareAssociationList = js.Array[ResourceShareAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATING
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATING
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = _ResourceShareAssociationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRINCIPAL
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = _ResourceShareAssociationType | java.lang.String
  type ResourceShareInvitationArnList = js.Array[String]
  type ResourceShareInvitationList = js.Array[ResourceShareInvitation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACCEPTED
    - awsDashSdkLib.awsDashSdkLibStrings.REJECTED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = _ResourceShareInvitationStatus | java.lang.String
  type ResourceShareList = js.Array[ResourceShare]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = _ResourceShareStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.ZONAL_RESOURCE_INACCESSIBLE
    - awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
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
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-01-04`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

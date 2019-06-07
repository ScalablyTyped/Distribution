package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediaconnectMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.aes128
    - awsDashSdkLib.awsDashSdkLibStrings.aes192
    - awsDashSdkLib.awsDashSdkLibStrings.aes256
    - java.lang.String
  */
  type Algorithm = _Algorithm | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.speke
    - awsDashSdkLib.awsDashSdkLibStrings.`static-key`
    - java.lang.String
  */
  type KeyType = _KeyType | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`zixi-push`
    - awsDashSdkLib.awsDashSdkLibStrings.`rtp-fec`
    - awsDashSdkLib.awsDashSdkLibStrings.rtp
    - java.lang.String
  */
  type Protocol = _Protocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OWNED
    - awsDashSdkLib.awsDashSdkLibStrings.ENTITLED
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDBY
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type __integer = scala.Double
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfOutput = js.Array[Output]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

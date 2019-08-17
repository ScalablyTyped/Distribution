package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediaconnectMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.aes128
    - typings.awsDashSdk.awsDashSdkStrings.aes192
    - typings.awsDashSdk.awsDashSdkStrings.aes256
    - java.lang.String
  */
  type Algorithm = _Algorithm | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.speke
    - typings.awsDashSdk.awsDashSdkStrings.`static-key`
    - java.lang.String
  */
  type KeyType = _KeyType | String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`zixi-push`
    - typings.awsDashSdk.awsDashSdkStrings.`rtp-fec`
    - typings.awsDashSdk.awsDashSdkStrings.rtp
    - typings.awsDashSdk.awsDashSdkStrings.`zixi-pull`
    - java.lang.String
  */
  type Protocol = _Protocol | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OWNED
    - typings.awsDashSdk.awsDashSdkStrings.ENTITLED
    - java.lang.String
  */
  type SourceType = _SourceType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDBY
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type Status = _Status | String
  type __integer = Double
  type __listOfAddOutputRequest = js.Array[AddOutputRequest]
  type __listOfEntitlement = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement = js.Array[ListedEntitlement]
  type __listOfListedFlow = js.Array[ListedFlow]
  type __listOfOutput = js.Array[Output]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}

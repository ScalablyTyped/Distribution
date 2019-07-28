package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.BROKER
import typings.awsDashSdk.awsDashSdkStrings.DEFAULT
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKafkaMod {
  type BrokerAZDistribution = DEFAULT | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TLS
    - typings.awsDashSdk.awsDashSdkStrings.TLS_PLAINTEXT
    - typings.awsDashSdk.awsDashSdkStrings.PLAINTEXT
    - java.lang.String
  */
  type ClientBroker = _ClientBroker | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ClusterState = _ClusterState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.PER_BROKER
    - typings.awsDashSdk.awsDashSdkStrings.PER_TOPIC_PER_BROKER
    - java.lang.String
  */
  type EnhancedMonitoring = _EnhancedMonitoring | String
  type MaxResults = Double
  type NodeType = BROKER | String
  type __blob = Buffer | Uint8Array | Blob | String
  type __boolean = Boolean
  type __double = Double
  type __integer = Double
  type __integerMin1Max15 = Double
  type __integerMin1Max16384 = Double
  type __listOfBrokerEBSVolumeInfo = js.Array[BrokerEBSVolumeInfo]
  type __listOfClusterInfo = js.Array[ClusterInfo]
  type __listOfClusterOperationInfo = js.Array[ClusterOperationInfo]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfNodeInfo = js.Array[NodeInfo]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  type __stringMin1Max128 = String
  type __stringMin1Max64 = String
  type __stringMin5Max32 = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-14`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}

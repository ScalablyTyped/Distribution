package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKafkaMod {
  type BrokerAZDistribution = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TLS
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_PLAINTEXT
    - awsDashSdkLib.awsDashSdkLibStrings.PLAINTEXT
    - java.lang.String
  */
  type ClientBroker = _ClientBroker | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.PER_BROKER
    - awsDashSdkLib.awsDashSdkLibStrings.PER_TOPIC_PER_BROKER
    - java.lang.String
  */
  type EnhancedMonitoring = _EnhancedMonitoring | java.lang.String
  type MaxResults = scala.Double
  type NodeType = awsDashSdkLib.awsDashSdkLibStrings.BROKER | java.lang.String
  type __blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type __boolean = scala.Boolean
  type __double = scala.Double
  type __integer = scala.Double
  type __integerMin1Max15 = scala.Double
  type __integerMin1Max16384 = scala.Double
  type __listOfBrokerEBSVolumeInfo = js.Array[BrokerEBSVolumeInfo]
  type __listOfClusterInfo = js.Array[ClusterInfo]
  type __listOfClusterOperationInfo = js.Array[ClusterOperationInfo]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfNodeInfo = js.Array[NodeInfo]
  type __listOf__string = js.Array[__string]
  type __long = scala.Double
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  type __stringMin1Max128 = java.lang.String
  type __stringMin1Max64 = java.lang.String
  type __stringMin5Max32 = java.lang.String
  type __timestampIso8601 = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-14`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

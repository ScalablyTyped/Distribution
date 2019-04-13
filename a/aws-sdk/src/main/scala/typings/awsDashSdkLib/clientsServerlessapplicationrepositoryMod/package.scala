package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServerlessapplicationrepositoryMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_NAMED_IAM
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_AUTO_EXPAND
    - awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_RESOURCE_POLICY
    - java.lang.String
  */
  type Capability = _Capability | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type MaxItems = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PREPARING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfApplicationDependencySummary = js.Array[ApplicationDependencySummary]
  type __listOfApplicationPolicyStatement = js.Array[ApplicationPolicyStatement]
  type __listOfApplicationSummary = js.Array[ApplicationSummary]
  type __listOfCapability = js.Array[Capability]
  type __listOfParameterDefinition = js.Array[ParameterDefinition]
  type __listOfParameterValue = js.Array[ParameterValue]
  type __listOfRollbackTrigger = js.Array[RollbackTrigger]
  type __listOfTag = js.Array[Tag]
  type __listOfVersionSummary = js.Array[VersionSummary]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

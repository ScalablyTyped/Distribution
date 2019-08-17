package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsServerlessapplicationrepositoryMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_IAM
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_NAMED_IAM
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_AUTO_EXPAND
    - typings.awsDashSdk.awsDashSdkStrings.CAPABILITY_RESOURCE_POLICY
    - java.lang.String
  */
  type Capability = _Capability | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type MaxItems = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PREPARING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type Status = _Status | String
  type __boolean = Boolean
  type __integer = Double
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
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}

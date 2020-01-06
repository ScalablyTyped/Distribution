package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsImagebuilderMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.SHELL
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type AccountList = js.Array[NonEmptyString]
  type AmiList = js.Array[Ami]
  type Arn = String
  type ArnList = js.Array[Arn]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  type ComponentBuildVersionArn = String
  type ComponentConfigurationList = js.Array[ComponentConfiguration]
  type ComponentData = String
  type ComponentFormat = SHELL | String
  type ComponentSummaryList = js.Array[ComponentSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BUILD
    - typings.awsDashSdk.awsDashSdkStrings.TEST
    - java.lang.String
  */
  type ComponentType = _ComponentType | String
  type ComponentVersionArn = String
  type ComponentVersionList = js.Array[ComponentVersion]
  type DateTime = String
  type DistributionConfigurationArn = String
  type DistributionConfigurationSummaryList = js.Array[DistributionConfigurationSummary]
  type DistributionList = js.Array[Distribution]
  type DistributionTimeoutMinutes = Double
  type EbsIopsInteger = Double
  type EbsVolumeSizeInteger = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.standard__
    - typings.awsDashSdk.awsDashSdkStrings.io1
    - typings.awsDashSdk.awsDashSdkStrings.gp2
    - typings.awsDashSdk.awsDashSdkStrings.sc1
    - typings.awsDashSdk.awsDashSdkStrings.st1
    - java.lang.String
  */
  type EbsVolumeType = _EbsVolumeType | String
  type FilterList = js.Array[Filter]
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type ImageBuildVersionArn = String
  type ImageBuilderArn = String
  type ImagePipelineArn = String
  type ImagePipelineList = js.Array[ImagePipeline]
  type ImageRecipeArn = String
  type ImageRecipeSummaryList = js.Array[ImageRecipeSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.TESTING
    - typings.awsDashSdk.awsDashSdkStrings.DISTRIBUTING
    - typings.awsDashSdk.awsDashSdkStrings.INTEGRATING
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.CANCELLED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DEPRECATED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type ImageStatus = _ImageStatus | String
  type ImageSummaryList = js.Array[ImageSummary]
  type ImageTestsTimeoutMinutes = Double
  type ImageVersionArn = String
  type ImageVersionList = js.Array[ImageVersion]
  type InfrastructureConfigurationArn = String
  type InfrastructureConfigurationSummaryList = js.Array[InfrastructureConfigurationSummary]
  type InlineComponentData = String
  type InstanceBlockDeviceMappings = js.Array[InstanceBlockDeviceMapping]
  type InstanceType = String
  type InstanceTypeList = js.Array[InstanceType]
  type NonEmptyString = String
  type NullableBoolean = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Self_
    - typings.awsDashSdk.awsDashSdkStrings.Shared_
    - typings.awsDashSdk.awsDashSdkStrings.Amazon_
    - java.lang.String
  */
  type Ownership = _Ownership | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXPRESSION_MATCH_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
    - java.lang.String
  */
  type PipelineExecutionStartCondition = _PipelineExecutionStartCondition | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type PipelineStatus = _PipelineStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Windows_
    - typings.awsDashSdk.awsDashSdkStrings.Linux_
    - java.lang.String
  */
  type Platform = _Platform | String
  type ResourceName = String
  type RestrictedInteger = Double
  type SecurityGroupIds = js.Array[NonEmptyString]
  type StringList = js.Array[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type Uri = String
  type VersionNumber = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-12-02`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}

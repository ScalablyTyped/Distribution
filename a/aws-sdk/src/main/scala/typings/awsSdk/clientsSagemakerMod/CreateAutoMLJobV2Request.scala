package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoMLJobV2Request extends StObject {
  
  /**
    * An array of channel objects describing the input data and their location. Each channel is a named input source. Similar to InputDataConfig supported by CreateAutoMLJob. The supported formats depend on the problem type:   ImageClassification: S3Prefix, ManifestFile, AugmentedManifestFile    TextClassification: S3Prefix  
    */
  var AutoMLJobInputDataConfig: typings.awsSdk.clientsSagemakerMod.AutoMLJobInputDataConfig
  
  /**
    * Identifies an Autopilot job. The name must be unique to your account and is case insensitive.
    */
  var AutoMLJobName: typings.awsSdk.clientsSagemakerMod.AutoMLJobName
  
  /**
    * Specifies a metric to minimize or maximize as the objective of a job. For CreateAutoMLJobV2, only Accuracy is supported.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobObjective] = js.undefined
  
  /**
    * Defines the configuration settings of one of the supported problem types.
    */
  var AutoMLProblemTypeConfig: typings.awsSdk.clientsSagemakerMod.AutoMLProblemTypeConfig
  
  /**
    * This structure specifies how to split the data into train and validation datasets. If you are using the V1 API (for example CreateAutoMLJob) or the V2 API for Natural Language Processing problems (for example CreateAutoMLJobV2 with a TextClassificationJobConfig problem type), the validation and training datasets must contain the same headers. Also, for V1 API jobs, the validation dataset must be less than 2 GB in size.
    */
  var DataSplitConfig: js.UndefOr[AutoMLDataSplitConfig] = js.undefined
  
  /**
    * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
    */
  var ModelDeployConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelDeployConfig] = js.undefined
  
  /**
    * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job.
    */
  var OutputDataConfig: AutoMLOutputDataConfig
  
  /**
    * The ARN of the role that is used to access the data.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * The security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, such as by purpose, owner, or environment. For more information, see Tagging Amazon Web ServicesResources. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAutoMLJobV2Request {
  
  inline def apply(
    AutoMLJobInputDataConfig: AutoMLJobInputDataConfig,
    AutoMLJobName: AutoMLJobName,
    AutoMLProblemTypeConfig: AutoMLProblemTypeConfig,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): CreateAutoMLJobV2Request = {
    val __obj = js.Dynamic.literal(AutoMLJobInputDataConfig = AutoMLJobInputDataConfig.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLProblemTypeConfig = AutoMLProblemTypeConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobV2Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAutoMLJobV2Request] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobInputDataConfig(value: AutoMLJobInputDataConfig): Self = StObject.set(x, "AutoMLJobInputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobInputDataConfigVarargs(value: AutoMLJobChannel*): Self = StObject.set(x, "AutoMLJobInputDataConfig", js.Array(value*))
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    inline def setAutoMLProblemTypeConfig(value: AutoMLProblemTypeConfig): Self = StObject.set(x, "AutoMLProblemTypeConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSplitConfig(value: AutoMLDataSplitConfig): Self = StObject.set(x, "DataSplitConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSplitConfigUndefined: Self = StObject.set(x, "DataSplitConfig", js.undefined)
    
    inline def setModelDeployConfig(value: ModelDeployConfig): Self = StObject.set(x, "ModelDeployConfig", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfigUndefined: Self = StObject.set(x, "ModelDeployConfig", js.undefined)
    
    inline def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfig(value: AutoMLSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}

package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugRuleConfiguration extends StObject {
  
  /**
    * The instance type to deploy a Debugger custom rule for debugging a training job.
    */
  var InstanceType: js.UndefOr[ProcessingInstanceType] = js.undefined
  
  /**
    * Path to local storage location for output of rules. Defaults to /opt/ml/processing/output/rule/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.undefined
  
  /**
    * The name of the rule configuration. It must be unique relative to other rule configuration names.
    */
  var RuleConfigurationName: typings.awsSdk.clientsSagemakerMod.RuleConfigurationName
  
  /**
    * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
    */
  var RuleEvaluatorImage: AlgorithmImage
  
  /**
    * Runtime configuration for rule container.
    */
  var RuleParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RuleParameters] = js.undefined
  
  /**
    * Path to Amazon S3 storage location for rules.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The size, in GB, of the ML storage volume attached to the processing instance.
    */
  var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.undefined
}
object DebugRuleConfiguration {
  
  inline def apply(RuleConfigurationName: RuleConfigurationName, RuleEvaluatorImage: AlgorithmImage): DebugRuleConfiguration = {
    val __obj = js.Dynamic.literal(RuleConfigurationName = RuleConfigurationName.asInstanceOf[js.Any], RuleEvaluatorImage = RuleEvaluatorImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugRuleConfiguration]
  }
  
  extension [Self <: DebugRuleConfiguration](x: Self) {
    
    inline def setInstanceType(value: ProcessingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    inline def setRuleConfigurationName(value: RuleConfigurationName): Self = StObject.set(x, "RuleConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setRuleEvaluatorImage(value: AlgorithmImage): Self = StObject.set(x, "RuleEvaluatorImage", value.asInstanceOf[js.Any])
    
    inline def setRuleParameters(value: RuleParameters): Self = StObject.set(x, "RuleParameters", value.asInstanceOf[js.Any])
    
    inline def setRuleParametersUndefined: Self = StObject.set(x, "RuleParameters", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
    
    inline def setVolumeSizeInGB(value: OptionalVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}

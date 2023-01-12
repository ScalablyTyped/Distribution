package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationConfiguration extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of remediation configuration.
    */
  var Arn: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The remediation is triggered automatically.
    */
  var Automatic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: typings.awsSdk.clientsConfigserviceMod.ConfigRuleName
  
  /**
    * Name of the service that owns the service-linked rule, if applicable.
    */
  var CreatedByService: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * An ExecutionControls object.
    */
  var ExecutionControls: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ExecutionControls] = js.undefined
  
  /**
    * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5. For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptSeconds as 50 seconds, Config will put a RemediationException on your behalf for the failing resource after the 5th failed attempt within 50 seconds.
    */
  var MaximumAutomaticAttempts: js.UndefOr[AutoRemediationAttempts] = js.undefined
  
  /**
    * An object of the RemediationParameterValue.
    */
  var Parameters: js.UndefOr[RemediationParameters] = js.undefined
  
  /**
    * The type of a resource. 
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum time in seconds that Config runs auto-remediation. If you do not select a number, the default is 60 seconds.  For example, if you specify RetryAttemptSeconds as 50 seconds and MaximumAutomaticAttempts as 5, Config will run auto-remediations 5 times within 50 seconds before throwing an exception.
    */
  var RetryAttemptSeconds: js.UndefOr[AutoRemediationAttemptSeconds] = js.undefined
  
  /**
    * Target ID is the name of the public document.
    */
  var TargetId: StringWithCharLimit256
  
  /**
    * The type of the target. Target executes remediation. For example, SSM document.
    */
  var TargetType: RemediationTargetType
  
  /**
    * Version of the target. For example, version of the SSM document.  If you make backward incompatible changes to the SSM document, you must call PutRemediationConfiguration API again to ensure the remediations can run. 
    */
  var TargetVersion: js.UndefOr[String] = js.undefined
}
object RemediationConfiguration {
  
  inline def apply(
    ConfigRuleName: ConfigRuleName,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any], TargetType = TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemediationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setArn(value: StringWithCharLimit1024): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutomatic(value: Boolean): Self = StObject.set(x, "Automatic", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUndefined: Self = StObject.set(x, "Automatic", js.undefined)
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setCreatedByService(value: StringWithCharLimit1024): Self = StObject.set(x, "CreatedByService", value.asInstanceOf[js.Any])
    
    inline def setCreatedByServiceUndefined: Self = StObject.set(x, "CreatedByService", js.undefined)
    
    inline def setExecutionControls(value: ExecutionControls): Self = StObject.set(x, "ExecutionControls", value.asInstanceOf[js.Any])
    
    inline def setExecutionControlsUndefined: Self = StObject.set(x, "ExecutionControls", js.undefined)
    
    inline def setMaximumAutomaticAttempts(value: AutoRemediationAttempts): Self = StObject.set(x, "MaximumAutomaticAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumAutomaticAttemptsUndefined: Self = StObject.set(x, "MaximumAutomaticAttempts", js.undefined)
    
    inline def setParameters(value: RemediationParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRetryAttemptSeconds(value: AutoRemediationAttemptSeconds): Self = StObject.set(x, "RetryAttemptSeconds", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptSecondsUndefined: Self = StObject.set(x, "RetryAttemptSeconds", js.undefined)
    
    inline def setTargetId(value: StringWithCharLimit256): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: RemediationTargetType): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "TargetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "TargetVersion", js.undefined)
  }
}

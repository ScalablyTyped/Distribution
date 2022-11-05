package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplateData extends StObject {
  
  /**
    *  The configuration settings that are used to override defaults configuration.
    */
  var configurationOverrides: js.UndefOr[ParametricConfigurationOverrides] = js.undefined
  
  /**
    * The execution role ARN of the job run.
    */
  var executionRoleArn: ParametricIAMRoleArn
  
  var jobDriver: JobDriver
  
  /**
    * The tags assigned to jobs started using the job template.
    */
  var jobTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The configuration of parameters existing in the job template.
    */
  var parameterConfiguration: js.UndefOr[TemplateParameterConfigurationMap] = js.undefined
  
  /**
    *  The release version of Amazon EMR.
    */
  var releaseLabel: ParametricReleaseLabel
}
object JobTemplateData {
  
  inline def apply(executionRoleArn: ParametricIAMRoleArn, jobDriver: JobDriver, releaseLabel: ParametricReleaseLabel): JobTemplateData = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any], jobDriver = jobDriver.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplateData]
  }
  
  extension [Self <: JobTemplateData](x: Self) {
    
    inline def setConfigurationOverrides(value: ParametricConfigurationOverrides): Self = StObject.set(x, "configurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOverridesUndefined: Self = StObject.set(x, "configurationOverrides", js.undefined)
    
    inline def setExecutionRoleArn(value: ParametricIAMRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setJobDriver(value: JobDriver): Self = StObject.set(x, "jobDriver", value.asInstanceOf[js.Any])
    
    inline def setJobTags(value: TagMap): Self = StObject.set(x, "jobTags", value.asInstanceOf[js.Any])
    
    inline def setJobTagsUndefined: Self = StObject.set(x, "jobTags", js.undefined)
    
    inline def setParameterConfiguration(value: TemplateParameterConfigurationMap): Self = StObject.set(x, "parameterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParameterConfigurationUndefined: Self = StObject.set(x, "parameterConfiguration", js.undefined)
    
    inline def setReleaseLabel(value: ParametricReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
  }
}

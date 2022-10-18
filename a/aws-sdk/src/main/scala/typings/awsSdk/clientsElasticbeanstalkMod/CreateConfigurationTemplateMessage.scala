package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationTemplateMessage extends StObject {
  
  /**
    * The name of the Elastic Beanstalk application to associate with this configuration template.
    */
  var ApplicationName: typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * An optional description for this configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  
  /**
    * The ID of an environment whose settings you want to use to create the configuration template. You must specify EnvironmentId if you don't specify PlatformArn, SolutionStackName, or SourceConfiguration.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * Option values for the Elastic Beanstalk configuration, such as the instance type. If specified, these values override the values obtained from the solution stack or the source configuration template. For a complete list of Elastic Beanstalk configuration options, see Option Values in the AWS Elastic Beanstalk Developer Guide.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom platform. For more information, see  Custom Platforms in the AWS Elastic Beanstalk Developer Guide.  If you specify PlatformArn, then don't specify SolutionStackName. 
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The name of an Elastic Beanstalk solution stack (platform version) that this configuration uses. For example, 64bit Amazon Linux 2013.09 running Tomcat 7 Java 7. A solution stack specifies the operating system, runtime, and application server for a configuration template. It also determines the set of configuration options as well as the possible and default values. For more information, see Supported Platforms in the AWS Elastic Beanstalk Developer Guide. You must specify SolutionStackName if you don't specify PlatformArn, EnvironmentId, or SourceConfiguration. Use the  ListAvailableSolutionStacks  API to obtain a list of available solution stacks.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
  
  /**
    * An Elastic Beanstalk configuration template to base this one on. If specified, Elastic Beanstalk uses the configuration values from the specified configuration template to create a new configuration. Values specified in OptionSettings override any values obtained from the SourceConfiguration. You must specify SourceConfiguration if you don't specify PlatformArn, EnvironmentId, or SolutionStackName. Constraint: If both solution stack name and source configuration are specified, the solution stack of the source configuration template must match the specified solution stack name.
    */
  var SourceConfiguration: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SourceConfiguration] = js.undefined
  
  /**
    * Specifies the tags applied to the configuration template.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
  
  /**
    * The name of the configuration template. Constraint: This name must be unique per application.
    */
  var TemplateName: ConfigurationTemplateName
}
object CreateConfigurationTemplateMessage {
  
  inline def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): CreateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationTemplateMessage]
  }
  
  extension [Self <: CreateConfigurationTemplateMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "SourceConfiguration", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}

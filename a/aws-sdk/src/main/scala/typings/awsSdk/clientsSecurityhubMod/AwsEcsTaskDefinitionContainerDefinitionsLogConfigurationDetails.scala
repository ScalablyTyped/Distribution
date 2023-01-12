package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails extends StObject {
  
  /**
    * The log driver to use for the container. Valid values on Fargate are as follows:    awsfirelens     awslogs     splunk    Valid values on Amazon EC2 are as follows:    awsfirelens     awslogs     fluentd     gelf     journald     json-file     logentries     splunk     syslog   
    */
  var LogDriver: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or greater on your container instance.
    */
  var Options: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The secrets to pass to the log configuration.
    */
  var SecretOptions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsList] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setLogDriver(value: NonEmptyString): Self = StObject.set(x, "LogDriver", value.asInstanceOf[js.Any])
    
    inline def setLogDriverUndefined: Self = StObject.set(x, "LogDriver", js.undefined)
    
    inline def setOptions(value: FieldMap): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSecretOptions(value: AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsList): Self = StObject.set(x, "SecretOptions", value.asInstanceOf[js.Any])
    
    inline def setSecretOptionsUndefined: Self = StObject.set(x, "SecretOptions", js.undefined)
    
    inline def setSecretOptionsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails*): Self = StObject.set(x, "SecretOptions", js.Array(value*))
  }
}

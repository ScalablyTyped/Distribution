package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfiguration extends StObject {
  
  /**
    * The log driver to use for the container. For tasks on Fargate, the supported log drivers are awslogs, splunk, and awsfirelens. For tasks hosted on Amazon EC2 instances, the supported log drivers are awslogs, fluentd, gelf, json-file, journald, logentries,syslog, splunk, and awsfirelens. For more information about using the awslogs log driver, see Using the awslogs log driver in the Amazon Elastic Container Service Developer Guide. For more information about using the awsfirelens log driver, see Custom log routing in the Amazon Elastic Container Service Developer Guide.  If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent project that's available on GitHub and customize it to work with that driver. We encourage you to submit pull requests for changes that you would like to have included. However, we don't currently provide support for running modified copies of this software. 
    */
  var logDriver: LogDriver
  
  /**
    * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log in to your container instance and run the following command: sudo docker version --format '{{.Server.APIVersion}}' 
    */
  var options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined
  
  /**
    * The secrets to pass to the log configuration. For more information, see Specifying sensitive data in the Amazon Elastic Container Service Developer Guide.
    */
  var secretOptions: js.UndefOr[SecretList] = js.undefined
}
object LogConfiguration {
  
  inline def apply(logDriver: LogDriver): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLogDriver(value: LogDriver): Self = StObject.set(x, "logDriver", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: LogConfigurationOptionsMap): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSecretOptions(value: SecretList): Self = StObject.set(x, "secretOptions", value.asInstanceOf[js.Any])
    
    inline def setSecretOptionsUndefined: Self = StObject.set(x, "secretOptions", js.undefined)
    
    inline def setSecretOptionsVarargs(value: Secret*): Self = StObject.set(x, "secretOptions", js.Array(value*))
  }
}

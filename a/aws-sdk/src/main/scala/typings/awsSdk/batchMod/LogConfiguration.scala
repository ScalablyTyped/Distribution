package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfiguration extends StObject {
  
  /**
    * The log driver to use for the container. The valid values listed for this parameter are log drivers that the Amazon ECS container agent can communicate with by default. The supported log drivers are awslogs, fluentd, gelf, json-file, journald, logentries, syslog, and splunk.  awslogs  Specifies the Amazon CloudWatch Logs logging driver. For more information, see Using the awslogs Log Driver in the AWS Batch User Guide and Amazon CloudWatch Logs logging driver in the Docker documentation.  fluentd  Specifies the Fluentd logging driver. For more information, including usage and options, see Fluentd logging driver in the Docker documentation.  gelf  Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options, see Graylog Extended Format logging driver in the Docker documentation.  journald  Specifies the journald logging driver. For more information, including usage and options, see Journald logging driver in the Docker documentation.  json-file  Specifies the JSON file logging driver. For more information, including usage and options, see JSON File logging driver in the Docker documentation.  splunk  Specifies the Splunk logging driver. For more information, including usage and options, see Splunk logging driver in the Docker documentation.  syslog  Specifies the syslog logging driver. For more information, including usage and options, see Syslog logging driver in the Docker documentation.    If you have a custom driver that is not listed earlier that you would like to work with the Amazon ECS container agent, you can fork the Amazon ECS container agent project that is available on GitHub and customize it to work with that driver. We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web Services does not currently support running modified copies of this software.  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version" 
    */
  var logDriver: LogDriver
  
  /**
    * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version" 
    */
  var options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined
  
  /**
    * The secrets to pass to the log configuration. For more information, see Specifying Sensitive Data in the AWS Batch User Guide.
    */
  var secretOptions: js.UndefOr[SecretList] = js.undefined
}
object LogConfiguration {
  
  inline def apply(logDriver: LogDriver): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
  
  extension [Self <: LogConfiguration](x: Self) {
    
    inline def setLogDriver(value: LogDriver): Self = StObject.set(x, "logDriver", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: LogConfigurationOptionsMap): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSecretOptions(value: SecretList): Self = StObject.set(x, "secretOptions", value.asInstanceOf[js.Any])
    
    inline def setSecretOptionsUndefined: Self = StObject.set(x, "secretOptions", js.undefined)
    
    inline def setSecretOptionsVarargs(value: Secret*): Self = StObject.set(x, "secretOptions", js.Array(value :_*))
  }
}

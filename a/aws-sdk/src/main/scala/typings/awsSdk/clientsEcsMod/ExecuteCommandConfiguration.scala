package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteCommandConfiguration extends StObject {
  
  /**
    * Specify an Key Management Service key ID to encrypt the data between the local client and the container.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The log configuration for the results of the execute command actions. The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When logging=OVERRIDE is specified, a logConfiguration must be provided.
    */
  var logConfiguration: js.UndefOr[ExecuteCommandLogConfiguration] = js.undefined
  
  /**
    * The log setting to use for redirecting logs for your execute command results. The following log settings are available.    NONE: The execute command session is not logged.    DEFAULT: The awslogs configuration in the task definition is used. If no logging parameter is specified, it defaults to this value. If no awslogs log driver is configured in the task definition, the output won't be logged.    OVERRIDE: Specify the logging details as a part of logConfiguration. If the OVERRIDE logging option is specified, the logConfiguration is required.  
    */
  var logging: js.UndefOr[ExecuteCommandLogging] = js.undefined
}
object ExecuteCommandConfiguration {
  
  inline def apply(): ExecuteCommandConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteCommandConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteCommandConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLogConfiguration(value: ExecuteCommandLogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setLogging(value: ExecuteCommandLogging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
  }
}

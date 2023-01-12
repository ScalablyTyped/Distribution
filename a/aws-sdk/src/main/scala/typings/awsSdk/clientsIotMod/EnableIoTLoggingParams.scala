package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableIoTLoggingParams extends StObject {
  
  /**
    * Specifies the type of information to be logged.
    */
  var logLevel: LogLevel
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used for logging.
    */
  var roleArnForLogging: RoleArn
}
object EnableIoTLoggingParams {
  
  inline def apply(logLevel: LogLevel, roleArnForLogging: RoleArn): EnableIoTLoggingParams = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], roleArnForLogging = roleArnForLogging.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableIoTLoggingParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableIoTLoggingParams] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setRoleArnForLogging(value: RoleArn): Self = StObject.set(x, "roleArnForLogging", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayFileAccessLog extends StObject {
  
  /**
    * The specified format for the virtual gateway access logs. It can be either json_format or text_format.
    */
  var format: js.UndefOr[LoggingFormat] = js.undefined
  
  /**
    * The file path to write access logs to. You can use /dev/stdout to send access logs to standard out and configure your Envoy container to use a log driver, such as awslogs, to export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's file system to write the files to disk.
    */
  var path: FilePath
}
object VirtualGatewayFileAccessLog {
  
  inline def apply(path: FilePath): VirtualGatewayFileAccessLog = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayFileAccessLog]
  }
  
  extension [Self <: VirtualGatewayFileAccessLog](x: Self) {
    
    inline def setFormat(value: LoggingFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPath(value: FilePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

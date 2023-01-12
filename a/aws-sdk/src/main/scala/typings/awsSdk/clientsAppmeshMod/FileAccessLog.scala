package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAccessLog extends StObject {
  
  /**
    * The specified format for the logs. The format is either json_format or text_format.
    */
  var format: js.UndefOr[LoggingFormat] = js.undefined
  
  /**
    * The file path to write access logs to. You can use /dev/stdout to send access logs to standard out and configure your Envoy container to use a log driver, such as awslogs, to export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's file system to write the files to disk.  &lt;note&gt; &lt;p&gt;The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to bootstrap properly.&lt;/p&gt; &lt;/note&gt; 
    */
  var path: FilePath
}
object FileAccessLog {
  
  inline def apply(path: FilePath): FileAccessLog = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAccessLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileAccessLog] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: LoggingFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPath(value: FilePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

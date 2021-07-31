package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAccessLog extends StObject {
  
  /**
    * The file path to write access logs to. You can use /dev/stdout to send access logs to standard out and configure your Envoy container to use a log driver, such as awslogs, to export the access logs to a log storage service such as Amazon CloudWatch Logs. You can also specify a path in the Envoy container's file system to write the files to disk.  The Envoy process must have write permissions to the path that you specify here. Otherwise, Envoy fails to bootstrap properly. 
    */
  var path: FilePath
}
object FileAccessLog {
  
  @scala.inline
  def apply(path: FilePath): FileAccessLog = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAccessLog]
  }
  
  @scala.inline
  implicit class FileAccessLogMutableBuilder[Self <: FileAccessLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: FilePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}

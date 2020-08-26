package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileAccessLog extends js.Object {
  /**
    * The file path to write access logs to. You can use /dev/stdout to send
    access logs to standard out and configure your Envoy container to use a log driver, such as
    awslogs, to export the access logs to a log storage service such as Amazon
    CloudWatch Logs. You can also specify a path in the Envoy container's file system to write
    the files to disk.
    
    The Envoy process must have write permissions to the path that you specify here.
    Otherwise, Envoy fails to bootstrap properly.
    
    */
  var path: FilePath = js.native
}

object FileAccessLog {
  @scala.inline
  def apply(path: FilePath): FileAccessLog = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAccessLog]
  }
  @scala.inline
  implicit class FileAccessLogOps[Self <: FileAccessLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPath(value: FilePath): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}


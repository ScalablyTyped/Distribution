package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectoryConfigRequest extends js.Object {
  /**
    * The name of the directory configuration.
    */
  var DirectoryName: typings.awsSdk.appstreamMod.DirectoryName = js.native
}

object DeleteDirectoryConfigRequest {
  @scala.inline
  def apply(DirectoryName: DirectoryName): DeleteDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryConfigRequest]
  }
  @scala.inline
  implicit class DeleteDirectoryConfigRequestOps[Self <: DeleteDirectoryConfigRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryName(value: DirectoryName): Self = this.set("DirectoryName", value.asInstanceOf[js.Any])
  }
  
}


package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigResult extends js.Object {
  /**
    * Information about the Directory Config object.
    */
  var DirectoryConfig: js.UndefOr[typings.awsSdk.appstreamMod.DirectoryConfig] = js.native
}

object UpdateDirectoryConfigResult {
  @scala.inline
  def apply(): UpdateDirectoryConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectoryConfigResult]
  }
  @scala.inline
  implicit class UpdateDirectoryConfigResultOps[Self <: UpdateDirectoryConfigResult] (val x: Self) extends AnyVal {
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
    def setDirectoryConfig(value: DirectoryConfig): Self = this.set("DirectoryConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryConfig: Self = this.set("DirectoryConfig", js.undefined)
  }
  
}


package typings.avoscloudSdk.mod.Object

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyAllOptions
  extends SuccessOption
     with ErrorOption
     with UseMasterKeyOption

object DestroyAllOptions {
  @scala.inline
  def apply(): DestroyAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyAllOptions]
  }
}


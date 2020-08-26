package typings.avoscloudSdk.mod.Object

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import typings.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with UseMasterKeyOption

object DestroyOptions {
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
}


package typings.avoscloudSdk.mod.Object

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SilentOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import typings.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveOptions
  extends SuccessOption
     with ErrorOption
     with SilentOption
     with UseMasterKeyOption
     with WaitOption

object SaveOptions {
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
}


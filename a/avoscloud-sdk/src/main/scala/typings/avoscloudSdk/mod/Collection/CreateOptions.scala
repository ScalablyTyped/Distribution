package typings.avoscloudSdk.mod.Collection

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SilentOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import typings.avoscloudSdk.mod.WaitOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions
  extends SuccessOption
     with ErrorOption
     with WaitOption
     with SilentOption
     with UseMasterKeyOption

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
}


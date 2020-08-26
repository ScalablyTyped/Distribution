package typings.avoscloudSdk.mod.Collection

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SilentOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions
  extends SuccessOption
     with ErrorOption
     with SilentOption
     with UseMasterKeyOption

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
}


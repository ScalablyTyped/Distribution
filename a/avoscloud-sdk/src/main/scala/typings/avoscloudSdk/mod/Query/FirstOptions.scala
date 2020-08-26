package typings.avoscloudSdk.mod.Query

import typings.avoscloudSdk.mod.ErrorOption
import typings.avoscloudSdk.mod.SuccessOption
import typings.avoscloudSdk.mod.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstOptions
  extends SuccessOption
     with ErrorOption
     with UseMasterKeyOption

object FirstOptions {
  @scala.inline
  def apply(): FirstOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstOptions]
  }
}


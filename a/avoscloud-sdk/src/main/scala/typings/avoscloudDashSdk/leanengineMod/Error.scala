package typings.avoscloudDashSdk.leanengineMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Error")
@js.native
class Error protected ()
  extends typings.avoscloudDashSdk.avoscloudDashSdkMod.Error {
  def this(code: ErrorCode, message: String) = this()
}


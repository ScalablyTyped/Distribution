package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("avoscloud-sdk", "Analytics")
@js.native
object Analytics extends js.Object {
  def track[T](name: String, dimensions: js.Any): Promise[T] = js.native
}


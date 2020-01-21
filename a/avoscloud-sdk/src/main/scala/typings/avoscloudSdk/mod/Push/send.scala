package typings.avoscloudSdk.mod.Push

import typings.avoscloudSdk.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("avoscloud-sdk", "Push.send")
@js.native
object send extends js.Object {
  def apply[T](data: PushData): Promise[T] = js.native
  def apply[T](data: PushData, options: SendOptions): Promise[T] = js.native
}


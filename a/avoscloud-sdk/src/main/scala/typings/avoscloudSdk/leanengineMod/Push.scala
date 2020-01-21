package typings.avoscloudSdk.leanengineMod

import typings.avoscloudSdk.mod.Push.PushData
import typings.avoscloudSdk.mod.Push.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in AV
  * @name AV.Push
  * @namespace
  */
@JSImport("leanengine", "Push")
@js.native
object Push extends js.Object {
  def send[T](data: PushData): typings.avoscloudSdk.mod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typings.avoscloudSdk.mod.Promise[T] = js.native
}


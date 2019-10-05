package typings.async.asyncMod

import typings.async.Anon_Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "retryable")
@js.native
object retryable extends js.Object {
  def apply[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def apply[T, E](opts: Anon_Interval, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
}


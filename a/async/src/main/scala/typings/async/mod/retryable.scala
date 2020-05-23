package typings.async.mod

import typings.async.anon.RetryOptionsaritynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "retryable")
@js.native
object retryable extends js.Object {
  def apply[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def apply[T, E](opts: RetryOptionsaritynumber, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def apply[T, E](task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
}


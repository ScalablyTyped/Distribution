package typings.adone.adoneNs.streamNs.coreNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformContext[T] extends js.Object {
  /**
    * Pushes the given value into the stream
    */
  def push(value: T): Boolean
}

object TransformContext {
  @scala.inline
  def apply[T](push: T => Boolean): TransformContext[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
  
    __obj.asInstanceOf[TransformContext[T]]
  }
}


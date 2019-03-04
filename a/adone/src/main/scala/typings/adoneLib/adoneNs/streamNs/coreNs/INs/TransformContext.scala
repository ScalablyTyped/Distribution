package typings
package adoneLib.adoneNs.streamNs.coreNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformContext[T] extends js.Object {
  /**
    * Pushes the given value into the stream
    */
  def push(value: T): scala.Boolean
}

object TransformContext {
  @scala.inline
  def apply[T](push: js.Function1[T, scala.Boolean]): TransformContext[T] = {
    val __obj = js.Dynamic.literal(push = push)
  
    __obj.asInstanceOf[TransformContext[T]]
  }
}


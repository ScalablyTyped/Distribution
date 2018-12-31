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


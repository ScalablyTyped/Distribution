package typings.adone

import typings.adone.adoneNs.streamNs.coreNs.INs.ConstructorOptions
import typings.adone.adoneNs.streamNs.coreNs.INs.Source
import typings.adone.adoneNs.streamNs.coreNs.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcore extends js.Object {
  val INs: js.Any = js.native
  /**
    * Represents a chain of transform streams
    */
  var Stream: TypeofClassStream = js.native
  /**
    * Creates a CoreStream instance
    */
  def create[S, T](): Stream[S, T] = js.native
  def create[S, T](source: Source[S, T]): Stream[S, T] = js.native
  def create[S, T](source: Source[S, T], options: ConstructorOptions[S, T]): Stream[S, T] = js.native
}


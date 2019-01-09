package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateI extends js.Object {
  val INs: js.Any = js.native
  /**
    * Represents a chain of transform streams
    */
  var Stream: Anon_MergeOptions = js.native
  /**
    * Creates a CoreStream instance
    */
  def create[S, T](): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
  def create[S, T](source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T]): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
  def create[S, T](
    source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T],
    options: adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[S, T]
  ): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
}


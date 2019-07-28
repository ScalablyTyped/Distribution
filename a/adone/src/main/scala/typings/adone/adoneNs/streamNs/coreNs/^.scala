package typings.adone.adoneNs.streamNs.coreNs

import typings.adone.adoneNs.streamNs.coreNs.INs.ConstructorOptions
import typings.adone.adoneNs.streamNs.coreNs.INs.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.stream.core")
@js.native
object ^ extends js.Object {
  /**
    * Creates a CoreStream instance
    */
  def create[S, T](): Stream[S, T] = js.native
  def create[S, T](source: Source[S, T]): Stream[S, T] = js.native
  def create[S, T](source: Source[S, T], options: ConstructorOptions[S, T]): Stream[S, T] = js.native
}


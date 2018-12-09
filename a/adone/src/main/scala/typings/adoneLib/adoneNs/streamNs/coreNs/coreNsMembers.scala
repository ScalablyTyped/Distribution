package typings
package adoneLib.adoneNs.streamNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.stream.core")
@js.native
object coreNsMembers extends js.Object {
  /**
               * Creates a CoreStream instance
               */
  def create[S, T](): Stream[S, T] = js.native
  /**
               * Creates a CoreStream instance
               */
  def create[S, T](source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T]): Stream[S, T] = js.native
  /**
               * Creates a CoreStream instance
               */
  def create[S, T](
    source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T],
    options: adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[S, T]
  ): Stream[S, T] = js.native
}


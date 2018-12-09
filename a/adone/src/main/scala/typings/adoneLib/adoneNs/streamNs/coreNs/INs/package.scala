package typings
package adoneLib.adoneNs.streamNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type FlushFunction[T] = js.ThisFunction0[/* this */ TransformContext[T], scala.Unit]
  type Source[S, T] = js.Array[S] | (adoneLib.adoneNs.streamNs.coreNs.Stream[S, T])
  type TransformFunction[S, T] = js.ThisFunction1[/* this */ TransformContext[T], /* value */ S, scala.Unit]
}

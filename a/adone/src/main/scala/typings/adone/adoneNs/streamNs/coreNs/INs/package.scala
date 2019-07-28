package typings.adone.adoneNs.streamNs.coreNs

import typings.adone.adoneNs.streamNs.coreNs.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type FlushFunction[T] = js.ThisFunction0[/* this */ TransformContext[T], Unit]
  type Source[S, T] = js.Array[S] | (Stream[S, T])
  type TransformFunction[S, T] = js.ThisFunction1[/* this */ TransformContext[T], /* value */ S, Unit]
}

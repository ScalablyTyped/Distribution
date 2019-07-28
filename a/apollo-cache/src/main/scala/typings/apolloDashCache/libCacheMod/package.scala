package typings.apolloDashCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCacheMod {
  type Transaction[T] = js.Function1[/* c */ ApolloCache[T], Unit]
}

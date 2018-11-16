package typings
package apolloDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCacheMod {
  type Transaction[T] = js.Function1[/* c */ ApolloCache[T], scala.Unit]
}

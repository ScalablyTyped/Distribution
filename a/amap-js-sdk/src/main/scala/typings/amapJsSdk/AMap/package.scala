package typings.amapJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AMap {
  type EventCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type GenericEventCallback[T] = js.Function1[/* res */ T, scala.Unit]
}

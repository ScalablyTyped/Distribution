package typings.arg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object argMod {
  import org.scalablytyped.runtime.StringDictionary

  type Handler[T] = js.Function3[/* value */ String, /* name */ String, /* previousValue */ js.UndefOr[T], T]
  type Spec = StringDictionary[String | Handler[js.Any] | js.Array[Handler[js.Any]]]
}

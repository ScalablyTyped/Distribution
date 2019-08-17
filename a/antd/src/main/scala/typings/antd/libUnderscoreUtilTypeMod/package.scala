package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnderscoreUtilTypeMod {
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

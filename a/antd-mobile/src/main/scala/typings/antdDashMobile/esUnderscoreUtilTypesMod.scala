package typings.antdDashMobile

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/es/_util/types", JSImport.Namespace)
@js.native
object esUnderscoreUtilTypesMod extends js.Object {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}


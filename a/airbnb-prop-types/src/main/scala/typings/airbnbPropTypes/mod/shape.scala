package typings.airbnbPropTypes.mod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "shape")
@js.native
object shape extends js.Object {
  def apply[T /* <: js.Object */](propTypes: ValidationMap[T]): Requireable[T] = js.native
}


package typings.airbnbPropTypes.mod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "withShape")
@js.native
object withShape extends js.Object {
  def apply[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = js.native
}


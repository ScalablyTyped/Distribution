package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "withShape")
@js.native
object withShape extends js.Object {
  def apply[T /* <: js.Object */, P, S](propType: Validator[P], propTypes: ValidationMap[S]): Requireable[T] = js.native
}


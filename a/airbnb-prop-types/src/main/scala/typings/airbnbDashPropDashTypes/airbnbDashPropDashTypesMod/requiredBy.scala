package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "requiredBy")
@js.native
object requiredBy extends js.Object {
  def apply[P](requiredByPropName: String, propType: Validator[P]): Requireable[P] = js.native
  def apply[P](requiredByPropName: String, propType: Validator[P], defaultValue: js.Any): Requireable[P] = js.native
}


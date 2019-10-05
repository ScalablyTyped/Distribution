package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "mutuallyExclusiveProps")
@js.native
object mutuallyExclusiveProps extends js.Object {
  def apply[T](propType: Requireable[T], propNames: String*): Requireable[T] = js.native
  def apply[T](// tslint:disable-next-line:unified-signatures
  propType: Validator[T], propNames: String*): Requireable[T] = js.native
}


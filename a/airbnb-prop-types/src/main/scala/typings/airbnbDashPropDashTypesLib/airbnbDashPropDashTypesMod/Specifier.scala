package typings
package airbnbDashPropDashTypesLib.airbnbDashPropDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Specifier[T] extends js.Object {
  var max: js.UndefOr[scala.Double] = js.native
  var min: js.UndefOr[scala.Double] = js.native
  @JSName("validator")
  var validator_Original: propDashTypesLib.propDashTypesMod.Validator[T] = js.native
  def validator(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}


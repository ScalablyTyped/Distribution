package typings.airbnbDashPropDashTypes.airbnbDashPropDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.propDashTypes.propDashTypesMod.Validator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Specifier[T] extends js.Object {
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  @JSName("validator")
  var validator_Original: Validator[T] = js.native
  def validator(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
}


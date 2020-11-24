package typings.airbnbPropTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Validator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Specifier[T] extends js.Object {
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  def validator(
    props: StringDictionary[js.Any],
    propName: String,
    componentName: String,
    location: String,
    propFullName: String
  ): Error | Null = js.native
  @JSName("validator")
  var validator_Original: Validator[T] = js.native
}

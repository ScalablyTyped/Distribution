package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorViewModelFailures extends Object {
  
  /**
    * The readonly error message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#failures)
    */
  var error: Error = js.native
}
object EditorViewModelFailures {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    error: Error,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EditorViewModelFailures = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EditorViewModelFailures]
  }
  
  @scala.inline
  implicit class EditorViewModelFailuresMutableBuilder[Self <: EditorViewModelFailures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

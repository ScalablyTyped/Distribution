package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundNavigationConstraint
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The type of the constraint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: `stay-above` | none
}
object GroundNavigationConstraint {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, GroundNavigationConstraint]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], GroundNavigationConstraint]]),
    `type`: `stay-above` | none
  ): GroundNavigationConstraint = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundNavigationConstraint]
  }
  
  @scala.inline
  implicit class GroundNavigationConstraintMutableBuilder[Self <: GroundNavigationConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `stay-above` | none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

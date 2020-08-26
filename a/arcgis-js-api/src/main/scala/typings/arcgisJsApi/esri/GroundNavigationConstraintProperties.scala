package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`stay-above`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundNavigationConstraintProperties extends Object {
  /**
    * The type of the constraint. It can be one of the following:
    *
    * Value      | Description
    * -----------|--------------------
    * stay-above | User can only navigate above ground surface
    * none       | User can navigate above and below the ground surface
    *
    * Default value: stay-above
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint)
    */
  var `type`: js.UndefOr[`stay-above` | none] = js.native
}

object GroundNavigationConstraintProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GroundNavigationConstraintProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GroundNavigationConstraintProperties]
  }
  @scala.inline
  implicit class GroundNavigationConstraintPropertiesOps[Self <: GroundNavigationConstraintProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: `stay-above` | none): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


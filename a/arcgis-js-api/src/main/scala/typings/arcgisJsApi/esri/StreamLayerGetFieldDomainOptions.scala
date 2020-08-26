package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerGetFieldDomainOptions extends Object {
  /**
    * The feature to which the [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#getFieldDomain)
    */
  var feature: Graphic = js.native
}

object StreamLayerGetFieldDomainOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StreamLayerGetFieldDomainOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StreamLayerGetFieldDomainOptions]
  }
  @scala.inline
  implicit class StreamLayerGetFieldDomainOptionsOps[Self <: StreamLayerGetFieldDomainOptions] (val x: Self) extends AnyVal {
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
    def setFeature(value: Graphic): Self = this.set("feature", value.asInstanceOf[js.Any])
  }
  
}


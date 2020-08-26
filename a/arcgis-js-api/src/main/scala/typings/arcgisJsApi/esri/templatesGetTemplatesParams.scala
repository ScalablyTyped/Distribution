package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait templatesGetTemplatesParams extends Object {
  /**
    * The layer to which the suggested popup templates can be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * Specify the renderer to be used on the layer when if it will be different than the renderer already set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    */
  var renderer: js.UndefOr[Renderer] = js.native
}

object templatesGetTemplatesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): templatesGetTemplatesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[templatesGetTemplatesParams]
  }
  @scala.inline
  implicit class templatesGetTemplatesParamsOps[Self <: templatesGetTemplatesParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
  
}


package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageServiceIdentifyParametersProperties extends js.Object {
  
  /**
    * Input geometry that defines the location to be identified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties | PolygonProperties] = js.native
  
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the mosaic rules defining the image sorting order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.native
  
  /**
    * Specifies the pixel level being identified on the x and y axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PointProperties] = js.native
  
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.native
  
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRules)
    */
  var renderingRules: js.UndefOr[RasterFunctionProperties] = js.native
  
  /**
    * If `true`, returns both geometry and attributes of the catalog items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, each feature in the catalog items includes the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: js.UndefOr[Boolean] = js.native
  
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
}
object ImageServiceIdentifyParametersProperties {
  
  @scala.inline
  def apply(): ImageServiceIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyParametersProperties]
  }
  
  @scala.inline
  implicit class ImageServiceIdentifyParametersPropertiesOps[Self <: ImageServiceIdentifyParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setGeometry(value: PointProperties | PolygonProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setMaxItemCount(value: Double): Self = this.set("maxItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemCount: Self = this.set("maxItemCount", js.undefined)
    
    @scala.inline
    def setMosaicRule(value: MosaicRuleProperties): Self = this.set("mosaicRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMosaicRule: Self = this.set("mosaicRule", js.undefined)
    
    @scala.inline
    def setPixelSize(value: PointProperties): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
    
    @scala.inline
    def setRenderingRule(value: RasterFunctionProperties): Self = this.set("renderingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingRule: Self = this.set("renderingRule", js.undefined)
    
    @scala.inline
    def setRenderingRules(value: RasterFunctionProperties): Self = this.set("renderingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingRules: Self = this.set("renderingRules", js.undefined)
    
    @scala.inline
    def setReturnCatalogItems(value: Boolean): Self = this.set("returnCatalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnCatalogItems: Self = this.set("returnCatalogItems", js.undefined)
    
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = this.set("returnGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnGeometry: Self = this.set("returnGeometry", js.undefined)
    
    @scala.inline
    def setReturnPixelValues(value: Boolean): Self = this.set("returnPixelValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnPixelValues: Self = this.set("returnPixelValues", js.undefined)
    
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeExtent: Self = this.set("timeExtent", js.undefined)
  }
}

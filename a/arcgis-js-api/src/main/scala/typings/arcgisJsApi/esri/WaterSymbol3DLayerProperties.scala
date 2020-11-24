package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.calm
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.moderate
import typings.arcgisJsApi.arcgisJsApiStrings.rippled
import typings.arcgisJsApi.arcgisJsApiStrings.slight
import typings.arcgisJsApi.arcgisJsApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterSymbol3DLayerProperties extends Symbol3DLayerProperties {
  
  /**
    * The dominant color used to shade the water.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    */
  var waterbodySize: js.UndefOr[small | medium | large] = js.native
  
  /**
    * Indicates the direction in which the waves travel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    */
  var waveDirection: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the shape and intensity of the waves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    */
  var waveStrength: js.UndefOr[calm | rippled | slight | moderate] = js.native
}
object WaterSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): WaterSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class WaterSymbol3DLayerPropertiesOps[Self <: WaterSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setWaterbodySize(value: small | medium | large): Self = this.set("waterbodySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterbodySize: Self = this.set("waterbodySize", js.undefined)
    
    @scala.inline
    def setWaveDirection(value: Double): Self = this.set("waveDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaveDirection: Self = this.set("waveDirection", js.undefined)
    
    @scala.inline
    def setWaveStrength(value: calm | rippled | slight | moderate): Self = this.set("waveStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaveStrength: Self = this.set("waveStrength", js.undefined)
  }
}

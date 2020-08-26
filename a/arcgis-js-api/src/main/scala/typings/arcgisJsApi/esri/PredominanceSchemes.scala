package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredominanceSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average basemap color is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
    */
  var basemapTheme: String = js.native
  /**
    * The predominance scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
    */
  var primaryScheme: PredominanceScheme = js.native
  /**
    * Additional predominance schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-predominance.html#PredominanceSchemes)
    */
  var secondarySchemes: js.Array[PredominanceScheme] = js.native
}

object PredominanceSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: PredominanceScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[PredominanceScheme]
  ): PredominanceSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominanceSchemes]
  }
  @scala.inline
  implicit class PredominanceSchemesOps[Self <: PredominanceSchemes] (val x: Self) extends AnyVal {
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
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryScheme(value: PredominanceScheme): Self = this.set("primaryScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondarySchemesVarargs(value: PredominanceScheme*): Self = this.set("secondarySchemes", js.Array(value :_*))
    @scala.inline
    def setSecondarySchemes(value: js.Array[PredominanceScheme]): Self = this.set("secondarySchemes", value.asInstanceOf[js.Any])
  }
  
}


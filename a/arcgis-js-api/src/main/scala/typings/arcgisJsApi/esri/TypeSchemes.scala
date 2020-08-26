package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeSchemes extends Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemes)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average basemap color is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemes)
    */
  var basemapTheme: String = js.native
  /**
    * The type scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemes)
    */
  var primaryScheme: TypeScheme = js.native
  /**
    * Additional type schemes that may be used to visualize data of the given geometry type overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#TypeSchemes)
    */
  var secondarySchemes: js.Array[TypeScheme] = js.native
}

object TypeSchemes {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryScheme: TypeScheme,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondarySchemes: js.Array[TypeScheme]
  ): TypeSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSchemes]
  }
  @scala.inline
  implicit class TypeSchemesOps[Self <: TypeSchemes] (val x: Self) extends AnyVal {
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
    def setPrimaryScheme(value: TypeScheme): Self = this.set("primaryScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondarySchemesVarargs(value: TypeScheme*): Self = this.set("secondarySchemes", js.Array(value :_*))
    @scala.inline
    def setSecondarySchemes(value: js.Array[TypeScheme]): Self = this.set("secondarySchemes", value.asInstanceOf[js.Any])
  }
  
}


package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipSchemeForPolygon
  extends Object
     with RelationshipScheme {
  /**
    * Defines the colors to use in each bin of the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPolygonColorsForClassBreaks] = js.native
  /**
    * The ID uniquely identifying the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var id: String = js.native
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var name: String = js.native
  /**
    * The color of the fill symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var noDataColor: Color_ = js.native
  /**
    * The opacity of the fill symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var opacity: Double = js.native
  /**
    * Properties for defining the outline of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var outline: RelationshipSchemeForPolygonOutline = js.native
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var tags: js.Array[String] = js.native
}

object RelationshipSchemeForPolygon {
  @scala.inline
  def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolygonColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: RelationshipSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): RelationshipSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForPolygon]
  }
  @scala.inline
  implicit class RelationshipSchemeForPolygonOps[Self <: RelationshipSchemeForPolygon] (val x: Self) extends AnyVal {
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
    def setColorsForClassBreaksVarargs(value: RelationshipSchemeForPolygonColorsForClassBreaks*): Self = this.set("colorsForClassBreaks", js.Array(value :_*))
    @scala.inline
    def setColorsForClassBreaks(value: js.Array[RelationshipSchemeForPolygonColorsForClassBreaks]): Self = this.set("colorsForClassBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDataColor(value: Color_): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutline(value: RelationshipSchemeForPolygonOutline): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}


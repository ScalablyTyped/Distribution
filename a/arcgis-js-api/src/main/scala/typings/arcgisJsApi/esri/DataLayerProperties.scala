package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typings.arcgisJsApi.arcgisJsApiStrings.contains
import typings.arcgisJsApi.arcgisJsApiStrings.crosses
import typings.arcgisJsApi.arcgisJsApiStrings.intersects
import typings.arcgisJsApi.arcgisJsApiStrings.layer
import typings.arcgisJsApi.arcgisJsApiStrings.overlaps
import typings.arcgisJsApi.arcgisJsApiStrings.relation
import typings.arcgisJsApi.arcgisJsApiStrings.touches
import typings.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLayerProperties extends js.Object {
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship) is applied to this geometry while performing the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  /**
    * The name of the data layer in the map service that is being referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The spatial relationship to be applied on the input geometry while performing the query.
    *
    * Possible Value | Description
    * ---------------|------------
    * intersects | Part of a feature from feature class 1 is contained in a feature from feature class 2.
    * contains | Part or all of a feature from feature class 1 is contained within a feature from feature class 2.
    * crosses | The feature from feature class 1 crosses a feature from feature class 2.
    * envelope-intersects | The envelope of feature class 1 intersects with the envelope of feature class 2.
    * index-intersects | The envelope of the query feature class intersects the index entry for the target feature class.
    * overlaps | Features from feature class 1 overlap features in feature class 2.
    * touches | The feature from feature class 1 touches the border of a feature from feature class 2.
    * within | The feature from feature class 1 is completely enclosed by the feature from feature class 2.
    * relation | Allows specification of any relationship defined using the [Shape Comparison Language](http://resources.esri.com/help/9.3/arcgisengine/dotnet/concepts_start.htm#40de6491-9b2d-440d-848b-2609efcd46b1.htm).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship)
    */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.native
  var `type`: js.UndefOr[layer] = js.native
  /**
    * A where clause for the query. Any legal SQL where clause operating on the fields in the layer is allowed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#where)
    */
  var where: js.UndefOr[String] = js.native
}

object DataLayerProperties {
  @scala.inline
  def apply(): DataLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLayerProperties]
  }
  @scala.inline
  implicit class DataLayerPropertiesOps[Self <: DataLayerProperties] (val x: Self) extends AnyVal {
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
    def setGeometry(value: GeometryProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpatialRelationship(
      value: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
    ): Self = this.set("spatialRelationship", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialRelationship: Self = this.set("spatialRelationship", js.undefined)
    @scala.inline
    def setType(value: layer): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}


package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingFilterProperties extends js.Object {
  /**
    * Description of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Filter blocks define which features should be visible in the affected [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) and how the filtered features are drawn. A filter should contain at least one filter block.  The order of filter blocks influences the order in which the filter blocks are applied. For example, if a filter block using a `wire-frame` mode precedes a `solid` filter block in the collection, elements that match either filter block will be drawn as wireframe.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks)
    */
  var filterBlocks: js.UndefOr[CollectionProperties[BuildingFilterBlock]] = js.native
  /**
    * Name of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#name)
    */
  var name: js.UndefOr[String] = js.native
}

object BuildingFilterProperties {
  @scala.inline
  def apply(): BuildingFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingFilterProperties]
  }
  @scala.inline
  implicit class BuildingFilterPropertiesOps[Self <: BuildingFilterProperties] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFilterBlocksVarargs(value: BuildingFilterBlock*): Self = this.set("filterBlocks", js.Array(value :_*))
    @scala.inline
    def setFilterBlocks(value: CollectionProperties[BuildingFilterBlock]): Self = this.set("filterBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterBlocks: Self = this.set("filterBlocks", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


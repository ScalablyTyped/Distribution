package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingFilterProperties extends js.Object {
  /**
    * Description of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter blocks define which features should be visible in the affected [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) and how the filtered features are drawn. A filter should contain at least one filter block.  The order of filter blocks influences the order in which the filter blocks are applied. For example, if a filter block using a `wire-frame` mode precedes a `solid` filter block in the collection, elements that match either filter block will be drawn as wireframe.
    * > **Known Limitations**  Filter blocks with a `wire-frame` filter mode are currently not rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks)
    */
  var filterBlocks: js.UndefOr[CollectionProperties[BuildingFilterBlock]] = js.undefined
  /**
    * Name of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BuildingFilterProperties {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    filterBlocks: CollectionProperties[BuildingFilterBlock] = null,
    name: java.lang.String = null
  ): BuildingFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (filterBlocks != null) __obj.updateDynamic("filterBlocks")(filterBlocks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BuildingFilterProperties]
  }
}


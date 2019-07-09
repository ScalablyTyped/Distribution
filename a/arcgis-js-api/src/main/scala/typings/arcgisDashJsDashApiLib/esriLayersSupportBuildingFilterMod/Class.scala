package typings
package arcgisDashJsDashApiLib.esriLayersSupportBuildingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/BuildingFilter", JSImport.Namespace)
@js.native
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.BuildingFilter {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.BuildingFilterProperties) = this()
  /**
    * Description of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#description)
    */
  /* CompleteClass */
  override var description: java.lang.String = js.native
  /**
    * Filter blocks define which features should be visible in the affected [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) and how the filtered features are drawn. A filter should contain at least one filter block.  The order of filter blocks influences the order in which the filter blocks are applied. For example, if a filter block using a `wire-frame` mode precedes a `solid` filter block in the collection, elements that match either filter block will be drawn as wireframe.
    * > **Known Limitations**  Filter blocks with a `wire-frame` filter mode are currently not rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks)
    */
  /* CompleteClass */
  override var filterBlocks: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.BuildingFilterBlock] = js.native
  /**
    * Unique filter id. Assign this id to [BuildingSceneLayer.activeFilterId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId) to activate the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id)
    */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /**
    * Name of the filter for display in UIs, for example when the filter is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#name)
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}


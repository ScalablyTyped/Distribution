package typings
package arcgisDashJsDashApiLib.esriLayersSupportDimensionalDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/DimensionalDefinition", JSImport.Namespace)
@js.native
/**
  * A dimensional definition defines a filter based on one variable and one dimension. You can filter with one or multiple dimensional slices. Instances of this class are typically used when filtering data based on [slices](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice) or ranges in one or more dimensions with [MosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html)
  */
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.DimensionalDefinition {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.DimensionalDefinitionProperties) = this()
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


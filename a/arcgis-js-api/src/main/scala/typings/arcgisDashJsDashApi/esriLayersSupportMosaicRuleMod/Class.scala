package typings.arcgisDashJsDashApi.esriLayersSupportMosaicRuleMod

import typings.arcgisDashJsDashApi.__esri.MosaicRule
import typings.arcgisDashJsDashApi.__esri.MosaicRuleProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
@js.native
/**
  * Specifies the mosaic rule when defining how individual images should be mosaicked. It specifies selection, mosaic method, sort order, overlapping pixel resolution, etc. Mosaic rules are for mosaicking rasters in the mosaic dataset. A mosaic rule is used to define:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
  */
class Class () extends MosaicRule {
  def this(properties: MosaicRuleProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}


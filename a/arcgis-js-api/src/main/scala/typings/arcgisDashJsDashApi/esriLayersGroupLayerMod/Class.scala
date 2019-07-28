package typings.arcgisDashJsDashApi.esriLayersGroupLayerMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GroupLayer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.GroupLayerProperties
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PortalItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GroupLayer", JSImport.Namespace)
@js.native
/**
  * GroupLayer provides the ability to organize several sublayers into one common layer. Suppose there are several [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that all represent water features in different dimensions. For example, wells (points), streams (lines), and lakes (polygons). The GroupLayer provides the functionality to treat them as one layer called "Water Features" even though they are stored as separate feature layers. To accomplish this, create a new GroupLayer and use the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#add) method to add each of the water layers to the GroupLayer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html)
  */
class Class () extends GroupLayer {
  def this(properties: GroupLayerProperties) = this()
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
}


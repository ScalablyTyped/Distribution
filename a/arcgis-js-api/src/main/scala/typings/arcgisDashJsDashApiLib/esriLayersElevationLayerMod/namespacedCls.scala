package typings
package arcgisDashJsDashApiLib.esriLayersElevationLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
@js.native
/**
  * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A default [world elevation layer](https://www.arcgis.com/home/item.html?id=7029fb60158543ad845c7e1527af11e4) can be added to the map by setting the [map's ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) property to `world-elevation`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ElevationLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ElevationLayerProperties) = this()
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: java.lang.String = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PortalItem = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SpatialReference = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  /* CompleteClass */
  override var tileInfo: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.TileInfo = js.native
}


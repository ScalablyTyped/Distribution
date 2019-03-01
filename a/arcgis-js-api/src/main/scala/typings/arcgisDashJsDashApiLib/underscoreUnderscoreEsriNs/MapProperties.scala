package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProperties extends LayersMixinProperties {
  /**
    * Specifies a basemap for the map. The basemap is a set of tile layers that give geographic context to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the other [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.  This value can be an instance of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) or one of the strings listed in the table below.
    *
    * Value | Description
    * ------|------------
    * streets | ![basemap-streets](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets.jpg)
    * satellite | ![basemap-satellite](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/satellite.jpg)
    * hybrid | ![basemap-hybrid](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/hybrid.jpg)
    * topo | ![basemap-topo](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/topo.jpg)
    * gray | ![basemap-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/gray.jpg)
    * dark-gray | ![basemap-dark-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/dark-gray.jpg)
    * oceans | ![basemap-oceans](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/oceans.jpg)
    * national-geographic | ![basemap-national-geographic](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/national-geographic.jpg)
    * terrain | ![basemap-terrain](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/terrain.jpg)
    * osm | ![basemap-osm](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/osm.jpg)
    * dark-gray-vector | ![dark-gray-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/dark-gray.jpg)
    * gray-vector | ![gray-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/gray.jpg)
    * streets-vector | ![streets-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets.jpg)
    * topo-vector | ![topo-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/topo.jpg)
    * streets-night-vector | ![streets-night-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-night.jpg)
    * streets-relief-vector | ![streets-relief-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-relief.jpg)
    * streets-navigation-vector | ![streets-navigation-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-navigation.jpg)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties | java.lang.String] = js.undefined
  /**
    * Specifies the surface properties for the map. This property is only relevant when adding the map to a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). It renders the terrain or topographical variations in the real world on the map's surface with a collection of [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html).  This value can be an instance of [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html), or one of the following strings:
    *   * `world-elevation` for a default instance of ground using the [Terrain3D Service](https://www.arcgis.com/home/item.html?id=7029fb60158543ad845c7e1527af11e4).
    *   * `world-topobathymetry` for an instance of ground that combines surface elevation and bathymetry using the [TopoBathy3D Service](https://www.arcgis.com/home/item.html?id=0c69ba5a5d254118841d43f03aa3e97d).
    *
    *
    * The ground may not be set to `null` or `undefined`, it is guaranteed to always contain an instance of type [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html). The elevation can be removed from the ground by setting the ground property to a new empty [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) instance or by removing all the ground layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground)
    */
  var ground: js.UndefOr[GroundProperties | java.lang.String] = js.undefined
}

object MapProperties {
  @scala.inline
  def apply(
    basemap: BasemapProperties | java.lang.String = null,
    ground: GroundProperties | java.lang.String = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null
  ): MapProperties = {
    val __obj = js.Dynamic.literal()
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (ground != null) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProperties]
  }
}


package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapProperties extends LayersMixinProperties {
  /**
    * Specifies a basemap for the map. The basemap is a set of tile layers that give geographic context to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the other [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.  This value can be an instance of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) or one of the strings listed in the table below.
    *
    * Value | Source | Thumbnail
    * ------|------- |----------
    * `topo`                | https://services.arcgisonline.com/ArcGIS/rest/services/World_Topo_Map/MapServer   | ![basemap-topo](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/topo.jpg)
    * `streets`             | https://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer | ![basemap-streets](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets.jpg)
    * `satellite`           | https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer    | ![basemap-satellite](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/satellite.jpg)
    * `hybrid`              | https://services.arcgisonline.com/ArcGIS/rest/services/Reference/World_Boundaries_and_Places/MapServer   and  https://services.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer            | ![basemap-hybrid](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/hybrid.jpg)
    * `dark-gray`           | https://services.arcgisonline.com/ArcGIS/rest/services/Canvas/World_Dark_Gray_Reference/MapServer        and  https://services.arcgisonline.com/ArcGIS/rest/services/Canvas/World_Dark_Gray_Base/MapServer   | ![basemap-dark-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/dark-gray.jpg)
    * `gray`                | https://services.arcgisonline.com/ArcGIS/rest/services/Canvas/World_Light_Gray_Reference/MapServer       and  https://services.arcgisonline.com/ArcGIS/rest/services/Canvas/World_Light_Gray_Base/MapServer | ![basemap-gray](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/gray.jpg)
    * `national-geographic` | https://services.arcgisonline.com/ArcGIS/rest/services/NatGeo_World_Map/MapServer | ![basemap-national-geographic](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/national-geographic.jpg)
    * `oceans`              | https://services.arcgisonline.com/arcgis/rest/services/Ocean/World_Ocean_Reference/MapServer             and  https://services.arcgisonline.com/arcgis/rest/services/Ocean/World_Ocean_Base/MapServer | ![basemap-oceans](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/oceans.jpg)
    * `osm`                 | [OpenStreetMapLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OpenStreetMapLayer.html) | ![basemap-osm](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/osm.jpg)
    * `terrain`             | https://services.arcgisonline.com/ArcGIS/rest/services/Reference/World_Reference_Overlay/MapServer       and  https://services.arcgisonline.com/ArcGIS/rest/services/World_Terrain_Base/MapServer | ![basemap-terrain](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/terrain.jpg)
    * `dark-gray-vector`          | [Dark Gray Canvas [v2]](https://www.arcgis.com/home/item.html?id=c11ce4f7801740b2905eb03ddc963ac8)         | ![dark-gray-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/dark-gray.jpg)
    * `gray-vector`               | [Light Gray Canvas [v2]](https://www.arcgis.com/home/item.html?id=8a2cba3b0ebf4140b7c0dc5ee149549a)        | ![gray-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/gray.jpg)
    * `streets-vector`            | [World Street Map [v2]](https://www.arcgis.com/home/item.html?id=de26a3cf4cc9451298ea173c4b324736)         | ![streets-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets.jpg)
    * `streets-night-vector`      | [World Street Map (Night) [v2]](https://www.arcgis.com/home/item.html?id=86f556a2d1fd468181855a35e344567f) | ![streets-night-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-night.jpg)
    * `streets-navigation-vector` | [World Navigation Map [v2]](https://www.arcgis.com/home/item.html?id=63c47b7177f946b49902c24129b87252)     | ![streets-navigation-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-navigation.jpg)
    * `topo-vector`               | https://services.arcgisonline.com/arcgis/rest/services/Elevation/World_Hillshade/MapServer   and  [World Topographic Map [v2]](https://www.arcgis.com/home/item.html?id=7dc6cea0b1764a1f9af2e679f642f0f5) | ![topo-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/topo.jpg)
    * `streets-relief-vector`     | https://services.arcgisonline.com/arcgis/rest/services/Elevation/World_Hillshade/MapServer   and  [World Street Map (with Relief) [v2]](https://www.arcgis.com/home/item.html?id=b266e6d17fc345b498345613930fbd76) | ![streets-relief-vector](https://developers.arcgis.com/javascript/assets/img/apiref/basemap/streets-relief.jpg)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties | String] = js.undefined
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
  var ground: js.UndefOr[GroundProperties | String] = js.undefined
}

object MapProperties {
  @scala.inline
  def apply(
    basemap: BasemapProperties | String = null,
    ground: GroundProperties | String = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null
  ): MapProperties = {
    val __obj = js.Dynamic.literal()
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (ground != null) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapProperties]
  }
}


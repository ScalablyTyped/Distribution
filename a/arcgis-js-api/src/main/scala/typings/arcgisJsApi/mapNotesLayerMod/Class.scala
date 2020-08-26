package typings.arcgisJsApi.mapNotesLayerMod

import typings.arcgisJsApi.esri.MapNotesLayer
import typings.arcgisJsApi.esri.MapNotesLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/MapNotesLayer", JSImport.Namespace)
@js.native
/**
  * The MapNotesLayer is used to create layers based on Map Notes within a WebMap or PortalItem. Map notes are part of web maps, and are typically created with ArcGIS Online MapViewer. For additional information, please refer to the ArcGIS Online documentation on how to [Add Map notes](http://doc.arcgis.com/en/arcgis-online/create-maps/add-layers.htm#ESRI_SECTION1_0C90A3B63ABD49D5B9535055991F4684). Within the [web map specification](https://developers.arcgis.com/web-map-specification/), map notes are a special type of [FeatureCollections](https://developers.arcgis.com/web-map-specification/objects/featureCollection/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html)
  */
class Class () extends MapNotesLayer {
  def this(properties: MapNotesLayerProperties) = this()
}


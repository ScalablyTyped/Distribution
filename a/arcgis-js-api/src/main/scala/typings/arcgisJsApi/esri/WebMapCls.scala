package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.WebMap")
@js.native
/**
  * Loads a [WebMap](https://doc.arcgis.com/en/arcgis-online/create-maps/make-your-first-map.htm) from [ArcGIS Online](https://www.arcgis.com/home/) or [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/latest/administer/windows/what-is-portal-for-arcgis-.htm) into a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). It defines the content, style, and bookmarks of your webmap, and it can be shared across multiple ArcGIS web and desktop applications. The webmap is saved as a JSON document that can be consumed by the ArcGIS API for JavaScript via the WebMap class to easily create compelling 2D applications. The JSON document is written according to the [webmap specification](https://developers.arcgis.com/web-map-specification/). Although you can easily create your own webmaps, there are many sample [webmaps in ArcGIS Online](https://webmaps.maps.arcgis.com/home/group.html?id=bf19f0a0871649c49f6743dbe8138ecb) that you can use to get started with the API. You may modify or add new content to these webmaps.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html)
  */
class WebMapCls () extends WebMap {
  def this(properties: WebMapProperties) = this()
}


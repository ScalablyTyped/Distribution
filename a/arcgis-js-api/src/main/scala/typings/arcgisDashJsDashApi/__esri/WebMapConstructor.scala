package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebMapConstructor
  extends /**
  * Loads a [WebMap](https://doc.arcgis.com/en/arcgis-online/create-maps/make-your-first-map.htm) from [ArcGIS Online](https://www.arcgis.com/home/) or [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/latest/administer/windows/what-is-portal-for-arcgis-.htm) into a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). It defines the content, style, and bookmarks of your webmap, and it can be shared across multiple ArcGIS web and desktop applications. The webmap is saved as a JSON document that can be consumed by the ArcGIS API for JavaScript via the WebMap class to easily create compelling 2D applications. The JSON document is written according to the [webmap specification](https://developers.arcgis.com/web-map-specification/). Although you can easily create your own webmaps, there are many sample [webmaps in ArcGIS Online](https://webmaps.maps.arcgis.com/home/group.html?id=bf19f0a0871649c49f6743dbe8138ecb) that you can use to get started with the API. You may modify or add new content to these webmaps.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html)
  */
Instantiable0[WebMap]
     with Instantiable1[/* properties */ WebMapProperties, WebMap] {
  /**
    * Creates a new instance of [this class]() and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. If the [WebMap]() is used outside of a view, you must call [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load) explicitly to interact with its resources. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for details and examples of when and how to use this function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [web map specification](https://developers.arcgis.com/web-map-specification/) for more detailed information on serializing web map to JSON.
    *
    */
  def fromJSON(json: js.Any): js.Any = js.native
}


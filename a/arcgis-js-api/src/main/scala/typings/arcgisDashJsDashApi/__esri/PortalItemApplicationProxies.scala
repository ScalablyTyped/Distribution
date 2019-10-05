package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemApplicationProxies extends Object {
  /**
    * The proxy ID registered in ArcGIS Online or ArcGIS Enterprise Portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var proxyId: String
  /**
    * The proxy URL for the source URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var proxyUrl: String
  /**
    * The URL of the premium map service layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#applicationProxies)
    */
  var sourceUrl: String
}

object PortalItemApplicationProxies {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    proxyId: String,
    proxyUrl: String,
    sourceUrl: String
  ): PortalItemApplicationProxies = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), proxyId = proxyId, proxyUrl = proxyUrl, sourceUrl = sourceUrl)
  
    __obj.asInstanceOf[PortalItemApplicationProxies]
  }
}


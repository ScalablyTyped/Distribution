package typings.arcgisDashJsDashApi.esriBasemapMod

import typings.arcgisDashJsDashApi.__esri.Basemap
import typings.arcgisDashJsDashApi.__esri.BasemapProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/Basemap", JSImport.Namespace)
@js.native
/**
  * Creates a new basemap object. Basemaps can be created from a [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html), from a well known [basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId), or can be used for creating custom basemaps. These basemaps may be created from tiled services you publish to your own server, or from tiled services published by third parties.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
  */
class Class () extends Basemap {
  def this(properties: BasemapProperties) = this()
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


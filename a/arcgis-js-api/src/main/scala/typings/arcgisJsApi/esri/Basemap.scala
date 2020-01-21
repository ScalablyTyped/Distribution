package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basemap
  extends Accessor
     with Loadable
     with JSONSupport {
  /**
    * A collection of tile layers that make up the basemap's features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers)
    */
  var baseLayers: Collection[Layer] = js.native
  /**
    * An identifier used to refer to the basemap when referencing it elsewhere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#id)
    */
  var id: String = js.native
  /**
    * Indicates whether the basemap instance has loaded. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * A collection of tiled reference layers for displaying labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#referenceLayers)
    */
  var referenceLayers: Collection[Layer] = js.native
  /**
    * The spatial reference of the Basemap. This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map.  When using an [Esri basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap), the default spatial reference is Web Mercator Auxiliary Sphere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The URL pointing to an image that represents the basemap. When using a custom basemap in the [BasemapToggle](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html) widget, the image specified here will display in the widget. When the user clicks the image, the map's basemap will update to the basemap associated with the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  /**
    * The title of the basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#title)
    */
  var title: String = js.native
  /**
    * Loads all the externally loadable resources associated with the basemap. For the basemap this will load all the base layers and reference layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#loadAll)
    *
    *
    */
  def loadAll(): js.Promise[Basemap] = js.native
}

@JSGlobal("__esri.Basemap")
@js.native
object Basemap extends TopLevel[BasemapConstructor]


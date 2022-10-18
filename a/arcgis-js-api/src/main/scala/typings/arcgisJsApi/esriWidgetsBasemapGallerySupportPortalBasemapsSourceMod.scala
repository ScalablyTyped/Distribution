package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalBasemapsSource
import typings.arcgisJsApi.esri.PortalBasemapsSourceConstructor
import typings.arcgisJsApi.esri.PortalBasemapsSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapGallerySupportPortalBasemapsSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/PortalBasemapsSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalBasemapsSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/PortalBasemapsSource", JSImport.Namespace)
  @js.native
  /**
    * The PortalBasemapsSource class is a Portal-driven [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source) in the [BasemapGalleryViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html) or [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html)
    */
  open class Class ()
    extends StObject
       with PortalBasemapsSource {
    def this(properties: PortalBasemapsSourceProperties) = this()
  }
  
  type _To = js.Object & PortalBasemapsSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapGallerySupportPortalBasemapsSourceMod.foo` */
  override def _to: js.Object & PortalBasemapsSourceConstructor = ^
}

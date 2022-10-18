package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocalBasemapsSource
import typings.arcgisJsApi.esri.LocalBasemapsSourceConstructor
import typings.arcgisJsApi.esri.LocalBasemapsSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsBasemapGallerySupportLocalBasemapsSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/LocalBasemapsSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocalBasemapsSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/LocalBasemapsSource", JSImport.Namespace)
  @js.native
  /**
    * The LocalBasemapsSource class is a Collection-driven [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source) in the [BasemapGalleryViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html) or [BasemapGallery](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html)
    */
  open class Class ()
    extends StObject
       with LocalBasemapsSource {
    def this(properties: LocalBasemapsSourceProperties) = this()
  }
  
  type _To = js.Object & LocalBasemapsSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsBasemapGallerySupportLocalBasemapsSourceMod.foo` */
  override def _to: js.Object & LocalBasemapsSourceConstructor = ^
}

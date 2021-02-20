package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapGallery
import typings.arcgisJsApi.esri.BasemapGalleryConstructor
import typings.arcgisJsApi.esri.BasemapGalleryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapGalleryMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery", JSImport.Namespace)
  @js.native
  val ^ : BasemapGalleryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery", JSImport.Namespace)
  @js.native
  /**
    * The BasemapGallery widget displays a collection images representing basemaps from ArcGIS.com or a user-defined set of map or image services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html)
    */
  class Class () extends BasemapGallery {
    def this(properties: BasemapGalleryProperties) = this()
  }
  
  type _To = BasemapGalleryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapGalleryMod.foo` */
  override def _to: BasemapGalleryConstructor = ^
}

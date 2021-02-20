package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapGalleryViewModel
import typings.arcgisJsApi.esri.BasemapGalleryViewModelConstructor
import typings.arcgisJsApi.esri.BasemapGalleryViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapGalleryViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/BasemapGalleryViewModel", JSImport.Namespace)
  @js.native
  val ^ : BasemapGalleryViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/BasemapGalleryViewModel", JSImport.Namespace)
  @js.native
  class Class () extends BasemapGalleryViewModel {
    def this(properties: BasemapGalleryViewModelProperties) = this()
  }
  
  type _To = BasemapGalleryViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapGalleryViewModelMod.foo` */
  override def _to: BasemapGalleryViewModelConstructor = ^
}

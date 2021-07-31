package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapGalleryItem
import typings.arcgisJsApi.esri.BasemapGalleryItemConstructor
import typings.arcgisJsApi.esri.BasemapGalleryItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapGalleryItemMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/BasemapGalleryItem", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapGalleryItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/BasemapGalleryItem", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BasemapGalleryItem {
    def this(properties: BasemapGalleryItemProperties) = this()
  }
  
  type _To = js.Object & BasemapGalleryItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapGalleryItemMod.foo` */
  override def _to: js.Object & BasemapGalleryItemConstructor = ^
}

package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PixelBlock
import typings.arcgisJsApi.esri.PixelBlockConstructor
import typings.arcgisJsApi.esri.PixelBlockProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportPixelBlockMod extends Shortcut {
  
  @JSImport("esri/layers/support/PixelBlock", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PixelBlockConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/PixelBlock", JSImport.Namespace)
  @js.native
  /**
    * An object representing the pixel arrays in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html)
    */
  open class Class ()
    extends StObject
       with PixelBlock {
    def this(properties: PixelBlockProperties) = this()
  }
  
  type _To = js.Object & PixelBlockConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportPixelBlockMod.foo` */
  override def _to: js.Object & PixelBlockConstructor = ^
}

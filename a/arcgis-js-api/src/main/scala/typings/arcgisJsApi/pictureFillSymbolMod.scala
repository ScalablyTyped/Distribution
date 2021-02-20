package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PictureFillSymbol
import typings.arcgisJsApi.esri.PictureFillSymbolConstructor
import typings.arcgisJsApi.esri.PictureFillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureFillSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/PictureFillSymbol", JSImport.Namespace)
  @js.native
  val ^ : PictureFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PictureFillSymbol", JSImport.Namespace)
  @js.native
  /**
    * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
    */
  class Class () extends PictureFillSymbol {
    def this(properties: PictureFillSymbolProperties) = this()
  }
  
  type _To = PictureFillSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pictureFillSymbolMod.foo` */
  override def _to: PictureFillSymbolConstructor = ^
}

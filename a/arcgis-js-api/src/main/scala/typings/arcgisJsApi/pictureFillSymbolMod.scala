package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PictureFillSymbol
import typings.arcgisJsApi.esri.PictureFillSymbolConstructor
import typings.arcgisJsApi.esri.PictureFillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureFillSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/PictureFillSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PictureFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PictureFillSymbol", JSImport.Namespace)
  @js.native
  /**
    * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
    */
  open class Class ()
    extends StObject
       with PictureFillSymbol {
    def this(properties: PictureFillSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PictureFillSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pictureFillSymbolMod.foo` */
  override def _to: js.Object & PictureFillSymbolConstructor = ^
}

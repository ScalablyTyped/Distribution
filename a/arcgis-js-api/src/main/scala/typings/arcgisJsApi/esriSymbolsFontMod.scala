package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Font
import typings.arcgisJsApi.esri.FontConstructor
import typings.arcgisJsApi.esri.FontProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsFontMod extends Shortcut {
  
  @JSImport("esri/symbols/Font", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FontConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/Font", JSImport.Namespace)
  @js.native
  /**
    * The font used to display [2D text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) and [3D text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html)
    */
  open class Class ()
    extends StObject
       with Font {
    def this(properties: FontProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FontConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsFontMod.foo` */
  override def _to: js.Object & FontConstructor = ^
}

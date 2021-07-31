package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SimpleLineSymbol
import typings.arcgisJsApi.esri.SimpleLineSymbolConstructor
import typings.arcgisJsApi.esri.SimpleLineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleLineSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/SimpleLineSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SimpleLineSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/SimpleLineSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleLineSymbol is used for rendering 2D [polyline geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html)
    */
  class Class ()
    extends StObject
       with SimpleLineSymbol {
    def this(properties: SimpleLineSymbolProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & SimpleLineSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `simpleLineSymbolMod.foo` */
  override def _to: js.Object & SimpleLineSymbolConstructor = ^
}

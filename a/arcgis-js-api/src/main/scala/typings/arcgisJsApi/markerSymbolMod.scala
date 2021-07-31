package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MarkerSymbol
import typings.arcgisJsApi.esri.MarkerSymbolConstructor
import typings.arcgisJsApi.esri.MarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/MarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/MarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * Marker symbols are used to draw [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html)
    */
  class Class ()
    extends StObject
       with MarkerSymbol {
    def this(properties: MarkerSymbolProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & MarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `markerSymbolMod.foo` */
  override def _to: js.Object & MarkerSymbolConstructor = ^
}

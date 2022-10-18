package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineSymbol
import typings.arcgisJsApi.esri.LineSymbolConstructor
import typings.arcgisJsApi.esri.LineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsLineSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/LineSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LineSymbol", JSImport.Namespace)
  @js.native
  /**
    * Line symbols are used to draw [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html)
    */
  open class Class ()
    extends StObject
       with LineSymbol {
    def this(properties: LineSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LineSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsLineSymbolMod.foo` */
  override def _to: js.Object & LineSymbolConstructor = ^
}

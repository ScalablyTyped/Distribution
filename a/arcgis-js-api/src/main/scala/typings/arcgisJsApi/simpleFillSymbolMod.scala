package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SimpleFillSymbol
import typings.arcgisJsApi.esri.SimpleFillSymbolConstructor
import typings.arcgisJsApi.esri.SimpleFillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleFillSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/SimpleFillSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SimpleFillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/SimpleFillSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleFillSymbol is used for rendering 2D polygons in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html)
    */
  class Class ()
    extends StObject
       with SimpleFillSymbol {
    def this(properties: SimpleFillSymbolProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & SimpleFillSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `simpleFillSymbolMod.foo` */
  override def _to: js.Object & SimpleFillSymbolConstructor = ^
}

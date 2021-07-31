package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PathSymbol3DLayer
import typings.arcgisJsApi.esri.PathSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.PathSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/PathSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PathSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PathSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
    */
  class Class ()
    extends StObject
       with PathSymbol3DLayer {
    def this(properties: PathSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & PathSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pathSymbol3DLayerMod.foo` */
  override def _to: js.Object & PathSymbol3DLayerConstructor = ^
}

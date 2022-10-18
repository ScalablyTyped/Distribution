package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextSymbol3DLayer
import typings.arcgisJsApi.esri.TextSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsTextSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/TextSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TextSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/TextSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
    */
  open class Class ()
    extends StObject
       with TextSymbol3DLayer {
    def this(properties: TextSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TextSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsTextSymbol3DLayerMod.foo` */
  override def _to: js.Object & TextSymbol3DLayerConstructor = ^
}

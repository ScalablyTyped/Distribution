package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WebStyleSymbol
import typings.arcgisJsApi.esri.WebStyleSymbolConstructor
import typings.arcgisJsApi.esri.WebStyleSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsWebStyleSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/WebStyleSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WebStyleSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/WebStyleSymbol", JSImport.Namespace)
  @js.native
  /**
    * WebStyleSymbol is a class used to conveniently create vector 2D symbols and realistic and thematic 3D symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)
    */
  open class Class ()
    extends StObject
       with WebStyleSymbol {
    def this(properties: WebStyleSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & WebStyleSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsWebStyleSymbolMod.foo` */
  override def _to: js.Object & WebStyleSymbolConstructor = ^
}

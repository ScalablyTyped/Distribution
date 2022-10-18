package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Symbol
import typings.arcgisJsApi.esri.SymbolConstructor
import typings.arcgisJsApi.esri.SymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/Symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/Symbol", JSImport.Namespace)
  @js.native
  /**
    * Symbol is the base class for all symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html)
    */
  open class Class ()
    extends StObject
       with Symbol {
    def this(properties: SymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsSymbolMod.foo` */
  override def _to: js.Object & SymbolConstructor = ^
}

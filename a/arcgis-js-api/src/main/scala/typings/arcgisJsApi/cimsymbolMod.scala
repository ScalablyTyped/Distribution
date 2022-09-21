package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CIMSymbol
import typings.arcgisJsApi.esri.CIMSymbolConstructor
import typings.arcgisJsApi.esri.CIMSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cimsymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CIMSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  /**
    * CIMSymbols are high quality, scalable, multi-layer vector symbols for features and graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
    */
  open class Class ()
    extends StObject
       with CIMSymbol {
    def this(properties: CIMSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & CIMSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `cimsymbolMod.foo` */
  override def _to: js.Object & CIMSymbolConstructor = ^
}

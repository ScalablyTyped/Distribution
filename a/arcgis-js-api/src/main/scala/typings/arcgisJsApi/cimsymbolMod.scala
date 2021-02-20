package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CIMSymbol
import typings.arcgisJsApi.esri.CIMSymbolConstructor
import typings.arcgisJsApi.esri.CIMSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cimsymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  val ^ : CIMSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  /**
    * CIMSymbols are used to display multi-layer vector symbols for features and graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
    */
  class Class () extends CIMSymbol {
    def this(properties: CIMSymbolProperties) = this()
  }
  
  type _To = CIMSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `cimsymbolMod.foo` */
  override def _to: CIMSymbolConstructor = ^
}

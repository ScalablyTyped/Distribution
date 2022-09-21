package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbolConstructor
  extends StObject
     with /**
  * CIMSymbols are high quality, scalable, multi-layer vector symbols for features and graphics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
  */
Instantiable0[CIMSymbol]
     with Instantiable1[/* properties */ CIMSymbolProperties, CIMSymbol] {
  
  def fromJSON(json: Any): CIMSymbol = js.native
}

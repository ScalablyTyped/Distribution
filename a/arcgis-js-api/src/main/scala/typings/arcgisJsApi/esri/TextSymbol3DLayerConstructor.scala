package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSymbol3DLayerConstructor
  extends StObject
     with /**
  * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
  */
Instantiable0[TextSymbol3DLayer]
     with Instantiable1[/* properties */ TextSymbol3DLayerProperties, TextSymbol3DLayer] {
  
  def fromJSON(json: Any): TextSymbol3DLayer = js.native
}

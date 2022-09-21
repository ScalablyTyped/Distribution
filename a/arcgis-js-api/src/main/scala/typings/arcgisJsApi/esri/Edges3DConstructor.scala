package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edges3DConstructor
  extends StObject
     with /**
  * Edges3D is the base class for symbol classes that add edge rendering visualization to existing symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html)
  */
Instantiable0[Edges3D]
     with Instantiable1[/* properties */ Edges3DProperties, Edges3D] {
  
  def fromJSON(json: Any): Edges3D = js.native
}

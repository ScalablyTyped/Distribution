package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callout3DConstructor
  extends StObject
     with /**
  * When symbols have an offset from their position, it's important to still see what the real location is.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html)
  */
Instantiable0[Callout3D]
     with Instantiable1[/* properties */ Callout3DProperties, Callout3D] {
  
  def fromJSON(json: Any): Callout3D = js.native
}

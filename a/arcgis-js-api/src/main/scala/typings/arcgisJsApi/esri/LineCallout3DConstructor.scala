package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineCallout3DConstructor
  extends StObject
     with /**
  * This type of callout displays a line to connect a symbol or a label with its actual location in the scene.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
  */
Instantiable0[LineCallout3D]
     with Instantiable1[/* properties */ LineCallout3DProperties, LineCallout3D] {
  
  def fromJSON(json: Any): LineCallout3D = js.native
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewpointConstructor
  extends StObject
     with /**
  * Describes a point of view for a 2D or 3D view.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
  */
Instantiable0[Viewpoint]
     with Instantiable1[/* properties */ ViewpointProperties, Viewpoint] {
  
  def fromJSON(json: Any): Viewpoint = js.native
}

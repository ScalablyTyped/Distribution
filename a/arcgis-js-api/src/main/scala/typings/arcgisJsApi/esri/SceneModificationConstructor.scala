package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModificationConstructor
  extends StObject
     with /**
  * The SceneModification is used to perform a client-side geometric modifications.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html)
  */
Instantiable0[SceneModification]
     with Instantiable1[/* properties */ SceneModificationProperties, SceneModification] {
  
  def fromJSON(json: Any): SceneModification = js.native
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModificationsConstructor
  extends StObject
     with /**
  * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModifications.html)
  */
Instantiable0[SceneModifications]
     with Instantiable1[
      (/* properties */ js.Array[SceneModificationProperties]) | (/* properties */ Collection[SceneModificationProperties]) | (/* properties */ SceneModificationsProperties), 
      SceneModifications
    ] {
  
  def fromJSON(json: Any): SceneModifications = js.native
}

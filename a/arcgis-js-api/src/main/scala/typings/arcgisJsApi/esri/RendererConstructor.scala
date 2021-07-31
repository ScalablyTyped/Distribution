package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererConstructor
  extends StObject
     with /**
  * Renderers define how to visually represent each feature in one of the following layer types:.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html)
  */
Instantiable0[Renderer]
     with Instantiable1[/* properties */ RendererProperties, Renderer] {
  
  def fromJSON(json: js.Any): Renderer = js.native
}

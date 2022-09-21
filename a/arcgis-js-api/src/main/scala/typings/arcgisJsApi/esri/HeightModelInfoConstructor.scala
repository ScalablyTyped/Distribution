package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightModelInfoConstructor
  extends StObject
     with /**
  * The height model info defines the characteristics of a vertical coordinate system.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html)
  */
Instantiable0[HeightModelInfo]
     with Instantiable1[/* properties */ HeightModelInfoProperties, HeightModelInfo] {
  
  def fromJSON(json: Any): HeightModelInfo = js.native
}

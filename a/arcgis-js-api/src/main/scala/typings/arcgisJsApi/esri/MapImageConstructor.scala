package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapImageConstructor
  extends StObject
     with /**
  * Represents the data object for the dynamically generated map.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MapImage.html)
  */
Instantiable0[MapImage]
     with Instantiable1[/* properties */ MapImageProperties, MapImage] {
  
  def fromJSON(json: Any): MapImage = js.native
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColormapInfoConstructor
  extends StObject
     with /**
  * The ColormapInfo describes pixel value, RGB colors and labels to color the raster.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html)
  */
Instantiable0[ColormapInfo]
     with Instantiable1[/* properties */ ColormapInfoProperties, ColormapInfo] {
  
  def fromJSON(json: Any): ColormapInfo = js.native
}

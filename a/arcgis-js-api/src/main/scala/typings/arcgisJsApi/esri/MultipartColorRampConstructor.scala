package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartColorRampConstructor
  extends StObject
     with /**
  * Creates a multipart color ramp to combine multiple continuous color ramps for use in raster renderers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-MultipartColorRamp.html)
  */
Instantiable0[MultipartColorRamp]
     with Instantiable1[/* properties */ MultipartColorRampProperties, MultipartColorRamp] {
  
  def fromJSON(json: Any): MultipartColorRamp = js.native
}

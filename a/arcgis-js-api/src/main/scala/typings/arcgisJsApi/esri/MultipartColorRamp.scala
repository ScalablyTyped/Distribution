package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multipart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartColorRamp
  extends StObject
     with ColorRamp {
  
  /**
    * Define an array of algorithmic color ramps used to generate the multi part ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#colorRamps)
    */
  var colorRamps: js.Array[AlgorithmicColorRamp] = js.native
  
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#type)
    */
  @JSName("type")
  val type_MultipartColorRamp: multipart = js.native
}

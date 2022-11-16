package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeographicTransformation")
@js.native
open class GeographicTransformation ()
  extends StObject
     with typings.arcgisJsApi.esri.GeographicTransformation {
  def this(properties: Any) = this()
  
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    */
  /* CompleteClass */
  override def getInverse(): typings.arcgisJsApi.esri.GeographicTransformation = js.native
  
  /**
    * Geographic transformation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  /* CompleteClass */
  var steps: js.Array[typings.arcgisJsApi.esri.GeographicTransformationStep] = js.native
}

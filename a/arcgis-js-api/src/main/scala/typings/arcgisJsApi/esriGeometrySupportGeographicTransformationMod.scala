package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GeographicTransformation
import typings.arcgisJsApi.esri.GeographicTransformationStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySupportGeographicTransformationMod {
  
  @JSImport("esri/geometry/support/GeographicTransformation", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GeographicTransformation {
    def this(properties: Any) = this()
    
    /**
    		 * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    		 */
    /* CompleteClass */
    override def getInverse(): GeographicTransformation = js.native
    
    /**
    		 * Geographic transformation steps.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    		 */
    /* CompleteClass */
    var steps: js.Array[GeographicTransformationStep] = js.native
  }
}

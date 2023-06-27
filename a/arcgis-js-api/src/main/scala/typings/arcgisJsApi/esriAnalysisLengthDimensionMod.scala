package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LengthDimension
import typings.arcgisJsApi.esri.LengthDimensionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisLengthDimensionMod {
  
  @JSImport("esri/analysis/LengthDimension", JSImport.Namespace)
  @js.native
  /**
  		 * LengthDimension enables the measurement of linear distances between the specified [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint) points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html)
  		 */
  open class ^ ()
    extends StObject
       with LengthDimension {
    def this(properties: LengthDimensionProperties) = this()
  }
}

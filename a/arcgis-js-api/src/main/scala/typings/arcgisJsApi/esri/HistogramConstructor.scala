package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramConstructor
  extends StObject
     with Instantiable0[Histogram_]
     with Instantiable1[/* properties */ HistogramProperties, Histogram_] {
  
  /**
    * A convenience function used to create a Histogram widget instance from the result of the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#fromHistogramResult)
    */
  def fromHistogramResult(result: HistogramResult): Histogram_ = js.native
}

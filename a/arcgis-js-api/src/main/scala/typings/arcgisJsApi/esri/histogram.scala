package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates a histogram based on data in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) for a given field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html)
  */
trait histogram extends StObject {
  
  /**
    * Generates a histogram for data returned from a `field` in a given `layer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  def histogram(params: histogramHistogramParams): js.Promise[HistogramResult]
}
object histogram {
  
  @scala.inline
  def apply(histogram: histogramHistogramParams => js.Promise[HistogramResult]): histogram = {
    val __obj = js.Dynamic.literal(histogram = js.Any.fromFunction1(histogram))
    __obj.asInstanceOf[histogram]
  }
  
  @scala.inline
  implicit class histogramMutableBuilder[Self <: histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistogram(value: histogramHistogramParams => js.Promise[HistogramResult]): Self = StObject.set(x, "histogram", js.Any.fromFunction1(value))
  }
}

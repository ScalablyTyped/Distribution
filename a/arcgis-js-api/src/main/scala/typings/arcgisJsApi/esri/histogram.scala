package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generates a histogram based on data in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) for a given field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html)
  */
@js.native
trait histogram extends js.Object {
  
  /**
    * Generates a histogram for data returned from a `field` in a given `layer`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html#histogram)
    */
  def histogram(params: histogramHistogramParams): js.Promise[HistogramResult] = js.native
}
object histogram {
  
  @scala.inline
  def apply(histogram: histogramHistogramParams => js.Promise[HistogramResult]): histogram = {
    val __obj = js.Dynamic.literal(histogram = js.Any.fromFunction1(histogram))
    __obj.asInstanceOf[histogram]
  }
  
  @scala.inline
  implicit class histogramOps[Self <: histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHistogram(value: histogramHistogramParams => js.Promise[HistogramResult]): Self = this.set("histogram", js.Any.fromFunction1(value))
  }
}

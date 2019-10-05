package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramConstructor
  extends /**
  * Renders a histogram to visualize the spread of a dataset based on [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins) representing buckets, or sub-ranges, of data. Each [bin](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#Bin) is defined by a minimum and maximum value and a total count.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html)
  */
Instantiable0[Histogram]
     with Instantiable1[/* properties */ HistogramProperties, Histogram] {
  /**
    * A convenience function used to create a Histogram widget instance from the result of the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#fromHistogramResult)
    *
    * @param result The result of the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function used to generate a histogram for a field or expression from a layer.
    *
    */
  def fromHistogramResult(result: HistogramResult): Histogram = js.native
}


package typings.arcgisJsApi

import typings.arcgisJsApi.esri.HistogramProperties
import typings.arcgisJsApi.esri.HistogramResult
import typings.arcgisJsApi.esri.Histogram_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsHistogramMod {
  
  @JSImport("esri/widgets/Histogram", JSImport.Namespace)
  @js.native
  /**
  		 * Renders a histogram to visualize the spread of a dataset based on [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins) representing buckets, or sub-ranges, of data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html)
  		 */
  open class ^ ()
    extends StObject
       with Histogram_ {
    def this(properties: HistogramProperties) = this()
  }
  @JSImport("esri/widgets/Histogram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience function used to create a Histogram widget instance from the result of the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-histogram.html) statistics function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#fromHistogramResult)
  		 */
  inline def fromHistogramResult(result: HistogramResult): Histogram_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHistogramResult")(result.asInstanceOf[js.Any]).asInstanceOf[Histogram_]
}

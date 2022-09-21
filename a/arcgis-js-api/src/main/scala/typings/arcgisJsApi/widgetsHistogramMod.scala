package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HistogramConstructor
import typings.arcgisJsApi.esri.HistogramProperties
import typings.arcgisJsApi.esri.Histogram_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsHistogramMod extends Shortcut {
  
  @JSImport("esri/widgets/Histogram", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HistogramConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Histogram", JSImport.Namespace)
  @js.native
  /**
    * Renders a histogram to visualize the spread of a dataset based on [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html#bins) representing buckets, or sub-ranges, of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html)
    */
  open class Class ()
    extends StObject
       with Histogram_ {
    def this(properties: HistogramProperties) = this()
  }
  
  type _To = js.Object & HistogramConstructor
  
  /* This means you don't have to write `^`, but can instead just say `widgetsHistogramMod.foo` */
  override def _to: js.Object & HistogramConstructor = ^
}

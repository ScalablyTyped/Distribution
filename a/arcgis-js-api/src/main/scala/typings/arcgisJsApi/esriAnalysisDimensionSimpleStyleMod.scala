package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DimensionSimpleStyle
import typings.arcgisJsApi.esri.DimensionSimpleStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisDimensionSimpleStyleMod {
  
  @JSImport("esri/analysis/DimensionSimpleStyle", JSImport.Namespace)
  @js.native
  /**
  		 * Style that specifies how dimensions and their labels are displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html)
  		 */
  open class ^ ()
    extends StObject
       with DimensionSimpleStyle {
    def this(properties: DimensionSimpleStyleProperties) = this()
  }
}

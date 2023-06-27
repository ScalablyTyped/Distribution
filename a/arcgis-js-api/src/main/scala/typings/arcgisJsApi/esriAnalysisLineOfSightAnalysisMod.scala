package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineOfSightAnalysis
import typings.arcgisJsApi.esri.LineOfSightAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisLineOfSightAnalysisMod {
  
  @JSImport("esri/analysis/LineOfSightAnalysis", JSImport.Namespace)
  @js.native
  /**
  		 * LineOfSightAnalysis computes the line of sight from a single observer position towards a set of targets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html)
  		 */
  open class ^ ()
    extends StObject
       with LineOfSightAnalysis {
    def this(properties: LineOfSightAnalysisProperties) = this()
  }
}

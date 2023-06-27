package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightAnalysis
  extends StObject
     with Accessor {
  
  /**
  		 * Observer location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer)
  		 */
  var observer: LineOfSightAnalysisObserver = js.native
  
  /**
  		 * Target locations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#targets)
  		 */
  var targets: Collection[LineOfSightAnalysisTarget] = js.native
}

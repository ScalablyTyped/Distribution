package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSeriesValuesMod {
  
  @JSImport("@antv/data-set/lib/util/get-series-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(extent: js.Tuple2[Double, Double], bw: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(extent.asInstanceOf[js.Any], bw.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}

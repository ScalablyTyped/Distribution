package typings.antvPathUtil

import typings.antvPathUtil.libTypesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPath2CurveMod {
  
  @JSImport("@antv/path-util/lib/path-2-curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: String): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def default(path: String, needZCommandIndexes: Boolean): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def default(path: js.Array[PathCommand]): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
  inline def default(path: js.Array[PathCommand], needZCommandIndexes: Boolean): js.Array[(js.Array[Double | PathCommand]) | PathCommand] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[(js.Array[Double | PathCommand]) | PathCommand]]
}

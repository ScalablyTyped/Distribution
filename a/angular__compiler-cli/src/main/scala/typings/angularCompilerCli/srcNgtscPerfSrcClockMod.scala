package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPerfSrcClockMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf/src/clock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mark(): HrTime = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")().asInstanceOf[HrTime]
  
  inline def timeSinceInMicros(mark: HrTime): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeSinceInMicros")(mark.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type HrTime = js.Tuple2[Double, Double]
}

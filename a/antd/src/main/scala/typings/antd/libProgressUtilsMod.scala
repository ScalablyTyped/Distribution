package typings.antd

import typings.antd.anon.Success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressUtilsMod {
  
  @JSImport("antd/lib/progress/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSuccessPercent(param0: Success): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuccessPercent")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def validProgress(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")().asInstanceOf[Double]
  inline def validProgress(progress: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")(progress.asInstanceOf[js.Any]).asInstanceOf[Double]
}

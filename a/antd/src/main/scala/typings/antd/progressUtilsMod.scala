package typings.antd

import typings.antd.anon.Success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressUtilsMod {
  
  @JSImport("antd/lib/progress/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSuccessPercent(hasSuccessSuccessPercent: Success): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuccessPercent")(hasSuccessSuccessPercent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def validProgress(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")().asInstanceOf[Double]
  @scala.inline
  def validProgress(progress: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")(progress.asInstanceOf[js.Any]).asInstanceOf[Double]
}

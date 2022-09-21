package typings.antvUtil

import typings.antvUtil.antvUtilStrings.off
import typings.antvUtil.pathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roundPathMod {
  
  @JSImport("@antv/util/lib/path/process/round-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def roundPath(path: PathArray, round: Double): PathArray = (^.asInstanceOf[js.Dynamic].applyDynamic("roundPath")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[PathArray]
  
  inline def roundPath_off(path: PathArray, round: off): PathArray = (^.asInstanceOf[js.Dynamic].applyDynamic("roundPath")(path.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[PathArray]
}

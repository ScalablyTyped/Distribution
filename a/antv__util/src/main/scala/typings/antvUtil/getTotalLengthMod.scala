package typings.antvUtil

import typings.antvUtil.anon.PartialPathLengthFactoryO
import typings.antvUtil.pathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTotalLengthMod {
  
  @JSImport("@antv/util/lib/path/util/get-total-length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTotalLength(pathInput: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: String, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTotalLength(pathInput: PathArray, options: PartialPathLengthFactoryO): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTotalLength")(pathInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
}

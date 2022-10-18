package typings.antvUtil

import typings.antvUtil.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilRotateVectorMod {
  
  @JSImport("@antv/util/lib/path/util/rotate-vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rotateVector(x: Double, y: Double, rad: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateVector")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[X]
}

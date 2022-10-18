package typings.antvGBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateRegisterMod {
  
  @JSImport("@antv/g-base/lib/animate/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEasing(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEasing")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def registerEasing(`type`: String, easeFn: EaseFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEasing")(`type`.asInstanceOf[js.Any], easeFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EaseFn = js.Function1[/* t */ Double, Double]
}

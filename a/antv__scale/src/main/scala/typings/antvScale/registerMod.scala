package typings.antvScale

import typings.antvScale.typesMod.TickMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@antv/scale/lib/tick-method/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTickMethod(key: String): TickMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickMethod")(key.asInstanceOf[js.Any]).asInstanceOf[TickMethod]
  
  inline def registerTickMethod(key: String, method: TickMethod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTickMethod")(key.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

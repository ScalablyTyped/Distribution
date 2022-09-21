package typings.antvG2

import typings.antvG2.dependentsMod.IG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @JSImport("@antv/g2/lib/engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEngine(name: String): IG = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")(name.asInstanceOf[js.Any]).asInstanceOf[IG]
  
  inline def registerEngine(name: String, engine: IG): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEngine")(name.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

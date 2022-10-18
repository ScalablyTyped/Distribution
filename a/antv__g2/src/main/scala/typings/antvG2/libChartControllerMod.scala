package typings.antvG2

import typings.antvG2.libChartControllerBaseMod.ControllerCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerMod {
  
  @JSImport("@antv/g2/lib/chart/controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentController(name: String): ControllerCtor[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentController")(name.asInstanceOf[js.Any]).asInstanceOf[ControllerCtor[Any]]
  
  inline def getComponentControllerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentControllerNames")().asInstanceOf[js.Array[String]]
  
  inline def registerComponentController(name: String, plugin: ControllerCtor[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponentController")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterComponentController(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterComponentController")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

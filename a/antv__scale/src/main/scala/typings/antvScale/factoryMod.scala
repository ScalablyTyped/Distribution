package typings.antvScale

import org.scalablytyped.runtime.Instantiable1
import typings.antvScale.baseMod.default
import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/scale/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/scale/lib/factory", "Scale")
  @js.native
  abstract class Scale protected () extends default {
    def this(cfg: ScaleConfig) = this()
  }
  
  inline def getScale(key: String): ScaleConstructor[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(key.asInstanceOf[js.Any]).asInstanceOf[ScaleConstructor[default]]
  
  inline def registerScale(key: String, cls: ScaleConstructor[default]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerScale")(key.asInstanceOf[js.Any], cls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ScaleConstructor[T /* <: default */] = Instantiable1[/* cfg */ ScaleConfig, T]
}

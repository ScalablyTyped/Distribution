package typings.antvScale

import org.scalablytyped.runtime.Instantiable1
import typings.antvScale.baseMod.default
import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/scale/lib/factory", "Scale")
  @js.native
  abstract class Scale protected () extends default {
    def this(cfg: ScaleConfig) = this()
  }
  
  @JSImport("@antv/scale/lib/factory", "getScale")
  @js.native
  def getScale(key: String): ScaleConstructor[default] = js.native
  
  @JSImport("@antv/scale/lib/factory", "registerScale")
  @js.native
  def registerScale(key: String, cls: ScaleConstructor[default]): Unit = js.native
  
  type ScaleConstructor[T /* <: default */] = Instantiable1[/* cfg */ ScaleConfig, T]
}

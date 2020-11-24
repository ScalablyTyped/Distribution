package typings.antvScale

import org.scalablytyped.runtime.Instantiable1
import typings.antvScale.baseMod.default
import typings.antvScale.typesMod.ScaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
  def getScale(key: String): ScaleConstructor[default] = js.native
  
  def registerScale(key: String, cls: ScaleConstructor[default]): Unit = js.native
  
  @js.native
  abstract class Scale protected () extends default {
    def this(cfg: ScaleConfig) = this()
  }
  
  type ScaleConstructor[T /* <: default */] = Instantiable1[/* cfg */ ScaleConfig, T]
}

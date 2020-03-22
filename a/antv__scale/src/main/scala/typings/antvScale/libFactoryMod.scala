package typings.antvScale

import org.scalablytyped.runtime.Instantiable1
import typings.antvScale.libBaseMod.default
import typings.antvScale.libTypesMod.ScaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/factory", JSImport.Namespace)
@js.native
object libFactoryMod extends js.Object {
  @js.native
  abstract class Scale protected () extends default {
    def this(cfg: ScaleConfig) = this()
  }
  
  def getScale(key: String): ScaleConstructor[default] = js.native
  def registerScale(key: String, cls: ScaleConstructor[default]): Unit = js.native
  type ScaleConstructor[T /* <: default */] = Instantiable1[/* cfg */ ScaleConfig, T]
}


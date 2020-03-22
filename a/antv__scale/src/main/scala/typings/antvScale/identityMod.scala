package typings.antvScale

import typings.antvScale.typesMod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm/identity", JSImport.Namespace)
@js.native
object identityMod extends js.Object {
  @js.native
  trait Identity
    extends typings.antvScale.baseMod.default {
    @JSName("type")
    val type_Identity: ScaleType = js.native
    def invert(): Double = js.native
  }
  
  @js.native
  class default () extends Identity
  
}


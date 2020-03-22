package typings.antvScale

import typings.antvScale.libTypesMod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/identity", JSImport.Namespace)
@js.native
object libIdentityMod extends js.Object {
  @js.native
  trait Identity
    extends typings.antvScale.libBaseMod.default {
    @JSName("type")
    val type_Identity: ScaleType = js.native
    def invert(): Double = js.native
  }
  
  @js.native
  class default () extends Identity
  
}


package typings.antvScale

import typings.antvScale.typesMod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/identity", JSImport.Namespace)
@js.native
object identityMod extends js.Object {
  
  @js.native
  trait Identity
    extends typings.antvScale.baseMod.default {
    
    def invert(): Double = js.native
    
    @JSName("type")
    val type_Identity: ScaleType = js.native
  }
  
  @js.native
  class default () extends Identity
}

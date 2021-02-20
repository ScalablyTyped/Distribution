package typings.antvScale

import typings.antvScale.typesMod.ScaleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  @JSImport("@antv/scale/lib/identity", JSImport.Default)
  @js.native
  class default () extends Identity
  
  @js.native
  trait Identity
    extends typings.antvScale.baseMod.default {
    
    def invert(): Double = js.native
    
    @JSName("type")
    val type_Identity: ScaleType = js.native
  }
}

package typings.antvGLite

import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@antv/g-lite/dist/components", "RBushRoot")
  @js.native
  val RBushRoot: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/components", "Strategy")
  @js.native
  object Strategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.antvGLite.cullableMod.Strategy & Double] = js.native
    
    /* 0 */ val Standard: typings.antvGLite.cullableMod.Strategy.Standard & Double = js.native
  }
}

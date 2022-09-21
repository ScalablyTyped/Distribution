package typings.antvScale

import typings.antvScale.powMod.Pow
import typings.antvScale.typesMod.PowOptions
import typings.antvScale.typesMod.SqrtOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqrtMod {
  
  @JSImport("@antv/scale/lib/scales/sqrt", "Sqrt")
  @js.native
  open class Sqrt () extends Pow[SqrtOptions & PowOptions] {
    def this(options: SqrtOptions) = this()
    
    def update(options: SqrtOptions): Unit = js.native
  }
}

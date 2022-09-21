package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParseErrorLevel extends StObject
@JSImport("@angular/compiler", "ParseErrorLevel")
@js.native
object ParseErrorLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParseErrorLevel & Double] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with ParseErrorLevel
  /* 1 */ val ERROR: typings.angularCompiler.mod.ParseErrorLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait WARNING
    extends StObject
       with ParseErrorLevel
  /* 0 */ val WARNING: typings.angularCompiler.mod.ParseErrorLevel.WARNING & Double = js.native
}

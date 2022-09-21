package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TagContentType extends StObject
@JSImport("@angular/compiler", "TagContentType")
@js.native
object TagContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TagContentType & Double] = js.native
  
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT
    extends StObject
       with TagContentType
  /* 1 */ val ESCAPABLE_RAW_TEXT: typings.angularCompiler.mod.TagContentType.ESCAPABLE_RAW_TEXT & Double = js.native
  
  @js.native
  sealed trait PARSABLE_DATA
    extends StObject
       with TagContentType
  /* 2 */ val PARSABLE_DATA: typings.angularCompiler.mod.TagContentType.PARSABLE_DATA & Double = js.native
  
  @js.native
  sealed trait RAW_TEXT
    extends StObject
       with TagContentType
  /* 0 */ val RAW_TEXT: typings.angularCompiler.mod.TagContentType.RAW_TEXT & Double = js.native
}

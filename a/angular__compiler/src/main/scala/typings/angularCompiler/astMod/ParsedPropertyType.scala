package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParsedPropertyType extends StObject
@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedPropertyType")
@js.native
object ParsedPropertyType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParsedPropertyType & Double] = js.native
  
  @js.native
  sealed trait ANIMATION
    extends StObject
       with ParsedPropertyType
  /* 2 */ val ANIMATION: typings.angularCompiler.astMod.ParsedPropertyType.ANIMATION & Double = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ParsedPropertyType
  /* 0 */ val DEFAULT: typings.angularCompiler.astMod.ParsedPropertyType.DEFAULT & Double = js.native
  
  @js.native
  sealed trait LITERAL_ATTR
    extends StObject
       with ParsedPropertyType
  /* 1 */ val LITERAL_ATTR: typings.angularCompiler.astMod.ParsedPropertyType.LITERAL_ATTR & Double = js.native
}

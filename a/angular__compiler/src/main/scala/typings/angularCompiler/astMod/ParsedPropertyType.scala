package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParsedPropertyType extends StObject
@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedPropertyType")
@js.native
object ParsedPropertyType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParsedPropertyType with Double] = js.native
  
  @js.native
  sealed trait ANIMATION extends ParsedPropertyType
  /* 2 */ val ANIMATION: typings.angularCompiler.astMod.ParsedPropertyType.ANIMATION with Double = js.native
  
  @js.native
  sealed trait DEFAULT extends ParsedPropertyType
  /* 0 */ val DEFAULT: typings.angularCompiler.astMod.ParsedPropertyType.DEFAULT with Double = js.native
  
  @js.native
  sealed trait LITERAL_ATTR extends ParsedPropertyType
  /* 1 */ val LITERAL_ATTR: typings.angularCompiler.astMod.ParsedPropertyType.LITERAL_ATTR with Double = js.native
}

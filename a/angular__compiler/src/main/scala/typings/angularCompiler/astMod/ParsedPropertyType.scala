package typings.angularCompiler.astMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParsedPropertyType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedPropertyType")
@js.native
object ParsedPropertyType extends js.Object {
  @js.native
  sealed trait ANIMATION extends ParsedPropertyType
  
  @js.native
  sealed trait DEFAULT extends ParsedPropertyType
  
  @js.native
  sealed trait LITERAL_ATTR extends ParsedPropertyType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParsedPropertyType with Double] = js.native
  /* 2 */ @js.native
  object ANIMATION extends TopLevel[ANIMATION with Double]
  
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 1 */ @js.native
  object LITERAL_ATTR extends TopLevel[LITERAL_ATTR with Double]
  
}


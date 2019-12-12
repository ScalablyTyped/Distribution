package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Bool
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Dynamic
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Function
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Inferred
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Int
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.None
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.Number
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.BuiltinTypeName.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinTypeName extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends js.Object {
  @js.native
  sealed trait Bool extends BuiltinTypeName
  
  @js.native
  sealed trait Dynamic extends BuiltinTypeName
  
  @js.native
  sealed trait Function extends BuiltinTypeName
  
  @js.native
  sealed trait Inferred extends BuiltinTypeName
  
  @js.native
  sealed trait Int extends BuiltinTypeName
  
  @js.native
  sealed trait None extends BuiltinTypeName
  
  @js.native
  sealed trait Number extends BuiltinTypeName
  
  @js.native
  sealed trait String extends BuiltinTypeName
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName with Double] = js.native
  /* 1 */ @js.native
  object Bool extends TopLevel[Bool with Double]
  
  /* 0 */ @js.native
  object Dynamic extends TopLevel[Dynamic with Double]
  
  /* 5 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  /* 6 */ @js.native
  object Inferred extends TopLevel[Inferred with Double]
  
  /* 3 */ @js.native
  object Int extends TopLevel[Int with Double]
  
  /* 7 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 2 */ @js.native
  object String extends TopLevel[String with Double]
  
}


package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinTypeName extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName with Double] = js.native
  
  @js.native
  sealed trait Bool extends BuiltinTypeName
  /* 1 */ @js.native
  object Bool extends TopLevel[Bool with Double]
  
  @js.native
  sealed trait Dynamic extends BuiltinTypeName
  /* 0 */ @js.native
  object Dynamic extends TopLevel[Dynamic with Double]
  
  @js.native
  sealed trait Function extends BuiltinTypeName
  /* 5 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  @js.native
  sealed trait Inferred extends BuiltinTypeName
  /* 6 */ @js.native
  object Inferred extends TopLevel[Inferred with Double]
  
  @js.native
  sealed trait Int extends BuiltinTypeName
  /* 3 */ @js.native
  object Int extends TopLevel[Int with Double]
  
  @js.native
  sealed trait None extends BuiltinTypeName
  /* 7 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Number extends BuiltinTypeName
  /* 4 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait String extends BuiltinTypeName
  /* 2 */ @js.native
  object String extends TopLevel[String with Double]
}

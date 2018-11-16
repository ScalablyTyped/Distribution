package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltinTypeName extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends js.Object {
  @js.native
  sealed trait Bool
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait Dynamic
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait Function
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait Inferred
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait Int
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait None
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait Number
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  @js.native
  sealed trait String
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName
  
  /* 1 */ val Bool: Bool with scala.Double = js.native
  /* 0 */ val Dynamic: Dynamic with scala.Double = js.native
  /* 5 */ val Function: Function with scala.Double = js.native
  /* 6 */ val Inferred: Inferred with scala.Double = js.native
  /* 3 */ val Int: Int with scala.Double = js.native
  /* 7 */ val None: None with scala.Double = js.native
  /* 4 */ val Number: Number with scala.Double = js.native
  /* 2 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.BuiltinTypeName with scala.Double
  ] = js.native
}


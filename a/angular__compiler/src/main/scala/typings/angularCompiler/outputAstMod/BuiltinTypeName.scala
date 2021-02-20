package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinTypeName extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName with Double] = js.native
  
  @js.native
  sealed trait Bool extends BuiltinTypeName
  /* 1 */ val Bool: typings.angularCompiler.outputAstMod.BuiltinTypeName.Bool with Double = js.native
  
  @js.native
  sealed trait Dynamic extends BuiltinTypeName
  /* 0 */ val Dynamic: typings.angularCompiler.outputAstMod.BuiltinTypeName.Dynamic with Double = js.native
  
  @js.native
  sealed trait Function extends BuiltinTypeName
  /* 5 */ val Function: typings.angularCompiler.outputAstMod.BuiltinTypeName.Function with Double = js.native
  
  @js.native
  sealed trait Inferred extends BuiltinTypeName
  /* 6 */ val Inferred: typings.angularCompiler.outputAstMod.BuiltinTypeName.Inferred with Double = js.native
  
  @js.native
  sealed trait Int extends BuiltinTypeName
  /* 3 */ val Int: typings.angularCompiler.outputAstMod.BuiltinTypeName.Int with Double = js.native
  
  @js.native
  sealed trait None extends BuiltinTypeName
  /* 7 */ val None: typings.angularCompiler.outputAstMod.BuiltinTypeName.None with Double = js.native
  
  @js.native
  sealed trait Number extends BuiltinTypeName
  /* 4 */ val Number: typings.angularCompiler.outputAstMod.BuiltinTypeName.Number with Double = js.native
  
  @js.native
  sealed trait String extends BuiltinTypeName
  /* 2 */ val String: typings.angularCompiler.outputAstMod.BuiltinTypeName.String with Double = js.native
}

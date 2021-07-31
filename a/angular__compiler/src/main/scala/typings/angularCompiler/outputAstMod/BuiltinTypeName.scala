package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinTypeName extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName & Double] = js.native
  
  @js.native
  sealed trait Bool
    extends StObject
       with BuiltinTypeName
  /* 1 */ val Bool: typings.angularCompiler.outputAstMod.BuiltinTypeName.Bool & Double = js.native
  
  @js.native
  sealed trait Dynamic
    extends StObject
       with BuiltinTypeName
  /* 0 */ val Dynamic: typings.angularCompiler.outputAstMod.BuiltinTypeName.Dynamic & Double = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with BuiltinTypeName
  /* 5 */ val Function: typings.angularCompiler.outputAstMod.BuiltinTypeName.Function & Double = js.native
  
  @js.native
  sealed trait Inferred
    extends StObject
       with BuiltinTypeName
  /* 6 */ val Inferred: typings.angularCompiler.outputAstMod.BuiltinTypeName.Inferred & Double = js.native
  
  @js.native
  sealed trait Int
    extends StObject
       with BuiltinTypeName
  /* 3 */ val Int: typings.angularCompiler.outputAstMod.BuiltinTypeName.Int & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with BuiltinTypeName
  /* 7 */ val None: typings.angularCompiler.outputAstMod.BuiltinTypeName.None & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with BuiltinTypeName
  /* 4 */ val Number: typings.angularCompiler.outputAstMod.BuiltinTypeName.Number & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with BuiltinTypeName
  /* 2 */ val String: typings.angularCompiler.outputAstMod.BuiltinTypeName.String & Double = js.native
}

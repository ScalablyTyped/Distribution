package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuiltinTypeName extends StObject
@JSImport("@angular/compiler", "BuiltinTypeName")
@js.native
object BuiltinTypeName extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuiltinTypeName & Double] = js.native
  
  @js.native
  sealed trait Bool
    extends StObject
       with BuiltinTypeName
  /* 1 */ val Bool: typings.angularCompiler.mod.BuiltinTypeName.Bool & Double = js.native
  
  @js.native
  sealed trait Dynamic
    extends StObject
       with BuiltinTypeName
  /* 0 */ val Dynamic: typings.angularCompiler.mod.BuiltinTypeName.Dynamic & Double = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with BuiltinTypeName
  /* 5 */ val Function: typings.angularCompiler.mod.BuiltinTypeName.Function & Double = js.native
  
  @js.native
  sealed trait Inferred
    extends StObject
       with BuiltinTypeName
  /* 6 */ val Inferred: typings.angularCompiler.mod.BuiltinTypeName.Inferred & Double = js.native
  
  @js.native
  sealed trait Int
    extends StObject
       with BuiltinTypeName
  /* 3 */ val Int: typings.angularCompiler.mod.BuiltinTypeName.Int & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with BuiltinTypeName
  /* 7 */ val None: typings.angularCompiler.mod.BuiltinTypeName.None & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with BuiltinTypeName
  /* 4 */ val Number: typings.angularCompiler.mod.BuiltinTypeName.Number & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with BuiltinTypeName
  /* 2 */ val String: typings.angularCompiler.mod.BuiltinTypeName.String & Double = js.native
}

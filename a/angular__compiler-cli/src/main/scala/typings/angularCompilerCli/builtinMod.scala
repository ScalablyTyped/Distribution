package typings.angularCompilerCli

import typings.angularCompilerCli.resultMod.KnownFn
import typings.angularCompilerCli.resultMod.ResolvedValueArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtinMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/builtin", "ArrayConcatBuiltinFn")
  @js.native
  open class ArrayConcatBuiltinFn protected () extends KnownFn {
    def this(lhs: ResolvedValueArray) = this()
    
    /* private */ var lhs: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/builtin", "ArraySliceBuiltinFn")
  @js.native
  open class ArraySliceBuiltinFn protected () extends KnownFn {
    def this(lhs: ResolvedValueArray) = this()
    
    /* private */ var lhs: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/builtin", "ObjectAssignBuiltinFn")
  @js.native
  open class ObjectAssignBuiltinFn () extends KnownFn
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/builtin", "StringConcatBuiltinFn")
  @js.native
  open class StringConcatBuiltinFn protected () extends KnownFn {
    def this(lhs: String) = this()
    
    /* private */ var lhs: Any = js.native
  }
}

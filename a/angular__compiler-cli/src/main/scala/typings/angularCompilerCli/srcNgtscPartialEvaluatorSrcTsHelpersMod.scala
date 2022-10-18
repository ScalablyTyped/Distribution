package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcBuiltinMod.ObjectAssignBuiltinFn
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.KnownFn
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValueArray
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcTsHelpersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "AssignHelperFn")
  @js.native
  open class AssignHelperFn () extends ObjectAssignBuiltinFn
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "ReadHelperFn")
  @js.native
  open class ReadHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "SpreadArrayHelperFn")
  @js.native
  open class SpreadArrayHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "SpreadHelperFn")
  @js.native
  open class SpreadHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValueArray = js.native
  }
}

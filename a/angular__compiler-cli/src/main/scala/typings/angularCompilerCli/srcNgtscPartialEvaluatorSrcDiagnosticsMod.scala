package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.typescript.mod.DiagnosticRelatedInformation
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def describeResolvedType(value: ResolvedValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def describeResolvedType(value: ResolvedValue, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def traceDynamicValue(node: Node, value: DynamicValue[Any]): js.Array[DiagnosticRelatedInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("traceDynamicValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticRelatedInformation]]
}

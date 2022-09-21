package typings.angularCompilerCli

import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractSchemas(rawExpr: Expression, evaluator: PartialEvaluator, context: String): js.Array[SchemaMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractSchemas")(rawExpr.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaMetadata]]
}

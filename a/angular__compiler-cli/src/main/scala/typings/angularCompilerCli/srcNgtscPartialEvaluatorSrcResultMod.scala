package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue
import typings.std.Array
import typings.std.Map
import typings.typescript.mod.CallExpression
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcResultMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "EnumValue")
  @js.native
  open class EnumValue protected () extends StObject {
    def this(enumRef: Reference[Declaration], name: String, resolved: ResolvedValue) = this()
    
    val enumRef: Reference[Declaration] = js.native
    
    val name: String = js.native
    
    val resolved: ResolvedValue = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "KnownFn")
  @js.native
  open class KnownFn () extends StObject {
    
    def evaluate(node: CallExpression, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "ResolvedModule")
  @js.native
  open class ResolvedModule protected () extends StObject {
    def this(
      exports: Map[
            String, 
            typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
          ],
      evaluate: js.Function1[
            /* decl */ typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration], 
            ResolvedValue
          ]
    ) = this()
    
    /* private */ var evaluate: Any = js.native
    
    /* private */ var exports: Any = js.native
    
    def getExport(name: String): ResolvedValue = js.native
    
    def getExports(): ResolvedValueMap = js.native
  }
  
  type ResolvedValue = js.UndefOr[
    Double | Boolean | String | Null | Reference[Node] | EnumValue | ResolvedValueArray | ResolvedValueMap | ResolvedModule | KnownFn | SyntheticValue[Any] | DynamicValue[Any]
  ]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ResolvedValueArray = std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue>
  }}}
  to avoid circular code involving: 
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interpreter.Scope
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValueArray
  */
  @js.native
  trait ResolvedValueArray
    extends StObject
       with Array[ResolvedValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ResolvedValueMap = std.Map<string, @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue>
  }}}
  to avoid circular code involving: 
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interpreter.Scope
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValueArray
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValueMap
  */
  @js.native
  trait ResolvedValueMap
    extends StObject
       with Map[String, ResolvedValue]
}

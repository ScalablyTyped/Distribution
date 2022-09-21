package typings.angularCompilerCli

import typings.angularCompilerCli.dynamicMod.DynamicValue
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.syntheticMod.SyntheticValue
import typings.std.Array
import typings.std.Map
import typings.typescript.mod.CallExpression
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "EnumValue")
  @js.native
  open class EnumValue protected ()
    extends StObject
       with _ResolvedValue {
    def this(enumRef: Reference[Declaration], name: String, resolved: ResolvedValue) = this()
    
    val enumRef: Reference[Declaration] = js.native
    
    val name: String = js.native
    
    val resolved: ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "KnownFn")
  @js.native
  abstract class KnownFn ()
    extends StObject
       with _ResolvedValue {
    
    def evaluate(node: CallExpression, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "ResolvedModule")
  @js.native
  open class ResolvedModule protected ()
    extends StObject
       with _ResolvedValue {
    def this(
      exports: Map[String, typings.angularCompilerCli.srcHostMod.Declaration[Declaration]],
      evaluate: js.Function1[
            /* decl */ typings.angularCompilerCli.srcHostMod.Declaration[Declaration], 
            ResolvedValue
          ]
    ) = this()
    
    /* private */ var evaluate: Any = js.native
    
    /* private */ var exports: Any = js.native
    
    def getExport(name: String): ResolvedValue = js.native
    
    def getExports(): ResolvedValueMap = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - scala.Boolean
    - java.lang.String
    - scala.Null
    - scala.Unit
    - typings.angularCompilerCli.ngtscImportsMod.Reference[typings.typescript.mod.Node]
    - typings.angularCompilerCli.resultMod.EnumValue
    - typings.angularCompilerCli.resultMod.ResolvedValueArray
    - typings.angularCompilerCli.resultMod.ResolvedValueMap
    - typings.angularCompilerCli.resultMod.ResolvedModule
    - typings.angularCompilerCli.resultMod.KnownFn
    - typings.angularCompilerCli.syntheticMod.SyntheticValue[scala.Any]
    - typings.angularCompilerCli.dynamicMod.DynamicValue[scala.Any]
  */
  type ResolvedValue = js.UndefOr[
    _ResolvedValue | Reference[Node] | SyntheticValue[Any] | DynamicValue[Any] | Double | Boolean | String | Null
  ]
  
  @js.native
  trait ResolvedValueArray
    extends StObject
       with Array[ResolvedValue]
       with _ResolvedValue
  
  @js.native
  trait ResolvedValueMap
    extends StObject
       with Map[String, ResolvedValue]
       with _ResolvedValue
  
  trait _ResolvedValue extends StObject
}

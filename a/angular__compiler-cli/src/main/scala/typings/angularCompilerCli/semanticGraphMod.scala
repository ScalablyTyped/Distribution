package typings.angularCompilerCli

import typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticReference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.typeParametersMod.SemanticTypeParameter
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semanticGraphMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph", "SemanticDepGraph")
  @js.native
  open class SemanticDepGraph ()
    extends typings.angularCompilerCli.graphMod.SemanticDepGraph
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph", "SemanticDepGraphUpdater")
  @js.native
  open class SemanticDepGraphUpdater ()
    extends typings.angularCompilerCli.graphMod.SemanticDepGraphUpdater {
    def this(/**
      * The semantic dependency graph of the most recently succeeded compilation, or null if this
      * is the initial build.
      */
    priorGraph: typings.angularCompilerCli.graphMod.SemanticDepGraph) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph", "SemanticSymbol")
  @js.native
  abstract class SemanticSymbol protected ()
    extends typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticSymbol {
    def this(/**
      * The declaration for this symbol.
      */
    decl: ClassDeclaration[DeclarationNode]) = this()
  }
  
  inline def areTypeParametersEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")().asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: js.Array[SemanticTypeParameter]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: js.Array[SemanticTypeParameter], previous: js.Array[SemanticTypeParameter]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def areTypeParametersEqual(current: Null, previous: js.Array[SemanticTypeParameter]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areTypeParametersEqual")(current.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extractSemanticTypeParameters(node: ClassDeclaration[DeclarationNode]): js.Array[SemanticTypeParameter] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSemanticTypeParameters")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[SemanticTypeParameter] | Null]
  
  inline def isArrayEqual[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")().asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: js.Array[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: js.Array[T], b: js.Array[T], equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: js.Array[T], b: Null, equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: Null, b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: Null, b: js.Array[T], equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isArrayEqual[T](a: Null, b: Null, equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArrayEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReferenceEqual(a: SemanticReference, b: SemanticReference): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSetEqual[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")().asInstanceOf[Boolean]
  inline def isSetEqual[T](a: Null, b: Null, equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: Null, b: ReadonlySet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: Null, b: ReadonlySet[T], equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: ReadonlySet[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: ReadonlySet[T], b: Null, equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSetEqual[T](a: ReadonlySet[T], b: ReadonlySet[T], equalityTester: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSetEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], equalityTester.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSymbolEqual(
    a: typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticSymbol,
    b: typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

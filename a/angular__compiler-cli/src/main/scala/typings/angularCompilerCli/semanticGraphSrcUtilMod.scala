package typings.angularCompilerCli

import typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticReference
import typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticSymbol
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semanticGraphSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def isSymbolEqual(a: SemanticSymbol, b: SemanticSymbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def referenceEquality[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("referenceEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcAstUtilsMod {
  
  @JSImport("@angular/compiler-cli/linker/src/ast/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert[T, K /* <: T */](node: T, predicate: js.Function1[/* node */ T, /* is K */ Boolean], expected: String): /* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(K))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts node is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(K))),IArray())*/ Boolean]
}

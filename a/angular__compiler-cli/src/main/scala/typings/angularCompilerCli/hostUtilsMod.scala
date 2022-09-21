package typings.angularCompilerCli

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stripParentheses(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("stripParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
}

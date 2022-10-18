package typings.angularCore

import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompiler.mod.TmplAstRecursiveVisitor
import typings.angularCore.anon.TypeofimportedCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTemplateAstVisitorMod {
  
  @JSImport("@angular/core/schematics/utils/template_ast_visitor", "TemplateAstVisitor")
  @js.native
  open class TemplateAstVisitor protected () extends TmplAstRecursiveVisitor {
    /**
      * Creates a new Render3 Template AST visitor using an instance of the `@angular/compiler`
      * package. Passing in the compiler is required due to the need to dynamically import the
      * ESM `@angular/compiler` into a CommonJS schematic.
      *
      * @param compilerModule The compiler instance that should be used within the visitor.
      */
    def this(compilerModule: TypeofimportedCompiler) = this()
    
    /* protected */ val compilerModule: TypeofimportedCompiler = js.native
    
    /**
      * Visits all the provided nodes in order using this Visitor's visit methods.
      * This is a simplified variant of the `visitAll` function found inside of (but not
      * exported from) the `@angular/compiler` that does not support returning a value
      * since the migrations do not directly transform the nodes.
      *
      * @param nodes An iterable of nodes to visit using this visitor.
      */
    def visitAll(nodes: js.Iterable[TmplAstNode]): Unit = js.native
  }
}

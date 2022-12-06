package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTemplateAstVisitorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstRecursiveVisitor * / any */ @JSImport("@angular/core/schematics/utils/template_ast_visitor", "TemplateAstVisitor")
  @js.native
  open class TemplateAstVisitor protected () extends StObject {
    /**
      * Creates a new Render3 Template AST visitor using an instance of the `@angular/compiler`
      * package. Passing in the compiler is required due to the need to dynamically import the
      * ESM `@angular/compiler` into a CommonJS schematic.
      *
      * @param compilerModule The compiler instance that should be used within the visitor.
      */
    def this(compilerModule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_compiler */ Any) = this()
    
    /* protected */ val compilerModule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_compiler */ Any = js.native
    
    /**
      * Visits all the provided nodes in order using this Visitor's visit methods.
      * This is a simplified variant of the `visitAll` function found inside of (but not
      * exported from) the `@angular/compiler` that does not support returning a value
      * since the migrations do not directly transform the nodes.
      *
      * @param nodes An iterable of nodes to visit using this visitor.
      */
    def visitAll(
      nodes: js.Iterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstNode */ Any
        ]
    ): Unit = js.native
    
    def visitBoundAttribute(
      attribute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstBoundAttribute */ Any
    ): Unit = js.native
    
    def visitBoundEvent(
      attribute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstBoundEvent */ Any
    ): Unit = js.native
    
    def visitBoundText(
      text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstBoundText */ Any
    ): Unit = js.native
    
    def visitContent(
      content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstContent */ Any
    ): Unit = js.native
    
    def visitElement(
      element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstElement */ Any
    ): Unit = js.native
    
    def visitIcu(
      icu: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstIcu */ Any
    ): Unit = js.native
    
    def visitReference(
      reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstReference */ Any
    ): Unit = js.native
    
    def visitTemplate(
      template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstTemplate */ Any
    ): Unit = js.native
    
    def visitText(
      text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstText */ Any
    ): Unit = js.native
    
    def visitTextAttribute(
      attribute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstTextAttribute */ Any
    ): Unit = js.native
    
    def visitVariable(
      variable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstVariable */ Any
    ): Unit = js.native
  }
}

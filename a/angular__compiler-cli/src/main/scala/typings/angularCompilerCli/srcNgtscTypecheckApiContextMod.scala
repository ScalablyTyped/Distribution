package typings.angularCompilerCli

import typings.angularCompiler.mod.ParseError
import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompiler.mod.R3TargetBinder
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateSourceMapping
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCheckableDirectiveMeta
import typings.std.Map
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiContextMod {
  
  trait ProgramTypeCheckAdapter extends StObject {
    
    def typeCheck(sf: SourceFile, ctx: TypeCheckContext): Unit
  }
  object ProgramTypeCheckAdapter {
    
    inline def apply(typeCheck: (SourceFile, TypeCheckContext) => Unit): ProgramTypeCheckAdapter = {
      val __obj = js.Dynamic.literal(typeCheck = js.Any.fromFunction2(typeCheck))
      __obj.asInstanceOf[ProgramTypeCheckAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgramTypeCheckAdapter] (val x: Self) extends AnyVal {
      
      inline def setTypeCheck(value: (SourceFile, TypeCheckContext) => Unit): Self = StObject.set(x, "typeCheck", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TypeCheckContext extends StObject {
    
    /**
      * Register a template to potentially be type-checked.
      *
      * Templates registered via `addTemplate` are available for checking, but might be skipped if
      * checking of that component is not required. This can happen for a few reasons, including if
      * the component was previously checked and the prior results are still valid.
      *
      * @param ref a `Reference` to the component class which yielded this template.
      * @param binder an `R3TargetBinder` which encapsulates the scope of this template, including all
      * available directives.
      * @param template the original template AST of this component.
      * @param pipes a `Map` of pipes available within the scope of this template.
      * @param schemas any schemas which apply to this template.
      * @param sourceMapping a `TemplateSourceMapping` instance which describes the origin of the
      * template text described by the AST.
      * @param file the `ParseSourceFile` associated with the template.
      * @param parseErrors the `ParseError`'s associated with the template.
      * @param isStandalone a boolean indicating whether the component is standalone.
      */
    def addTemplate(
      ref: Reference[ClassDeclarationClassDecl],
      binder: R3TargetBinder[TypeCheckableDirectiveMeta],
      template: js.Array[TmplAstNode],
      pipes: Map[String, Reference[ClassDeclarationClassDecl]],
      schemas: js.Array[SchemaMetadata],
      sourceMapping: TemplateSourceMapping,
      file: ParseSourceFile,
      parseErrors: js.Array[ParseError],
      isStandalone: Boolean
    ): Unit = js.native
    def addTemplate(
      ref: Reference[ClassDeclarationClassDecl],
      binder: R3TargetBinder[TypeCheckableDirectiveMeta],
      template: js.Array[TmplAstNode],
      pipes: Map[String, Reference[ClassDeclarationClassDecl]],
      schemas: js.Array[SchemaMetadata],
      sourceMapping: TemplateSourceMapping,
      file: ParseSourceFile,
      parseErrors: Null,
      isStandalone: Boolean
    ): Unit = js.native
  }
}

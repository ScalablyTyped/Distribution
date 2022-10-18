package typings.angularCompilerCli

import typings.angularCompiler.mod.BindingPipe
import typings.angularCompiler.mod.PropertyWrite
import typings.angularCompiler.mod.TmplAstBoundAttribute
import typings.angularCompiler.mod.TmplAstBoundEvent
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TemplateSourceResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcOobMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/oob", "OutOfBandDiagnosticRecorderImpl")
  @js.native
  open class OutOfBandDiagnosticRecorderImpl protected ()
    extends StObject
       with OutOfBandDiagnosticRecorder {
    def this(resolver: TemplateSourceResolver) = this()
    
    /* private */ var _diagnostics: Any = js.native
    
    @JSName("diagnostics")
    def diagnostics_MOutOfBandDiagnosticRecorderImpl: js.Array[TemplateDiagnostic] = js.native
    
    /**
      * Tracks which `BindingPipe` nodes have already been recorded as invalid, so only one diagnostic
      * is ever produced per node.
      */
    /* private */ var recordedPipes: Any = js.native
    
    /* private */ var resolver: Any = js.native
  }
  
  @js.native
  trait OutOfBandDiagnosticRecorder extends StObject {
    
    val diagnostics: js.Array[TemplateDiagnostic] = js.native
    
    /**
      * Reports a duplicate declaration of a template variable.
      *
      * @param templateId the template type-checking ID of the template which contains the duplicate
      * declaration.
      * @param variable the `TmplAstVariable` which duplicates a previously declared variable.
      * @param firstDecl the first variable declaration which uses the same name as `variable`.
      */
    def duplicateTemplateVar(templateId: TemplateId, variable: TmplAstVariable, firstDecl: TmplAstVariable): Unit = js.native
    
    def illegalAssignmentToTemplateVar(templateId: TemplateId, assignment: PropertyWrite, target: TmplAstVariable): Unit = js.native
    
    /**
      * Reports usage of a `| pipe` expression in the template for which the named pipe could not be
      * found.
      *
      * @param templateId the template type-checking ID of the template which contains the unknown
      * pipe.
      * @param ast the `BindingPipe` invocation of the pipe which could not be found.
      */
    def missingPipe(templateId: TemplateId, ast: BindingPipe): Unit = js.native
    
    /**
      * Reports a `#ref="target"` expression in the template for which a target directive could not be
      * found.
      *
      * @param templateId the template type-checking ID of the template which contains the broken
      * reference.
      * @param ref the `TmplAstReference` which could not be matched to a directive.
      */
    def missingReferenceTarget(templateId: TemplateId, ref: TmplAstReference): Unit = js.native
    
    def requiresInlineTcb(templateId: TemplateId, node: ClassDeclaration[DeclarationNode]): Unit = js.native
    
    def requiresInlineTypeConstructors(
      templateId: TemplateId,
      node: ClassDeclaration[DeclarationNode],
      directives: js.Array[ClassDeclaration[DeclarationNode]]
    ): Unit = js.native
    
    def splitTwoWayBinding(
      templateId: TemplateId,
      input: TmplAstBoundAttribute,
      output: TmplAstBoundEvent,
      inputConsumer: ClassDeclaration[DeclarationNode],
      outputConsumer: TmplAstElement
    ): Unit = js.native
    /**
      * Reports a split two way binding error message.
      */
    def splitTwoWayBinding(
      templateId: TemplateId,
      input: TmplAstBoundAttribute,
      output: TmplAstBoundEvent,
      inputConsumer: ClassDeclaration[DeclarationNode],
      outputConsumer: ClassDeclaration[DeclarationNode]
    ): Unit = js.native
    
    /**
      * Report a warning when structural directives support context guards, but the current
      * type-checking configuration prohibits their usage.
      */
    def suboptimalTypeInference(templateId: TemplateId, variables: js.Array[TmplAstVariable]): Unit = js.native
  }
}

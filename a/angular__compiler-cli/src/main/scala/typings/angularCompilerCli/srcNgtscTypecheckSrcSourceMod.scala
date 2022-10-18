package typings.angularCompilerCli

import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateSourceMapping
import typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TemplateSourceResolver
import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcSourceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/source", "TemplateSource")
  @js.native
  open class TemplateSource protected () extends StObject {
    def this(mapping: TemplateSourceMapping, file: ParseSourceFile) = this()
    
    /* private */ var acquireLineStarts: Any = js.native
    
    /* private */ var file: Any = js.native
    
    /* private */ var lineStarts: Any = js.native
    
    val mapping: TemplateSourceMapping = js.native
    
    /* private */ var toParseLocation: Any = js.native
    
    def toParseSourceSpan(start: Double, end: Double): ParseSourceSpan = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/source", "TemplateSourceManager")
  @js.native
  open class TemplateSourceManager ()
    extends StObject
       with TemplateSourceResolver {
    
    def captureSource(node: ClassDeclaration, mapping: TemplateSourceMapping, file: ParseSourceFile): TemplateId = js.native
    
    /**
      * For the given template id, retrieve the original source mapping which describes how the offsets
      * in the template should be interpreted.
      */
    /* CompleteClass */
    override def getSourceMapping(id: TemplateId): TemplateSourceMapping = js.native
    
    /* CompleteClass */
    override def getTemplateId(node: ClassDeclaration): TemplateId = js.native
    
    /**
      * This map keeps track of all template sources that have been type-checked by the id that is
      * attached to a TCB's function declaration as leading trivia. This enables translation of
      * diagnostics produced for TCB code to their source location in the template.
      */
    /* private */ var templateSources: Any = js.native
    
    /**
      * Convert an absolute source span associated with the given template id into a full
      * `ParseSourceSpan`. The returned parse span has line and column numbers in addition to only
      * absolute offsets and gives access to the original template source.
      */
    /* CompleteClass */
    override def toParseSourceSpan(id: TemplateId, span: AbsoluteSourceSpan): ParseSourceSpan | Null = js.native
  }
}

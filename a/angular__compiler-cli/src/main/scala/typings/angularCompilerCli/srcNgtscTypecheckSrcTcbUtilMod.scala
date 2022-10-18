package typings.angularCompilerCli

import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.FullTemplateMapping
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.SourceLocation
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateSourceMapping
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTcbUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/tcb_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TcbInliningRequirement extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/tcb_util", "TcbInliningRequirement")
  @js.native
  object TcbInliningRequirement extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TcbInliningRequirement & Double] = js.native
    
    /**
      * There is no way to type check this component without inlining.
      */
    @js.native
    sealed trait MustInline
      extends StObject
         with TcbInliningRequirement
    /* 0 */ val MustInline: typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TcbInliningRequirement.MustInline & Double = js.native
    
    /**
      * There is no requirement for this component's TCB to be inlined.
      */
    @js.native
    sealed trait None
      extends StObject
         with TcbInliningRequirement
    /* 2 */ val None: typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TcbInliningRequirement.None & Double = js.native
    
    /**
      * Inlining should be used due to the component's generic bounds, but a non-inlining fallback
      * method can be used if that's not possible.
      */
    @js.native
    sealed trait ShouldInlineForGenericBounds
      extends StObject
         with TcbInliningRequirement
    /* 1 */ val ShouldInlineForGenericBounds: typings.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.TcbInliningRequirement.ShouldInlineForGenericBounds & Double = js.native
  }
  
  inline def checkIfGenericTypeBoundsCanBeEmitted(node: ClassDeclarationClassDecl, reflector: ReflectionHost, env: ReferenceEmitEnvironment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfGenericTypeBoundsCanBeEmitted")(node.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findSourceLocation(node: Node, sourceFile: SourceFile, isDiagnosticsRequest: Boolean): SourceLocation | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceLocation")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], isDiagnosticsRequest.asInstanceOf[js.Any])).asInstanceOf[SourceLocation | Null]
  
  inline def findTypeCheckBlock(file: SourceFile, id: TemplateId, isDiagnosticRequest: Boolean): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findTypeCheckBlock")(file.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isDiagnosticRequest.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def getTemplateMapping(
    shimSf: SourceFile,
    position: Double,
    resolver: TemplateSourceResolver,
    isDiagnosticRequest: Boolean
  ): FullTemplateMapping | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateMapping")(shimSf.asInstanceOf[js.Any], position.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], isDiagnosticRequest.asInstanceOf[js.Any])).asInstanceOf[FullTemplateMapping | Null]
  
  inline def requiresInlineTypeCheckBlock(
    ref: Reference[ClassDeclarationClassDecl],
    env: ReferenceEmitEnvironment,
    usedPipes: js.Array[Reference[ClassDeclarationClassDecl]],
    reflector: ReflectionHost
  ): TcbInliningRequirement = (^.asInstanceOf[js.Dynamic].applyDynamic("requiresInlineTypeCheckBlock")(ref.asInstanceOf[js.Any], env.asInstanceOf[js.Any], usedPipes.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[TcbInliningRequirement]
  
  trait ReferenceEmitEnvironment extends StObject {
    
    def canReferenceType(ref: Reference[Node]): Boolean
  }
  object ReferenceEmitEnvironment {
    
    inline def apply(canReferenceType: Reference[Node] => Boolean): ReferenceEmitEnvironment = {
      val __obj = js.Dynamic.literal(canReferenceType = js.Any.fromFunction1(canReferenceType))
      __obj.asInstanceOf[ReferenceEmitEnvironment]
    }
    
    extension [Self <: ReferenceEmitEnvironment](x: Self) {
      
      inline def setCanReferenceType(value: Reference[Node] => Boolean): Self = StObject.set(x, "canReferenceType", js.Any.fromFunction1(value))
    }
  }
  
  trait TemplateSourceResolver extends StObject {
    
    /**
      * For the given template id, retrieve the original source mapping which describes how the offsets
      * in the template should be interpreted.
      */
    def getSourceMapping(id: TemplateId): TemplateSourceMapping
    
    def getTemplateId(node: ClassDeclaration): TemplateId
    
    /**
      * Convert an absolute source span associated with the given template id into a full
      * `ParseSourceSpan`. The returned parse span has line and column numbers in addition to only
      * absolute offsets and gives access to the original template source.
      */
    def toParseSourceSpan(id: TemplateId, span: AbsoluteSourceSpan): ParseSourceSpan | Null
  }
  object TemplateSourceResolver {
    
    inline def apply(
      getSourceMapping: TemplateId => TemplateSourceMapping,
      getTemplateId: ClassDeclaration => TemplateId,
      toParseSourceSpan: (TemplateId, AbsoluteSourceSpan) => ParseSourceSpan | Null
    ): TemplateSourceResolver = {
      val __obj = js.Dynamic.literal(getSourceMapping = js.Any.fromFunction1(getSourceMapping), getTemplateId = js.Any.fromFunction1(getTemplateId), toParseSourceSpan = js.Any.fromFunction2(toParseSourceSpan))
      __obj.asInstanceOf[TemplateSourceResolver]
    }
    
    extension [Self <: TemplateSourceResolver](x: Self) {
      
      inline def setGetSourceMapping(value: TemplateId => TemplateSourceMapping): Self = StObject.set(x, "getSourceMapping", js.Any.fromFunction1(value))
      
      inline def setGetTemplateId(value: ClassDeclaration => TemplateId): Self = StObject.set(x, "getTemplateId", js.Any.fromFunction1(value))
      
      inline def setToParseSourceSpan(value: (TemplateId, AbsoluteSourceSpan) => ParseSourceSpan | Null): Self = StObject.set(x, "toParseSourceSpan", js.Any.fromFunction2(value))
    }
  }
}

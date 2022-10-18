package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.component
import typings.angularCompilerCli.angularCompilerCliStrings.directive
import typings.angularCompilerCli.angularCompilerCliStrings.pipe
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasingHost
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticWithLocation
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "ComponentScopeKind")
  @js.native
  object ComponentScopeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind & Double] = js.native
    
    /* 0 */ val NgModule: typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.NgModule & Double = js.native
    
    /* 1 */ val Standalone: typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.Standalone & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "CompoundComponentScopeReader")
  @js.native
  open class CompoundComponentScopeReader protected ()
    extends typings.angularCompilerCli.srcNgtscScopeSrcComponentScopeMod.CompoundComponentScopeReader {
    def this(readers: js.Array[ComponentScopeReader]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "LocalModuleScopeRegistry")
  @js.native
  open class LocalModuleScopeRegistry protected ()
    extends typings.angularCompilerCli.srcNgtscScopeSrcLocalMod.LocalModuleScopeRegistry {
    def this(
      localReader: MetadataReader,
      fullReader: MetadataReader,
      dependencyScopeReader: DtsModuleScopeResolver,
      refEmitter: ReferenceEmitter
    ) = this()
    def this(
      localReader: MetadataReader,
      fullReader: MetadataReader,
      dependencyScopeReader: DtsModuleScopeResolver,
      refEmitter: ReferenceEmitter,
      aliasingHost: AliasingHost
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "MetadataDtsModuleScopeResolver")
  @js.native
  open class MetadataDtsModuleScopeResolver protected ()
    extends typings.angularCompilerCli.srcNgtscScopeSrcDependencyMod.MetadataDtsModuleScopeResolver {
    /**
      * @param dtsMetaReader a `MetadataReader` which can read metadata from `.d.ts` files.
      */
    def this(dtsMetaReader: MetadataReader) = this()
    def this(dtsMetaReader: MetadataReader, aliasingHost: AliasingHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "TypeCheckScopeRegistry")
  @js.native
  open class TypeCheckScopeRegistry protected ()
    extends typings.angularCompilerCli.srcNgtscScopeSrcTypecheckMod.TypeCheckScopeRegistry {
    def this(scopeReader: ComponentScopeReader, metaReader: MetadataReader) = this()
  }
  
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclaration[DeclarationNode]],
    rawExpr: Null,
    kind: component | directive | pipe
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclaration[DeclarationNode]],
    rawExpr: Expression,
    kind: component | directive | pipe
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  inline def makeUnknownComponentImportDiagnostic(ref: Reference[ClassDeclaration[DeclarationNode]], rawExpr: Expression): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUnknownComponentImportDiagnostic")(ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
}

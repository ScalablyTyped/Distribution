package typings.angularCompilerCli

import typings.angularCompilerCli.aliasMod.AliasingHost
import typings.angularCompilerCli.angularCompilerCliStrings.component
import typings.angularCompilerCli.angularCompilerCliStrings.directive
import typings.angularCompilerCli.angularCompilerCliStrings.pipe
import typings.angularCompilerCli.dependencyMod.DtsModuleScopeResolver
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticWithLocation
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "ComponentScopeKind")
  @js.native
  object ComponentScopeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeKind & Double] = js.native
    
    /* 0 */ val NgModule: typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeKind.NgModule & Double = js.native
    
    /* 1 */ val Standalone: typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeKind.Standalone & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "CompoundComponentScopeReader")
  @js.native
  open class CompoundComponentScopeReader protected ()
    extends typings.angularCompilerCli.componentScopeMod.CompoundComponentScopeReader {
    def this(readers: js.Array[ComponentScopeReader]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "LocalModuleScopeRegistry")
  @js.native
  open class LocalModuleScopeRegistry protected ()
    extends typings.angularCompilerCli.localMod.LocalModuleScopeRegistry {
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
    extends typings.angularCompilerCli.dependencyMod.MetadataDtsModuleScopeResolver {
    /**
      * @param dtsMetaReader a `MetadataReader` which can read metadata from `.d.ts` files.
      */
    def this(dtsMetaReader: MetadataReader) = this()
    def this(dtsMetaReader: MetadataReader, aliasingHost: AliasingHost) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope", "TypeCheckScopeRegistry")
  @js.native
  open class TypeCheckScopeRegistry protected ()
    extends typings.angularCompilerCli.typecheckMod.TypeCheckScopeRegistry {
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

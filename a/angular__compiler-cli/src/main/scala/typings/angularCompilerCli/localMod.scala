package typings.angularCompilerCli

import typings.angularCompilerCli.aliasMod.AliasingHost
import typings.angularCompilerCli.dependencyMod.DtsModuleScopeResolver
import typings.angularCompilerCli.metadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.metadataSrcApiMod.MetadataRegistry
import typings.angularCompilerCli.metadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.metadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.ngtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.scopeSrcApiMod.ComponentScope
import typings.angularCompilerCli.scopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.scopeSrcApiMod.LocalModuleScope
import typings.angularCompilerCli.scopeSrcApiMod.RemoteScope
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/local", "LocalModuleScopeRegistry")
  @js.native
  open class LocalModuleScopeRegistry protected ()
    extends StObject
       with MetadataRegistry
       with ComponentScopeReader {
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
    
    /* private */ var aliasingHost: Any = js.native
    
    /* private */ var assertCollecting: Any = js.native
    
    /**
      * A cache of calculated `LocalModuleScope`s for each NgModule declared in the current program.
      
      */
    /* private */ var cache: Any = js.native
    
    /**
      * A map of components from the current compilation unit to the NgModule which declared them.
      *
      * As components and directives are not distinguished at the NgModule level, this map may also
      * contain directives. This doesn't cause any problems but isn't useful as there is no concept of
      * a directive's compilation scope.
      */
    /* private */ var declarationToModule: Any = js.native
    
    /* private */ var dependencyScopeReader: Any = js.native
    
    /**
      * This maps from the directive/pipe class to a map of data for each NgModule that declares the
      * directive/pipe. This data is needed to produce an error for the given class.
      */
    /* private */ var duplicateDeclarations: Any = js.native
    
    /* private */ var fullReader: Any = js.native
    
    /**
      * Retrieves any `ts.Diagnostic`s produced during the calculation of the `LocalModuleScope` for
      * the given NgModule, or `null` if no errors were present.
      */
    def getDiagnosticsOfModule(clazz: ClassDeclaration[DeclarationNode]): js.Array[Diagnostic] | Null = js.native
    
    /**
      * If `node` is declared in more than one NgModule (duplicate declaration), then get the
      * `DeclarationData` for each offending declaration.
      *
      * Ordinarily a class is only declared in one NgModule, in which case this function returns
      * `null`.
      */
    def getDuplicateDeclarations(node: ClassDeclaration[DeclarationNode]): js.Array[DeclarationData] | Null = js.native
    
    /**
      * Look up the `ExportScope` of a given `Reference` to an NgModule.
      *
      * The NgModule in question may be declared locally in the current ts.Program, or it may be
      * declared in a .d.ts file.
      *
      * @returns `null` if no scope could be found, or `'invalid'` if the `Reference` is not a valid
      *     NgModule.
      *
      * May also contribute diagnostics of its own by adding to the given `diagnostics`
      * array parameter.
      */
    /* private */ var getExportedScope: Any = js.native
    
    /* private */ var getReexports: Any = js.native
    
    /**
      * Get the `RemoteScope` required for this component, if any.
      *
      * If the component requires remote scoping, then retrieve the directives/pipes registered for
      * that component. If remote scoping is not required (the common case), returns `null`.
      */
    /* CompleteClass */
    override def getRemoteScope(clazz: ClassDeclaration[DeclarationNode]): RemoteScope | Null = js.native
    
    /* CompleteClass */
    override def getScopeForComponent(clazz: ClassDeclaration[DeclarationNode]): ComponentScope | Null = js.native
    
    /**
      * Collects registered data for a module and its directives/pipes and convert it into a full
      * `LocalModuleScope`.
      *
      * This method implements the logic of NgModule imports and exports. It returns the
      * `LocalModuleScope` for the given NgModule if one can be produced, `null` if no scope was ever
      * defined, or the string `'error'` if the scope contained errors.
      */
    def getScopeOfModule(clazz: ClassDeclaration[DeclarationNode]): LocalModuleScope | Null = js.native
    
    /**
      * Implementation of `getScopeOfModule` which accepts a reference to a class.
      */
    /* private */ var getScopeOfModuleReference: Any = js.native
    
    /* private */ var localReader: Any = js.native
    
    /* private */ var moduleToRef: Any = js.native
    
    /**
      * Tracks which NgModules have directives/pipes that are declared in more than one module.
      */
    /* private */ var modulesWithStructuralErrors: Any = js.native
    
    /* private */ var refEmitter: Any = js.native
    
    /* private */ var registerDeclarationOfModule: Any = js.native
    
    /* CompleteClass */
    override def registerDirectiveMetadata(meta: DirectiveMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerNgModuleMetadata(meta: NgModuleMeta): Unit = js.native
    
    /* CompleteClass */
    override def registerPipeMetadata(meta: PipeMeta): Unit = js.native
    
    /**
      * Tracks the `RemoteScope` for components requiring "remote scoping".
      *
      * Remote scoping is when the set of directives which apply to a given component is set in the
      * NgModule's file instead of directly on the component def (which is sometimes needed to get
      * around cyclic import issues). This is not used in calculation of `LocalModuleScope`s, but is
      * tracked here for convenience.
      */
    /* private */ var remoteScoping: Any = js.native
    
    /**
      * Tracks errors accumulated in the processing of scopes for each module declaration.
      */
    /* private */ var scopeErrors: Any = js.native
    
    /**
      * Tracks whether the registry has been asked to produce scopes for a module or component. Once
      * this is true, the registry cannot accept registrations of new directives/pipes/modules as it
      * would invalidate the cached scope data.
      */
    /* private */ var `sealed`: Any = js.native
    
    /**
      * Set a component as requiring remote scoping, with the given directives and pipes to be
      * registered remotely.
      */
    def setComponentRemoteScope(
      node: ClassDeclaration[DeclarationNode],
      directives: js.Array[Reference[Node]],
      pipes: js.Array[Reference[Node]]
    ): Unit = js.native
  }
  
  trait DeclarationData extends StObject {
    
    var ngModule: ClassDeclaration[DeclarationNode]
    
    var rawDeclarations: Expression | Null
    
    var ref: Reference[Node]
  }
  object DeclarationData {
    
    inline def apply(ngModule: ClassDeclaration[DeclarationNode], ref: Reference[Node]): DeclarationData = {
      val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rawDeclarations = null)
      __obj.asInstanceOf[DeclarationData]
    }
    
    extension [Self <: DeclarationData](x: Self) {
      
      inline def setNgModule(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
      
      inline def setRawDeclarations(value: Expression): Self = StObject.set(x, "rawDeclarations", value.asInstanceOf[js.Any])
      
      inline def setRawDeclarationsNull: Self = StObject.set(x, "rawDeclarations", null)
      
      inline def setRef(value: Reference[Node]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalNgModuleData extends StObject {
    
    var declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    
    var imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
  }
  object LocalNgModuleData {
    
    inline def apply(
      declarations: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      exports: js.Array[Reference[ClassDeclaration[DeclarationNode]]],
      imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
    ): LocalNgModuleData = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalNgModuleData]
    }
    
    extension [Self <: LocalNgModuleData](x: Self) {
      
      inline def setDeclarations(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setExports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "exports", js.Array(value*))
      
      inline def setImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "imports", js.Array(value*))
    }
  }
}

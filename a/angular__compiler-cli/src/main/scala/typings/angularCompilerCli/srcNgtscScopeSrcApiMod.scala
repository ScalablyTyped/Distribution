package typings.angularCompilerCli

import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.NgModuleMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.PipeMeta
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.NgModule
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.Standalone
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcApiMod {
  
  @js.native
  sealed trait ComponentScopeKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/api", "ComponentScopeKind")
  @js.native
  object ComponentScopeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComponentScopeKind & Double] = js.native
    
    @js.native
    sealed trait NgModule
      extends StObject
         with ComponentScopeKind
    /* 0 */ val NgModule: typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.NgModule & Double = js.native
    
    @js.native
    sealed trait Standalone
      extends StObject
         with ComponentScopeKind
    /* 1 */ val Standalone: typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeKind.Standalone & Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.srcNgtscScopeSrcApiMod.LocalModuleScope
    - typings.angularCompilerCli.srcNgtscScopeSrcApiMod.StandaloneScope
  */
  trait ComponentScope extends StObject
  object ComponentScope {
    
    inline def LocalModuleScope(
      compilation: ScopeData,
      exported: ScopeData,
      kind: NgModule,
      ngModule: ClassDeclaration[DeclarationNode],
      schemas: js.Array[SchemaMetadata]
    ): typings.angularCompilerCli.srcNgtscScopeSrcApiMod.LocalModuleScope = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], reexports = null)
      __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscScopeSrcApiMod.LocalModuleScope]
    }
    
    inline def StandaloneScope(
      component: ClassDeclaration[DeclarationNode],
      dependencies: js.Array[DirectiveMeta | PipeMeta | NgModuleMeta],
      isPoisoned: Boolean,
      kind: Standalone,
      schemas: js.Array[SchemaMetadata]
    ): typings.angularCompilerCli.srcNgtscScopeSrcApiMod.StandaloneScope = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscScopeSrcApiMod.StandaloneScope]
    }
  }
  
  trait ComponentScopeReader extends StObject {
    
    /**
      * Get the `RemoteScope` required for this component, if any.
      *
      * If the component requires remote scoping, then retrieve the directives/pipes registered for
      * that component. If remote scoping is not required (the common case), returns `null`.
      */
    def getRemoteScope(clazz: ClassDeclaration[DeclarationNode]): RemoteScope | Null
    
    def getScopeForComponent(clazz: ClassDeclaration[DeclarationNode]): ComponentScope | Null
  }
  object ComponentScopeReader {
    
    inline def apply(
      getRemoteScope: ClassDeclaration[DeclarationNode] => RemoteScope | Null,
      getScopeForComponent: ClassDeclaration[DeclarationNode] => ComponentScope | Null
    ): ComponentScopeReader = {
      val __obj = js.Dynamic.literal(getRemoteScope = js.Any.fromFunction1(getRemoteScope), getScopeForComponent = js.Any.fromFunction1(getScopeForComponent))
      __obj.asInstanceOf[ComponentScopeReader]
    }
    
    extension [Self <: ComponentScopeReader](x: Self) {
      
      inline def setGetRemoteScope(value: ClassDeclaration[DeclarationNode] => RemoteScope | Null): Self = StObject.set(x, "getRemoteScope", js.Any.fromFunction1(value))
      
      inline def setGetScopeForComponent(value: ClassDeclaration[DeclarationNode] => ComponentScope | Null): Self = StObject.set(x, "getScopeForComponent", js.Any.fromFunction1(value))
    }
  }
  
  trait ExportScope extends StObject {
    
    /**
      * The scope exported by an NgModule, and available for import.
      */
    var exported: ScopeData
  }
  object ExportScope {
    
    inline def apply(exported: ScopeData): ExportScope = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportScope]
    }
    
    extension [Self <: ExportScope](x: Self) {
      
      inline def setExported(value: ScopeData): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalModuleScope
    extends StObject
       with ExportScope
       with ComponentScope {
    
    var compilation: ScopeData
    
    var kind: NgModule
    
    var ngModule: ClassDeclaration[DeclarationNode]
    
    var reexports: js.Array[Reexport] | Null
    
    var schemas: js.Array[SchemaMetadata]
  }
  object LocalModuleScope {
    
    inline def apply(
      compilation: ScopeData,
      exported: ScopeData,
      kind: NgModule,
      ngModule: ClassDeclaration[DeclarationNode],
      schemas: js.Array[SchemaMetadata]
    ): LocalModuleScope = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], reexports = null)
      __obj.asInstanceOf[LocalModuleScope]
    }
    
    extension [Self <: LocalModuleScope](x: Self) {
      
      inline def setCompilation(value: ScopeData): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setKind(value: NgModule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
      
      inline def setReexports(value: js.Array[Reexport]): Self = StObject.set(x, "reexports", value.asInstanceOf[js.Any])
      
      inline def setReexportsNull: Self = StObject.set(x, "reexports", null)
      
      inline def setReexportsVarargs(value: Reexport*): Self = StObject.set(x, "reexports", js.Array(value*))
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
  
  trait RemoteScope extends StObject {
    
    /**
      * Those directives used by the component that requires this scope to be set remotely.
      */
    var directives: js.Array[Reference[Node]]
    
    /**
      * Those pipes used by the component that requires this scope to be set remotely.
      */
    var pipes: js.Array[Reference[Node]]
  }
  object RemoteScope {
    
    inline def apply(directives: js.Array[Reference[Node]], pipes: js.Array[Reference[Node]]): RemoteScope = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteScope]
    }
    
    extension [Self <: RemoteScope](x: Self) {
      
      inline def setDirectives(value: js.Array[Reference[Node]]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesVarargs(value: Reference[Node]*): Self = StObject.set(x, "directives", js.Array(value*))
      
      inline def setPipes(value: js.Array[Reference[Node]]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      inline def setPipesVarargs(value: Reference[Node]*): Self = StObject.set(x, "pipes", js.Array(value*))
    }
  }
  
  trait ScopeData extends StObject {
    
    var dependencies: js.Array[DirectiveMeta | PipeMeta]
    
    /**
      * Whether some module or component in this scope contains errors and is thus semantically
      * unreliable.
      */
    var isPoisoned: Boolean
  }
  object ScopeData {
    
    inline def apply(dependencies: js.Array[DirectiveMeta | PipeMeta], isPoisoned: Boolean): ScopeData = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeData]
    }
    
    extension [Self <: ScopeData](x: Self) {
      
      inline def setDependencies(value: js.Array[DirectiveMeta | PipeMeta]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: (DirectiveMeta | PipeMeta)*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
    }
  }
  
  trait StandaloneScope
    extends StObject
       with ComponentScope {
    
    var component: ClassDeclaration[DeclarationNode]
    
    var dependencies: js.Array[DirectiveMeta | PipeMeta | NgModuleMeta]
    
    var isPoisoned: Boolean
    
    var kind: Standalone
    
    var schemas: js.Array[SchemaMetadata]
  }
  object StandaloneScope {
    
    inline def apply(
      component: ClassDeclaration[DeclarationNode],
      dependencies: js.Array[DirectiveMeta | PipeMeta | NgModuleMeta],
      isPoisoned: Boolean,
      kind: Standalone,
      schemas: js.Array[SchemaMetadata]
    ): StandaloneScope = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandaloneScope]
    }
    
    extension [Self <: StandaloneScope](x: Self) {
      
      inline def setComponent(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[DirectiveMeta | PipeMeta | NgModuleMeta]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: (DirectiveMeta | PipeMeta | NgModuleMeta)*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Standalone): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
}

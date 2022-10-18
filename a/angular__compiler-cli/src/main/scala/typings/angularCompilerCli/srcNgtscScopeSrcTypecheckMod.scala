package typings.angularCompilerCli

import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.SelectorMatcher
import typings.angularCompilerCli.anon.ClassDeclarationClassDecl
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcTypecheckMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/typecheck", "TypeCheckScopeRegistry")
  @js.native
  open class TypeCheckScopeRegistry protected () extends StObject {
    def this(scopeReader: ComponentScopeReader, metaReader: MetadataReader) = this()
    
    /**
      * Cache of flattened directive metadata. Because flattened metadata is scope-invariant it's
      * cached individually, such that all scopes refer to the same flattened metadata.
      */
    /* private */ var flattenedDirectiveMetaCache: Any = js.native
    
    def getTypeCheckDirectiveMetadata(ref: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta = js.native
    
    /**
      * Computes the type-check scope information for the component declaration. If the NgModule
      * contains an error, then 'error' is returned. If the component is not declared in any NgModule,
      * an empty type-check scope is returned.
      */
    def getTypeCheckScope(node: ClassDeclaration[DeclarationNode]): TypeCheckScope = js.native
    
    /* private */ var metaReader: Any = js.native
    
    /**
      * Cache of the computed type check scope per NgModule declaration.
      */
    /* private */ var scopeCache: Any = js.native
    
    /* private */ var scopeReader: Any = js.native
  }
  
  trait TypeCheckScope extends StObject {
    
    /**
      * All of the directives available in the compilation scope of the declaring NgModule.
      */
    var directives: js.Array[DirectiveMeta]
    
    /**
      * Whether the original compilation scope which produced this `TypeCheckScope` was itself poisoned
      * (contained semantic errors during its production).
      */
    var isPoisoned: Boolean
    
    /**
      * A `SelectorMatcher` instance that contains the flattened directive metadata of all directives
      * that are in the compilation scope of the declaring NgModule.
      */
    var matcher: SelectorMatcher[DirectiveMeta]
    
    /**
      * The pipes that are available in the compilation scope.
      */
    var pipes: Map[String, Reference[ClassDeclarationClassDecl]]
    
    /**
      * The schemas that are used in this scope.
      */
    var schemas: js.Array[SchemaMetadata]
  }
  object TypeCheckScope {
    
    inline def apply(
      directives: js.Array[DirectiveMeta],
      isPoisoned: Boolean,
      matcher: SelectorMatcher[DirectiveMeta],
      pipes: Map[String, Reference[ClassDeclarationClassDecl]],
      schemas: js.Array[SchemaMetadata]
    ): TypeCheckScope = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], isPoisoned = isPoisoned.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeCheckScope]
    }
    
    extension [Self <: TypeCheckScope](x: Self) {
      
      inline def setDirectives(value: js.Array[DirectiveMeta]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesVarargs(value: DirectiveMeta*): Self = StObject.set(x, "directives", js.Array(value*))
      
      inline def setIsPoisoned(value: Boolean): Self = StObject.set(x, "isPoisoned", value.asInstanceOf[js.Any])
      
      inline def setMatcher(value: SelectorMatcher[DirectiveMeta]): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      inline def setPipes(value: Map[String, Reference[ClassDeclarationClassDecl]]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    }
  }
}

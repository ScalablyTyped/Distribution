package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import typings.angularCompiler.injectableCompilerMod.InjectableCompiler
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3ModuleCompilerMod {
  
  @JSImport("@angular/compiler/src/render3/r3_module_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compileInjector(meta: R3InjectorMetadata): R3InjectorDef = ^.asInstanceOf[js.Dynamic].applyDynamic("compileInjector")(meta.asInstanceOf[js.Any]).asInstanceOf[R3InjectorDef]
  
  @scala.inline
  def compileNgModule(meta: R3NgModuleMetadata): R3NgModuleDef = ^.asInstanceOf[js.Dynamic].applyDynamic("compileNgModule")(meta.asInstanceOf[js.Any]).asInstanceOf[R3NgModuleDef]
  
  @scala.inline
  def compileNgModuleFromRender2(ctx: OutputContext, ngModule: CompileShallowModuleMetadata, injectableCompiler: InjectableCompiler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compileNgModuleFromRender2")(ctx.asInstanceOf[js.Any], ngModule.asInstanceOf[js.Any], injectableCompiler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait R3InjectorDef extends StObject {
    
    var expression: Expression
    
    var statements: js.Array[Statement]
    
    var `type`: Type
  }
  object R3InjectorDef {
    
    @scala.inline
    def apply(expression: Expression, statements: js.Array[Statement], `type`: Type): R3InjectorDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3InjectorDef]
    }
    
    @scala.inline
    implicit class R3InjectorDefMutableBuilder[Self <: R3InjectorDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3InjectorMetadata extends StObject {
    
    var deps: js.Array[R3DependencyMetadata] | Null
    
    var imports: js.Array[Expression]
    
    var internalType: Expression
    
    var name: String
    
    var providers: Expression | Null
    
    var `type`: R3Reference
  }
  object R3InjectorMetadata {
    
    @scala.inline
    def apply(imports: js.Array[Expression], internalType: Expression, name: String, `type`: R3Reference): R3InjectorMetadata = {
      val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], deps = null, providers = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3InjectorMetadata]
    }
    
    @scala.inline
    implicit class R3InjectorMetadataMutableBuilder[Self <: R3InjectorMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsNull: Self = StObject.set(x, "deps", null)
      
      @scala.inline
      def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setImports(value: js.Array[Expression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsVarargs(value: Expression*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersNull: Self = StObject.set(x, "providers", null)
      
      @scala.inline
      def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3NgModuleDef extends StObject {
    
    var additionalStatements: js.Array[Statement]
    
    var expression: Expression
    
    var `type`: Type
  }
  object R3NgModuleDef {
    
    @scala.inline
    def apply(additionalStatements: js.Array[Statement], expression: Expression, `type`: Type): R3NgModuleDef = {
      val __obj = js.Dynamic.literal(additionalStatements = additionalStatements.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3NgModuleDef]
    }
    
    @scala.inline
    implicit class R3NgModuleDefMutableBuilder[Self <: R3NgModuleDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalStatements(value: js.Array[Statement]): Self = StObject.set(x, "additionalStatements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalStatementsVarargs(value: Statement*): Self = StObject.set(x, "additionalStatements", js.Array(value :_*))
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3NgModuleMetadata extends StObject {
    
    /**
      * An expression intended for use by statements that are adjacent (i.e. tightly coupled) to but
      * not internal to a class definition.
      *
      * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
      * an IIFE structure that uses a different name internally.
      */
    var adjacentType: Expression
    
    /**
      * An array of expressions representing the bootstrap components specified by the module.
      */
    var bootstrap: js.Array[R3Reference]
    
    /**
      * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
      */
    var containsForwardDecls: Boolean
    
    /**
      * An array of expressions representing the directives and pipes declared by the module.
      */
    var declarations: js.Array[R3Reference]
    
    /**
      * Whether to emit the selector scope values (declarations, imports, exports) inline into the
      * module definition, or to generate additional statements which patch them on. Inline emission
      * does not allow components to be tree-shaken, but is useful for JIT mode.
      */
    var emitInline: Boolean
    
    /**
      * An array of expressions representing the exports of the module.
      */
    var exports: js.Array[R3Reference]
    
    /** Unique ID or expression representing the unique ID of an NgModule. */
    var id: Expression | Null
    
    /**
      * An array of expressions representing the imports of the module.
      */
    var imports: js.Array[R3Reference]
    
    /**
      * An expression representing the module type being compiled, intended for use within a class
      * definition itself.
      *
      * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
      * an IIFE structure that uses a different name internally.
      */
    var internalType: Expression
    
    /**
      * The set of schemas that declare elements to be allowed in the NgModule.
      */
    var schemas: js.Array[R3Reference] | Null
    
    /**
      * An expression representing the module type being compiled.
      */
    var `type`: R3Reference
  }
  object R3NgModuleMetadata {
    
    @scala.inline
    def apply(
      adjacentType: Expression,
      bootstrap: js.Array[R3Reference],
      containsForwardDecls: Boolean,
      declarations: js.Array[R3Reference],
      emitInline: Boolean,
      exports: js.Array[R3Reference],
      imports: js.Array[R3Reference],
      internalType: Expression,
      `type`: R3Reference
    ): R3NgModuleMetadata = {
      val __obj = js.Dynamic.literal(adjacentType = adjacentType.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], containsForwardDecls = containsForwardDecls.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], id = null, schemas = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3NgModuleMetadata]
    }
    
    @scala.inline
    implicit class R3NgModuleMetadataMutableBuilder[Self <: R3NgModuleMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjacentType(value: Expression): Self = StObject.set(x, "adjacentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrap(value: js.Array[R3Reference]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapVarargs(value: R3Reference*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
      
      @scala.inline
      def setContainsForwardDecls(value: Boolean): Self = StObject.set(x, "containsForwardDecls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarations(value: js.Array[R3Reference]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationsVarargs(value: R3Reference*): Self = StObject.set(x, "declarations", js.Array(value :_*))
      
      @scala.inline
      def setEmitInline(value: Boolean): Self = StObject.set(x, "emitInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExports(value: js.Array[R3Reference]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportsVarargs(value: R3Reference*): Self = StObject.set(x, "exports", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setImports(value: js.Array[R3Reference]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsVarargs(value: R3Reference*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemas(value: js.Array[R3Reference]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasNull: Self = StObject.set(x, "schemas", null)
      
      @scala.inline
      def setSchemasVarargs(value: R3Reference*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      @scala.inline
      def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

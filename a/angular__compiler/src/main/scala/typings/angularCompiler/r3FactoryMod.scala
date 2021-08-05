package typings.angularCompiler

import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory
import typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function
import typings.angularCompiler.render3UtilMod.R3Reference
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3FactoryMod {
  
  @JSImport("@angular/compiler/src/render3/r3_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait R3FactoryDelegateType extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryDelegateType")
  @js.native
  object R3FactoryDelegateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3FactoryDelegateType & Double] = js.native
    
    @js.native
    sealed trait Class
      extends StObject
         with R3FactoryDelegateType
    /* 0 */ val Class: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class & Double = js.native
    
    @js.native
    sealed trait Factory
      extends StObject
         with R3FactoryDelegateType
    /* 2 */ val Factory: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory & Double = js.native
    
    @js.native
    sealed trait Function
      extends StObject
         with R3FactoryDelegateType
    /* 1 */ val Function: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function & Double = js.native
  }
  
  @js.native
  sealed trait R3FactoryTarget extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryTarget")
  @js.native
  object R3FactoryTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3FactoryTarget & Double] = js.native
    
    @js.native
    sealed trait Component
      extends StObject
         with R3FactoryTarget
    /* 1 */ val Component: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Component & Double = js.native
    
    @js.native
    sealed trait Directive
      extends StObject
         with R3FactoryTarget
    /* 0 */ val Directive: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Directive & Double = js.native
    
    @js.native
    sealed trait Injectable
      extends StObject
         with R3FactoryTarget
    /* 2 */ val Injectable: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Injectable & Double = js.native
    
    @js.native
    sealed trait NgModule
      extends StObject
         with R3FactoryTarget
    /* 4 */ val NgModule: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.NgModule & Double = js.native
    
    @js.native
    sealed trait Pipe
      extends StObject
         with R3FactoryTarget
    /* 3 */ val Pipe: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Pipe & Double = js.native
  }
  
  @js.native
  sealed trait R3ResolvedDependencyType extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3ResolvedDependencyType")
  @js.native
  object R3ResolvedDependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3ResolvedDependencyType & Double] = js.native
    
    /**
      * The dependency is for an attribute.
      *
      * The token expression is a string representing the attribute name.
      */
    @js.native
    sealed trait Attribute
      extends StObject
         with R3ResolvedDependencyType
    /* 1 */ val Attribute: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Attribute & Double = js.native
    
    /**
      * Injecting the `ChangeDetectorRef` token. Needs special handling when injected into a pipe.
      */
    @js.native
    sealed trait ChangeDetectorRef
      extends StObject
         with R3ResolvedDependencyType
    /* 2 */ val ChangeDetectorRef: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.ChangeDetectorRef & Double = js.native
    
    /**
      * An invalid dependency (no token could be determined). An error should be thrown at runtime.
      */
    @js.native
    sealed trait Invalid
      extends StObject
         with R3ResolvedDependencyType
    /* 3 */ val Invalid: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Invalid & Double = js.native
    
    /**
      * A normal token dependency.
      */
    @js.native
    sealed trait Token
      extends StObject
         with R3ResolvedDependencyType
    /* 0 */ val Token: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Token & Double = js.native
  }
  
  inline def compileFactoryFunction(meta: R3FactoryMetadata): R3FactoryFn = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFactoryFunction")(meta.asInstanceOf[js.Any]).asInstanceOf[R3FactoryFn]
  
  inline def dependenciesFromGlobalMetadata(`type`: CompileTypeMetadata, outputCtx: OutputContext, reflector: CompileReflector): js.Array[R3DependencyMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("dependenciesFromGlobalMetadata")(`type`.asInstanceOf[js.Any], outputCtx.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[js.Array[R3DependencyMetadata]]
  
  trait R3ConstructorFactoryMetadata
    extends StObject
       with R3FactoryMetadata {
    
    /**
      * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
      * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
      * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
      * be inherited from `fnOrClass` which is interpreted as the current type. If this is `'invalid'`,
      * then one or more of the parameters wasn't resolvable and any attempt to use these deps will
      * result in a runtime error.
      */
    var deps: js.Array[R3DependencyMetadata] | invalid | Null
    
    /**
      * An expression for the function which will be used to inject dependencies. The API of this
      * function could be different, and other options control how it will be invoked.
      */
    var injectFn: ExternalReference
    
    /**
      * An expression representing the constructor type, intended for use within a class definition
      * itself.
      *
      * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
      * an IIFE structure that uses a different name internally.
      */
    var internalType: Expression
    
    /**
      * String name of the type being generated (used to name the factory function).
      */
    var name: String
    
    /**
      * Type of the target being created by the factory.
      */
    var target: R3FactoryTarget
    
    /**
      * An expression representing the interface type being constructed.
      */
    var `type`: R3Reference
    
    /** Number of arguments for the `type`. */
    var typeArgumentCount: Double
  }
  object R3ConstructorFactoryMetadata {
    
    inline def apply(
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3ConstructorFactoryMetadata = {
      val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ConstructorFactoryMetadata]
    }
    
    extension [Self <: R3ConstructorFactoryMetadata](x: Self) {
      
      inline def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsNull: Self = StObject.set(x, "deps", null)
      
      inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      inline def setInjectFn(value: ExternalReference): Self = StObject.set(x, "injectFn", value.asInstanceOf[js.Any])
      
      inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: R3FactoryTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFactoryMetadata
    extends StObject
       with R3ConstructorFactoryMetadata {
    
    var delegate: Expression
    
    var delegateType: Factory
  }
  object R3DelegatedFactoryMetadata {
    
    inline def apply(
      delegate: Expression,
      delegateType: Factory,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3DelegatedFactoryMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DelegatedFactoryMetadata]
    }
    
    extension [Self <: R3DelegatedFactoryMetadata](x: Self) {
      
      inline def setDelegate(value: Expression): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateType(value: Factory): Self = StObject.set(x, "delegateType", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3DelegatedFnOrClassMetadata
    extends StObject
       with R3ConstructorFactoryMetadata {
    
    var delegate: Expression
    
    var delegateDeps: js.Array[R3DependencyMetadata]
    
    var delegateType: Class | Function
  }
  object R3DelegatedFnOrClassMetadata {
    
    inline def apply(
      delegate: Expression,
      delegateDeps: js.Array[R3DependencyMetadata],
      delegateType: Class | Function,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3DelegatedFnOrClassMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
    }
    
    extension [Self <: R3DelegatedFnOrClassMetadata](x: Self) {
      
      inline def setDelegate(value: Expression): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "delegateDeps", value.asInstanceOf[js.Any])
      
      inline def setDelegateDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "delegateDeps", js.Array(value :_*))
      
      inline def setDelegateType(value: Class | Function): Self = StObject.set(x, "delegateType", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3DependencyMetadata extends StObject {
    
    /**
      * If an @Attribute decorator is present, this is the literal type of the attribute name, or
      * the unknown type if no literal type is available (e.g. the attribute name is an expression).
      * Will be null otherwise.
      */
    var attribute: Expression | Null
    
    /**
      * Whether the dependency has an @Host qualifier.
      */
    var host: Boolean
    
    /**
      * Whether the dependency has an @Optional qualifier.
      */
    var optional: Boolean
    
    /**
      * An enum indicating whether this dependency has special meaning to Angular and needs to be
      * injected specially.
      */
    var resolved: R3ResolvedDependencyType
    
    /**
      * Whether the dependency has an @Self qualifier.
      */
    var self: Boolean
    
    /**
      * Whether the dependency has an @SkipSelf qualifier.
      */
    var skipSelf: Boolean
    
    /**
      * An expression representing the token or value to be injected.
      */
    var token: Expression
  }
  object R3DependencyMetadata {
    
    inline def apply(
      host: Boolean,
      optional: Boolean,
      resolved: R3ResolvedDependencyType,
      self: Boolean,
      skipSelf: Boolean,
      token: Expression
    ): R3DependencyMetadata = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], attribute = null)
      __obj.asInstanceOf[R3DependencyMetadata]
    }
    
    extension [Self <: R3DependencyMetadata](x: Self) {
      
      inline def setAttribute(value: Expression): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
      
      inline def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: R3ResolvedDependencyType): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Expression): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ trait R3ExpressionFactoryMetadata
    extends StObject
       with R3ConstructorFactoryMetadata {
    
    var expression: Expression
  }
  object R3ExpressionFactoryMetadata {
    
    inline def apply(
      expression: Expression,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3ExpressionFactoryMetadata = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ExpressionFactoryMetadata]
    }
    
    extension [Self <: R3ExpressionFactoryMetadata](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3FactoryFn extends StObject {
    
    var factory: Expression
    
    var statements: js.Array[Statement]
    
    var `type`: ExpressionType_
  }
  object R3FactoryFn {
    
    inline def apply(factory: Expression, statements: js.Array[Statement], `type`: ExpressionType_): R3FactoryFn = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3FactoryFn]
    }
    
    extension [Self <: R3FactoryFn](x: Self) {
      
      inline def setFactory(value: Expression): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      inline def setType(value: ExpressionType_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata
    - typings.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata
    - typings.angularCompiler.r3FactoryMod.R3DelegatedFnOrClassMetadata
    - typings.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata
  */
  trait R3FactoryMetadata extends StObject
  object R3FactoryMetadata {
    
    inline def R3ConstructorFactoryMetadata(
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata = {
      val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata]
    }
    
    inline def R3DelegatedFactoryMetadata(
      delegate: Expression,
      delegateType: Factory,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata]
    }
    
    inline def R3DelegatedFnOrClassMetadata(
      delegate: Expression,
      delegateDeps: js.Array[R3DependencyMetadata],
      delegateType: Class | Function,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3DelegatedFnOrClassMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3DelegatedFnOrClassMetadata]
    }
    
    inline def R3ExpressionFactoryMetadata(
      expression: Expression,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], deps = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata]
    }
  }
}

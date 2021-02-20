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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object r3FactoryMod {
  
  @js.native
  sealed trait R3FactoryDelegateType extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryDelegateType")
  @js.native
  object R3FactoryDelegateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3FactoryDelegateType with Double] = js.native
    
    @js.native
    sealed trait Class extends R3FactoryDelegateType
    /* 0 */ val Class: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Class with Double = js.native
    
    @js.native
    sealed trait Factory extends R3FactoryDelegateType
    /* 2 */ val Factory: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Factory with Double = js.native
    
    @js.native
    sealed trait Function extends R3FactoryDelegateType
    /* 1 */ val Function: typings.angularCompiler.r3FactoryMod.R3FactoryDelegateType.Function with Double = js.native
  }
  
  @js.native
  sealed trait R3FactoryTarget extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryTarget")
  @js.native
  object R3FactoryTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3FactoryTarget with Double] = js.native
    
    @js.native
    sealed trait Component extends R3FactoryTarget
    /* 1 */ val Component: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Component with Double = js.native
    
    @js.native
    sealed trait Directive extends R3FactoryTarget
    /* 0 */ val Directive: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Directive with Double = js.native
    
    @js.native
    sealed trait Injectable extends R3FactoryTarget
    /* 2 */ val Injectable: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Injectable with Double = js.native
    
    @js.native
    sealed trait NgModule extends R3FactoryTarget
    /* 4 */ val NgModule: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.NgModule with Double = js.native
    
    @js.native
    sealed trait Pipe extends R3FactoryTarget
    /* 3 */ val Pipe: typings.angularCompiler.r3FactoryMod.R3FactoryTarget.Pipe with Double = js.native
  }
  
  @js.native
  sealed trait R3ResolvedDependencyType extends StObject
  @JSImport("@angular/compiler/src/render3/r3_factory", "R3ResolvedDependencyType")
  @js.native
  object R3ResolvedDependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[R3ResolvedDependencyType with Double] = js.native
    
    /**
      * The dependency is for an attribute.
      *
      * The token expression is a string representing the attribute name.
      */
    @js.native
    sealed trait Attribute extends R3ResolvedDependencyType
    /* 1 */ val Attribute: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Attribute with Double = js.native
    
    /**
      * Injecting the `ChangeDetectorRef` token. Needs special handling when injected into a pipe.
      */
    @js.native
    sealed trait ChangeDetectorRef extends R3ResolvedDependencyType
    /* 2 */ val ChangeDetectorRef: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.ChangeDetectorRef with Double = js.native
    
    /**
      * An invalid dependency (no token could be determined). An error should be thrown at runtime.
      */
    @js.native
    sealed trait Invalid extends R3ResolvedDependencyType
    /* 3 */ val Invalid: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Invalid with Double = js.native
    
    /**
      * A normal token dependency.
      */
    @js.native
    sealed trait Token extends R3ResolvedDependencyType
    /* 0 */ val Token: typings.angularCompiler.r3FactoryMod.R3ResolvedDependencyType.Token with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/r3_factory", "compileFactoryFunction")
  @js.native
  def compileFactoryFunction(meta: R3FactoryMetadata): R3FactoryFn = js.native
  
  @JSImport("@angular/compiler/src/render3/r3_factory", "dependenciesFromGlobalMetadata")
  @js.native
  def dependenciesFromGlobalMetadata(`type`: CompileTypeMetadata, outputCtx: OutputContext, reflector: CompileReflector): js.Array[R3DependencyMetadata] = js.native
  
  @js.native
  trait R3ConstructorFactoryMetadata extends R3FactoryMetadata {
    
    /**
      * Regardless of whether `fnOrClass` is a constructor function or a user-defined factory, it
      * may have 0 or more parameters, which will be injected according to the `R3DependencyMetadata`
      * for those parameters. If this is `null`, then the type's constructor is nonexistent and will
      * be inherited from `fnOrClass` which is interpreted as the current type. If this is `'invalid'`,
      * then one or more of the parameters wasn't resolvable and any attempt to use these deps will
      * result in a runtime error.
      */
    var deps: js.Array[R3DependencyMetadata] | invalid | Null = js.native
    
    /**
      * An expression for the function which will be used to inject dependencies. The API of this
      * function could be different, and other options control how it will be invoked.
      */
    var injectFn: ExternalReference = js.native
    
    /**
      * An expression representing the constructor type, intended for use within a class definition
      * itself.
      *
      * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
      * an IIFE structure that uses a different name internally.
      */
    var internalType: Expression = js.native
    
    /**
      * String name of the type being generated (used to name the factory function).
      */
    var name: String = js.native
    
    /**
      * Type of the target being created by the factory.
      */
    var target: R3FactoryTarget = js.native
    
    /**
      * An expression representing the interface type being constructed.
      */
    var `type`: R3Reference = js.native
    
    /** Number of arguments for the `type`. */
    var typeArgumentCount: Double = js.native
  }
  object R3ConstructorFactoryMetadata {
    
    @scala.inline
    def apply(
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3ConstructorFactoryMetadata = {
      val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ConstructorFactoryMetadata]
    }
    
    @scala.inline
    implicit class R3ConstructorFactoryMetadataMutableBuilder[Self <: R3ConstructorFactoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsNull: Self = StObject.set(x, "deps", null)
      
      @scala.inline
      def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setInjectFn(value: ExternalReference): Self = StObject.set(x, "injectFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: R3FactoryTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
  trait R3DelegatedFactoryMetadata extends R3ConstructorFactoryMetadata {
    
    var delegate: Expression = js.native
    
    var delegateType: Factory = js.native
  }
  object R3DelegatedFactoryMetadata {
    
    @scala.inline
    def apply(
      delegate: Expression,
      delegateType: Factory,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3DelegatedFactoryMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DelegatedFactoryMetadata]
    }
    
    @scala.inline
    implicit class R3DelegatedFactoryMetadataMutableBuilder[Self <: R3DelegatedFactoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelegate(value: Expression): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateType(value: Factory): Self = StObject.set(x, "delegateType", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
  trait R3DelegatedFnOrClassMetadata extends R3ConstructorFactoryMetadata {
    
    var delegate: Expression = js.native
    
    var delegateDeps: js.Array[R3DependencyMetadata] = js.native
    
    var delegateType: Class | Function = js.native
  }
  object R3DelegatedFnOrClassMetadata {
    
    @scala.inline
    def apply(
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
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DelegatedFnOrClassMetadata]
    }
    
    @scala.inline
    implicit class R3DelegatedFnOrClassMetadataMutableBuilder[Self <: R3DelegatedFnOrClassMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelegate(value: Expression): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "delegateDeps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "delegateDeps", js.Array(value :_*))
      
      @scala.inline
      def setDelegateType(value: Class | Function): Self = StObject.set(x, "delegateType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait R3DependencyMetadata extends StObject {
    
    /**
      * If an @Attribute decorator is present, this is the literal type of the attribute name, or
      * the unknown type if no literal type is available (e.g. the attribute name is an expression).
      * Will be null otherwise.
      */
    var attribute: Expression | Null = js.native
    
    /**
      * Whether the dependency has an @Host qualifier.
      */
    var host: Boolean = js.native
    
    /**
      * Whether the dependency has an @Optional qualifier.
      */
    var optional: Boolean = js.native
    
    /**
      * An enum indicating whether this dependency has special meaning to Angular and needs to be
      * injected specially.
      */
    var resolved: R3ResolvedDependencyType = js.native
    
    /**
      * Whether the dependency has an @Self qualifier.
      */
    var self: Boolean = js.native
    
    /**
      * Whether the dependency has an @SkipSelf qualifier.
      */
    var skipSelf: Boolean = js.native
    
    /**
      * An expression representing the token or value to be injected.
      */
    var token: Expression = js.native
  }
  object R3DependencyMetadata {
    
    @scala.inline
    def apply(
      host: Boolean,
      optional: Boolean,
      resolved: R3ResolvedDependencyType,
      self: Boolean,
      skipSelf: Boolean,
      token: Expression
    ): R3DependencyMetadata = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], skipSelf = skipSelf.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3DependencyMetadata]
    }
    
    @scala.inline
    implicit class R3DependencyMetadataMutableBuilder[Self <: R3DependencyMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: Expression): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNull: Self = StObject.set(x, "attribute", null)
      
      @scala.inline
      def setHost(value: Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: R3ResolvedDependencyType): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: Expression): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.r3FactoryMod.R3FactoryMetadata because Already inherited */ @js.native
  trait R3ExpressionFactoryMetadata extends R3ConstructorFactoryMetadata {
    
    var expression: Expression = js.native
  }
  object R3ExpressionFactoryMetadata {
    
    @scala.inline
    def apply(
      expression: Expression,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3ExpressionFactoryMetadata = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3ExpressionFactoryMetadata]
    }
    
    @scala.inline
    implicit class R3ExpressionFactoryMetadataMutableBuilder[Self <: R3ExpressionFactoryMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait R3FactoryFn extends StObject {
    
    var factory: Expression = js.native
    
    var statements: js.Array[Statement] = js.native
    
    var `type`: ExpressionType_ = js.native
  }
  object R3FactoryFn {
    
    @scala.inline
    def apply(factory: Expression, statements: js.Array[Statement], `type`: ExpressionType_): R3FactoryFn = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3FactoryFn]
    }
    
    @scala.inline
    implicit class R3FactoryFnMutableBuilder[Self <: R3FactoryFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactory(value: Expression): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      @scala.inline
      def setType(value: ExpressionType_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def R3ConstructorFactoryMetadata(
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata = {
      val __obj = js.Dynamic.literal(injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3ConstructorFactoryMetadata]
    }
    
    @scala.inline
    def R3DelegatedFactoryMetadata(
      delegate: Expression,
      delegateType: Factory,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata = {
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3DelegatedFactoryMetadata]
    }
    
    @scala.inline
    def R3DelegatedFnOrClassMetadata(
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
      val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], delegateDeps = delegateDeps.asInstanceOf[js.Any], delegateType = delegateType.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3DelegatedFnOrClassMetadata]
    }
    
    @scala.inline
    def R3ExpressionFactoryMetadata(
      expression: Expression,
      injectFn: ExternalReference,
      internalType: Expression,
      name: String,
      target: R3FactoryTarget,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): typings.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], injectFn = injectFn.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompiler.r3FactoryMod.R3ExpressionFactoryMetadata]
    }
  }
}

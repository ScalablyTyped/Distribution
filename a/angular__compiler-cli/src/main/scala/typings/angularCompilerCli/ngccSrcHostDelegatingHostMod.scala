package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.CtorParameter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.FunctionDefinition
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.std.Map
import typings.typescript.mod.Declaration
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcHostDelegatingHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/delegating_host", "DelegatingReflectionHost")
  @js.native
  open class DelegatingReflectionHost protected ()
    extends StObject
       with NgccReflectionHost {
    def this(tsHost: ReflectionHost, ngccHost: NgccReflectionHost) = this()
    
    /**
      * Get a `ts.Identifier` for a given `ClassDeclaration` which can be used to refer to the class
      * from statements that are "adjacent", and conceptually tightly bound, to the class but not
      * actually inside it.
      *
      * Similar to `getInternalNameOfClass()`, this name can differ from `clazz.name` when ngcc runs
      * over ES5 code, since these "adjacent" statements need to exist in the IIFE where the class may
      * have a different name than it does externally.
      */
    /* CompleteClass */
    override def getAdjacentNameOfClass(clazz: ClassDeclaration[DeclarationNode]): Identifier = js.native
    
    /**
      * Get an expression representing the base class (if any) of the given `clazz`.
      *
      * This expression is most commonly an Identifier, but is possible to inherit from a more dynamic
      * expression.
      *
      * @param clazz the class whose base we want to get.
      */
    /* CompleteClass */
    override def getBaseClassExpression(clazz: ClassDeclaration[DeclarationNode]): Expression | Null = js.native
    
    /**
      * Reflect over the constructor of a class and return metadata about its parameters.
      *
      * This method only looks at the constructor of a class directly and not at any inherited
      * constructors.
      *
      * @param clazz a `ClassDeclaration` representing the class over which to reflect.
      *
      * @returns an array of `Parameter` metadata representing the parameters of the constructor, if
      * a constructor exists. If the constructor exists and has 0 parameters, this array will be empty.
      * If the class has no constructor, this method returns `null`.
      */
    /* CompleteClass */
    override def getConstructorParameters(clazz: ClassDeclaration[DeclarationNode]): js.Array[CtorParameter] | Null = js.native
    
    /**
      * Trace an identifier to its declaration, if possible.
      *
      * This method attempts to resolve the declaration of the given identifier, tracing back through
      * imports and re-exports until the original declaration statement is found. A `Declaration`
      * object is returned if the original declaration is found, or `null` is returned otherwise.
      *
      * If the declaration is in a different module, and that module is imported via an absolute path,
      * this method also returns the absolute path of the imported module. For example, if the code is:
      *
      * ```
      * import {RouterModule} from '@angular/core';
      *
      * export const ROUTES = RouterModule.forRoot([...]);
      * ```
      *
      * and if `getDeclarationOfIdentifier` is called on `RouterModule` in the `ROUTES` expression,
      * then it would trace `RouterModule` via its import from `@angular/core`, and note that the
      * definition was imported from `@angular/core` into the application where it was referenced.
      *
      * If the definition is re-exported several times from different absolute module names, only
      * the first one (the one by which the application refers to the module) is returned.
      *
      * This module name is returned in the `viaModule` field of the `Declaration`. If The declaration
      * is relative to the application itself and there was no import through an absolute path, then
      * `viaModule` is `null`.
      *
      * @param id a TypeScript `ts.Identifier` to trace back to a declaration.
      *
      * @returns metadata about the `Declaration` if the original declaration is found, or `null`
      * otherwise.
      */
    /* CompleteClass */
    override def getDeclarationOfIdentifier(id: Identifier): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration] | Null = js.native
    
    /**
      * Examine a declaration (for example, of a class or function) and return metadata about any
      * decorators present on the declaration.
      *
      * @param declaration a TypeScript `ts.Declaration` node representing the class or function over
      * which to reflect. For example, if the intent is to reflect the decorators of a class and the
      * source is in ES6 format, this will be a `ts.ClassDeclaration` node. If the source is in ES5
      * format, this might be a `ts.VariableDeclaration` as classes in ES5 are represented as the
      * result of an IIFE execution.
      *
      * @returns an array of `Decorator` metadata if decorators are present on the declaration, or
      * `null` if either no decorators were present or if the declaration is not of a decoratable type.
      */
    /* CompleteClass */
    override def getDecoratorsOfDeclaration(declaration: DeclarationNode): js.Array[Decorator] | Null = js.native
    
    /**
      * Reflect over a function and return metadata about its parameters and body.
      *
      * Functions in TypeScript and ES5 code have different AST representations, in particular around
      * default values for parameters. A TypeScript function has its default value as the initializer
      * on the parameter declaration, whereas an ES5 function has its default value set in a statement
      * of the form:
      *
      * if (param === void 0) { param = 3; }
      *
      * This method abstracts over these details, and interprets the function declaration and body to
      * extract parameter default values and the "real" body.
      *
      * A current limitation is that this metadata has no representation for shorthand assignment of
      * parameter objects in the function signature.
      *
      * @param fn a TypeScript `ts.Declaration` node representing the function over which to reflect.
      *
      * @returns a `FunctionDefinition` giving metadata about the function definition.
      */
    /* CompleteClass */
    override def getDefinitionOfFunction(fn: Node): FunctionDefinition | Null = js.native
    
    /**
      * Take an exported declaration (maybe a class down-leveled to a variable) and look up the
      * declaration of its type in a separate .d.ts tree.
      *
      * This function is allowed to return `null` if the current compilation unit does not have a
      * separate .d.ts tree. When compiling TypeScript code this is always the case, since .d.ts files
      * are produced only during the emit of such a compilation. When compiling .js code, however,
      * there is frequently a parallel .d.ts tree which this method exposes.
      *
      * Note that the `ts.Declaration` returned from this function may not be from the same
      * `ts.Program` as the input declaration.
      */
    /* CompleteClass */
    override def getDtsDeclaration(declaration: DeclarationNode): Declaration | Null = js.native
    
    /**
      * Collect the declarations exported from a module by name.
      *
      * Iterates over the exports of a module (including re-exports) and returns a map of export
      * name to its `Declaration`. If an exported value is itself re-exported from another module,
      * the `Declaration`'s `viaModule` will reflect that.
      *
      * @param node a TypeScript `ts.Node` representing the module (for example a `ts.SourceFile`) for
      * which to collect exports.
      *
      * @returns a map of `Declaration`s for the module's exports, by name.
      */
    /* CompleteClass */
    override def getExportsOfModule(module: Node): (Map[
        String, 
        typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
      ]) | Null = js.native
    
    /**
      * Get the number of generic type parameters of a given class.
      *
      * @param clazz a `ClassDeclaration` representing the class over which to reflect.
      *
      * @returns the number of type parameters of the class, if known, or `null` if the declaration
      * is not a class or has an unknown number of type parameters.
      */
    /* CompleteClass */
    override def getGenericArityOfClass(clazz: ClassDeclaration[DeclarationNode]): Double | Null = js.native
    
    /**
      * Determine if an identifier was imported from another module and return `Import` metadata
      * describing its origin.
      *
      * @param id a TypeScript `ts.Identifier` to reflect.
      *
      * @returns metadata about the `Import` if the identifier was imported from another module, or
      * `null` if the identifier doesn't resolve to an import but instead is locally defined.
      */
    /* CompleteClass */
    override def getImportOfIdentifier(id: Identifier): Import | Null = js.native
    
    /**
      * Get a `ts.Identifier` for a given `ClassDeclaration` which can be used to refer to the class
      * within its definition (such as in static fields).
      *
      * This can differ from `clazz.name` when ngcc runs over ES5 code, since the class may have a
      * different name within its IIFE wrapper than it does externally.
      */
    /* CompleteClass */
    override def getInternalNameOfClass(clazz: ClassDeclaration[DeclarationNode]): Identifier = js.native
    
    /**
      * Examine a declaration which should be of a class, and return metadata about the members of the
      * class.
      *
      * @param clazz a `ClassDeclaration` representing the class over which to reflect.
      *
      * @returns an array of `ClassMember` metadata representing the members of the class.
      *
      * @throws if `declaration` does not resolve to a class declaration.
      */
    /* CompleteClass */
    override def getMembersOfClass(clazz: ClassDeclaration[DeclarationNode]): js.Array[ClassMember] = js.native
    
    /**
      * Find the assigned value of a variable declaration.
      *
      * Normally this will be the initializer of the declaration, but where the variable is
      * not a `const` we may need to look elsewhere for the variable's value.
      *
      * @param declaration a TypeScript variable declaration, whose value we want.
      * @returns the value of the variable, as a TypeScript expression node, or `undefined`
      * if the value cannot be computed.
      */
    /* CompleteClass */
    override def getVariableValue(declaration: VariableDeclaration): Expression | Null = js.native
    
    /**
      * Determines whether the given declaration, which should be a class, has a base class.
      *
      * @param clazz a `ClassDeclaration` representing the class over which to reflect.
      */
    /* CompleteClass */
    override def hasBaseClass(clazz: ClassDeclaration[DeclarationNode]): Boolean = js.native
    
    /**
      * Check whether the given node actually represents a class.
      */
    /* CompleteClass */
    override def isClass(node: Node): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ClassDeclaration<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DeclarationNode> */ Boolean = js.native
    
    /**
      * Returns `true` if a declaration is exported from the module in which it's defined.
      *
      * Not all mechanisms by which a declaration is exported can be statically detected, especially
      * when processing already compiled JavaScript. A `false` result does not indicate that the
      * declaration is never visible outside its module, only that it was not exported via one of the
      * export mechanisms that the `ReflectionHost` is capable of statically checking.
      */
    /* CompleteClass */
    override def isStaticallyExported(decl: Node): Boolean = js.native
    
    /* private */ var ngccHost: Any = js.native
    
    /* private */ var tsHost: Any = js.native
  }
}

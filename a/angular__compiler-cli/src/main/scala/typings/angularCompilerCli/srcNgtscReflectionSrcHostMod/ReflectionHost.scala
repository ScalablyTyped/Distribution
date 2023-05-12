package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReflectionHost extends StObject {
  
  /**
    * Get an expression representing the base class (if any) of the given `clazz`.
    *
    * This expression is most commonly an Identifier, but is possible to inherit from a more dynamic
    * expression.
    *
    * @param clazz the class whose base we want to get.
    */
  def getBaseClassExpression(clazz: ClassDeclarationDeclarati): Expression | Null
  
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
  def getConstructorParameters(clazz: ClassDeclarationDeclarati): js.Array[CtorParameter] | Null
  
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
  def getDeclarationOfIdentifier(id: Identifier): Declaration[typings.typescript.mod.Declaration] | Null
  
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
  def getDecoratorsOfDeclaration(declaration: DeclarationNode): js.Array[Decorator] | Null
  
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
  def getDefinitionOfFunction(fn: Node): FunctionDefinition | Null
  
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
  def getExportsOfModule(module: Node): (Map[String, Declaration[typings.typescript.mod.Declaration]]) | Null
  
  /**
    * Get the number of generic type parameters of a given class.
    *
    * @param clazz a `ClassDeclaration` representing the class over which to reflect.
    *
    * @returns the number of type parameters of the class, if known, or `null` if the declaration
    * is not a class or has an unknown number of type parameters.
    */
  def getGenericArityOfClass(clazz: ClassDeclarationDeclarati): Double | Null
  
  /**
    * Determine if an identifier was imported from another module and return `Import` metadata
    * describing its origin.
    *
    * @param id a TypeScript `ts.Identifier` to reflect.
    *
    * @returns metadata about the `Import` if the identifier was imported from another module, or
    * `null` if the identifier doesn't resolve to an import but instead is locally defined.
    */
  def getImportOfIdentifier(id: Identifier): Import | Null
  
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
  def getMembersOfClass(clazz: ClassDeclarationDeclarati): js.Array[ClassMember]
  
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
  def getVariableValue(declaration: VariableDeclaration): Expression | Null
  
  /**
    * Determines whether the given declaration, which should be a class, has a base class.
    *
    * @param clazz a `ClassDeclaration` representing the class over which to reflect.
    */
  def hasBaseClass(clazz: ClassDeclarationDeclarati): Boolean
  
  /**
    * Check whether the given node actually represents a class.
    */
  def isClass(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationDeclarati */ Boolean
  
  /**
    * Returns `true` if a declaration is exported from the module in which it's defined.
    *
    * Not all mechanisms by which a declaration is exported can be statically detected, especially
    * when processing already compiled JavaScript. A `false` result does not indicate that the
    * declaration is never visible outside its module, only that it was not exported via one of the
    * export mechanisms that the `ReflectionHost` is capable of statically checking.
    */
  def isStaticallyExported(decl: Node): Boolean
}
object ReflectionHost {
  
  inline def apply(
    getBaseClassExpression: ClassDeclarationDeclarati => Expression | Null,
    getConstructorParameters: ClassDeclarationDeclarati => js.Array[CtorParameter] | Null,
    getDeclarationOfIdentifier: Identifier => Declaration[typings.typescript.mod.Declaration] | Null,
    getDecoratorsOfDeclaration: DeclarationNode => js.Array[Decorator] | Null,
    getDefinitionOfFunction: Node => FunctionDefinition | Null,
    getExportsOfModule: Node => (Map[String, Declaration[typings.typescript.mod.Declaration]]) | Null,
    getGenericArityOfClass: ClassDeclarationDeclarati => Double | Null,
    getImportOfIdentifier: Identifier => Import | Null,
    getMembersOfClass: ClassDeclarationDeclarati => js.Array[ClassMember],
    getVariableValue: VariableDeclaration => Expression | Null,
    hasBaseClass: ClassDeclarationDeclarati => Boolean,
    isClass: Node => /* is @angular/compiler-cli.anon.ClassDeclarationDeclarati */ Boolean,
    isStaticallyExported: Node => Boolean
  ): ReflectionHost = {
    val __obj = js.Dynamic.literal(getBaseClassExpression = js.Any.fromFunction1(getBaseClassExpression), getConstructorParameters = js.Any.fromFunction1(getConstructorParameters), getDeclarationOfIdentifier = js.Any.fromFunction1(getDeclarationOfIdentifier), getDecoratorsOfDeclaration = js.Any.fromFunction1(getDecoratorsOfDeclaration), getDefinitionOfFunction = js.Any.fromFunction1(getDefinitionOfFunction), getExportsOfModule = js.Any.fromFunction1(getExportsOfModule), getGenericArityOfClass = js.Any.fromFunction1(getGenericArityOfClass), getImportOfIdentifier = js.Any.fromFunction1(getImportOfIdentifier), getMembersOfClass = js.Any.fromFunction1(getMembersOfClass), getVariableValue = js.Any.fromFunction1(getVariableValue), hasBaseClass = js.Any.fromFunction1(hasBaseClass), isClass = js.Any.fromFunction1(isClass), isStaticallyExported = js.Any.fromFunction1(isStaticallyExported))
    __obj.asInstanceOf[ReflectionHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReflectionHost] (val x: Self) extends AnyVal {
    
    inline def setGetBaseClassExpression(value: ClassDeclarationDeclarati => Expression | Null): Self = StObject.set(x, "getBaseClassExpression", js.Any.fromFunction1(value))
    
    inline def setGetConstructorParameters(value: ClassDeclarationDeclarati => js.Array[CtorParameter] | Null): Self = StObject.set(x, "getConstructorParameters", js.Any.fromFunction1(value))
    
    inline def setGetDeclarationOfIdentifier(value: Identifier => Declaration[typings.typescript.mod.Declaration] | Null): Self = StObject.set(x, "getDeclarationOfIdentifier", js.Any.fromFunction1(value))
    
    inline def setGetDecoratorsOfDeclaration(value: DeclarationNode => js.Array[Decorator] | Null): Self = StObject.set(x, "getDecoratorsOfDeclaration", js.Any.fromFunction1(value))
    
    inline def setGetDefinitionOfFunction(value: Node => FunctionDefinition | Null): Self = StObject.set(x, "getDefinitionOfFunction", js.Any.fromFunction1(value))
    
    inline def setGetExportsOfModule(value: Node => (Map[String, Declaration[typings.typescript.mod.Declaration]]) | Null): Self = StObject.set(x, "getExportsOfModule", js.Any.fromFunction1(value))
    
    inline def setGetGenericArityOfClass(value: ClassDeclarationDeclarati => Double | Null): Self = StObject.set(x, "getGenericArityOfClass", js.Any.fromFunction1(value))
    
    inline def setGetImportOfIdentifier(value: Identifier => Import | Null): Self = StObject.set(x, "getImportOfIdentifier", js.Any.fromFunction1(value))
    
    inline def setGetMembersOfClass(value: ClassDeclarationDeclarati => js.Array[ClassMember]): Self = StObject.set(x, "getMembersOfClass", js.Any.fromFunction1(value))
    
    inline def setGetVariableValue(value: VariableDeclaration => Expression | Null): Self = StObject.set(x, "getVariableValue", js.Any.fromFunction1(value))
    
    inline def setHasBaseClass(value: ClassDeclarationDeclarati => Boolean): Self = StObject.set(x, "hasBaseClass", js.Any.fromFunction1(value))
    
    inline def setIsClass(value: Node => /* is @angular/compiler-cli.anon.ClassDeclarationDeclarati */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction1(value))
    
    inline def setIsStaticallyExported(value: Node => Boolean): Self = StObject.set(x, "isStaticallyExported", js.Any.fromFunction1(value))
  }
}

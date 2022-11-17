package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDecorators
import typings.angularCompilerCli.anon.Left
import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccClassSymbol
import typings.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngccSrcPackagesBundleProgramMod.BundleProgram
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularCompilerCli.srcNgtscReflectionMod.TypeScriptReflectionHost
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.CtorParameter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.EnumMember
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.FunctionDefinition
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
import typings.std.Map
import typings.std.Set
import typings.typescript.mod.BinaryExpression
import typings.typescript.mod.BindingName
import typings.typescript.mod.CallExpression
import typings.typescript.mod.CatchClause
import typings.typescript.mod.ClassExpression
import typings.typescript.mod.ConciseBody
import typings.typescript.mod.Declaration
import typings.typescript.mod.ElementAccessExpression
import typings.typescript.mod.ExclamationToken
import typings.typescript.mod.Expression
import typings.typescript.mod.ExpressionStatement
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.ModifierLike
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SourceFileLike
import typings.typescript.mod.Statement
import typings.typescript.mod.String
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcHostEsm2015HostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", "CONSTRUCTOR")
  @js.native
  val CONSTRUCTOR: String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", "CONSTRUCTOR_PARAMS")
  @js.native
  val CONSTRUCTOR_PARAMS: String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", "DECORATORS")
  @js.native
  val DECORATORS: String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", "Esm2015ReflectionHost")
  @js.native
  open class Esm2015ReflectionHost protected ()
    extends TypeScriptReflectionHost
       with NgccReflectionHost {
    def this(logger: Logger, isCore: Boolean, src: BundleProgram) = this()
    def this(logger: Logger, isCore: Boolean, src: BundleProgram, dts: BundleProgram) = this()
    
    /**
      * This is the main entry-point for obtaining information on the decorators of a given class. This
      * information is computed either from static properties if present, or using `tslib.__decorate`
      * helper calls otherwise. The computed result is cached per class.
      *
      * @param classSymbol the class for which decorators should be acquired.
      * @returns all information of the decorators on the class.
      */
    /* protected */ def acquireDecoratorInfo(classSymbol: NgccClassSymbol): DecoratorInfo = js.native
    
    /**
      * Extract all the "classes" from the `statement` and add them to the `classes` map.
      */
    /* protected */ def addClassSymbolsFromStatement(classes: Map[Symbol, NgccClassSymbol], statement: Statement): Unit = js.native
    
    /**
      * In ES2015, class declarations may have been down-leveled into variable declarations,
      * initialized using a class expression. In certain scenarios, an additional variable
      * is introduced that represents the class so that results in code such as:
      *
      * ```
      * let MyClass_1; let MyClass = MyClass_1 = class MyClass {};
      * ```
      *
      * This map tracks those aliased variables to their original identifier, i.e. the key
      * corresponds with the declaration of `MyClass_1` and its value becomes the `MyClass` identifier
      * of the variable declaration.
      *
      * This map is populated during the preprocessing of each source file.
      */
    /* protected */ var aliasedClassDeclarations: Map[DeclarationNode, Identifier] = js.native
    
    /**
      * Collect mappings between names of exported declarations in a file and its actual declaration.
      *
      * Any new mappings are added to the `dtsDeclarationMap`.
      */
    /* protected */ def collectDtsExportedDeclarations(dtsDeclarationMap: Map[java.lang.String, Declaration], srcFile: SourceFile, checker: TypeChecker): Unit = js.native
    
    /* protected */ def collectSrcExportedDeclarations(
      declarationMap: Map[DeclarationNode, Declaration],
      dtsDeclarationMap: Map[java.lang.String, Declaration],
      srcFile: SourceFile
    ): Unit = js.native
    
    /**
      * For a given class symbol, collects all decorator information from tslib helper methods, as
      * generated by TypeScript into emitted JavaScript files.
      *
      * Class decorators are extracted from calls to `tslib.__decorate` that look as follows:
      *
      * ```
      * let SomeDirective = class SomeDirective {}
      * SomeDirective = __decorate([
      *   Directive({ selector: '[someDirective]' }),
      * ], SomeDirective);
      * ```
      *
      * The extraction of member decorators is similar, with the distinction that its 2nd and 3rd
      * argument correspond with a "prototype" target and the name of the member to which the
      * decorators apply.
      *
      * ```
      * __decorate([
      *     Input(),
      *     __metadata("design:type", String)
      * ], SomeDirective.prototype, "input1", void 0);
      * ```
      *
      * @param classSymbol The class symbol for which decorators should be extracted.
      * @returns All information on the decorators of the class.
      */
    /* protected */ def computeDecoratorInfoFromHelperCalls(classSymbol: NgccClassSymbol): DecoratorInfo = js.native
    
    /**
      * Attempts to compute decorator information from static properties "decorators", "propDecorators"
      * and "ctorParameters" on the class. If neither of these static properties is present the
      * library is likely not compiled using tsickle for usage with Closure compiler, in which case
      * `null` is returned.
      *
      * @param classSymbol The class symbol to compute the decorators information for.
      * @returns All information on the decorators as extracted from static properties, or `null` if
      * none of the static properties exist.
      */
    /* protected */ def computeDecoratorInfoFromStaticProperties(classSymbol: NgccClassSymbol): ClassDecorators = js.native
    
    /**
      * Create a mapping between the "private" exports in a src program and the "private" exports of a
      * dts program. These exports may be exported from individual files in the src or dts programs,
      * but not exported from the root file (i.e publicly from the entry-point).
      *
      * This mapping is a "best guess" since we cannot guarantee that two declarations that happen to
      * be exported from a file with the same name are actually equivalent. But this is a reasonable
      * estimate for the purposes of ngcc.
      *
      * @param src the program bundle containing the source files.
      * @param dts the program bundle containing the typings files.
      * @returns a map of source declarations to typings declarations.
      */
    /* protected */ def computePrivateDtsDeclarationMap(src: BundleProgram, dts: BundleProgram): Map[DeclarationNode, Declaration] = js.native
    
    /**
      * Create a mapping between the public exports in a src program and the public exports of a dts
      * program.
      *
      * @param src the program bundle containing the source files.
      * @param dts the program bundle containing the typings files.
      * @returns a map of source declarations to typings declarations.
      */
    /* protected */ def computePublicDtsDeclarationMap(src: BundleProgram, dts: BundleProgram): Map[DeclarationNode, Declaration] = js.native
    
    /**
      * Creates an `NgccClassSymbol` from an outer and inner declaration. If a class only has an outer
      * declaration, the "implementation" symbol of the created `NgccClassSymbol` will be set equal to
      * the "declaration" symbol.
      *
      * @param outerDeclaration The outer declaration node of the class.
      * @param innerDeclaration The inner declaration node of the class, or undefined if no inner
      * declaration is present.
      * @returns the `NgccClassSymbol` representing the class, or undefined if a `ts.Symbol` for any of
      * the declarations could not be resolved.
      */
    /* protected */ def createClassSymbol(outerDeclaration: Identifier): js.UndefOr[NgccClassSymbol] = js.native
    /* protected */ def createClassSymbol(outerDeclaration: Identifier, innerDeclaration: Node): js.UndefOr[NgccClassSymbol] = js.native
    
    /**
      * Caches the information of the decorators on a class, as the work involved with extracting
      * decorators is complex and frequently used.
      *
      * This map is lazily populated during the first call to `acquireDecoratorInfo` for a given class.
      */
    /* protected */ var decoratorCache: Map[ClassDeclaration[DeclarationNode], DecoratorInfo] = js.native
    
    /* protected */ var dts: BundleProgram | Null = js.native
    
    /**
      * Ensures that the source file that `node` is part of has been preprocessed.
      *
      * During preprocessing, all statements in the source file will be visited such that certain
      * processing steps can be done up-front and cached for subsequent usages.
      *
      * @param sourceFile The source file that needs to have gone through preprocessing.
      */
    /* protected */ def ensurePreprocessed(sourceFile: SourceFile): Unit = js.native
    
    /* protected */ def findDecoratedVariableValue(node: Unit, symbol: Symbol): CallExpression | Null = js.native
    /**
      * Walk the AST looking for an assignment to the specified symbol.
      * @param node The current node we are searching.
      * @returns an expression that represents the value of the variable, or undefined if none can be
      * found.
      */
    /* protected */ def findDecoratedVariableValue(node: Node, symbol: Symbol): CallExpression | Null = js.native
    
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
    
    /* private */ var getAdjacentNameOfClassSymbol: Any = js.native
    
    /* private */ var getAdjacentSymbol: Any = js.native
    
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
      * Get all class decorators for the given class, where the decorators are declared
      * via a static property. For example:
      *
      * ```
      * class SomeDirective {}
      * SomeDirective.decorators = [
      *   { type: Directive, args: [{ selector: '[someDirective]' },] }
      * ];
      * ```
      *
      * @param decoratorsSymbol the property containing the decorators we want to get.
      * @returns an array of decorators or null if none where found.
      */
    /* protected */ def getClassDecoratorsFromStaticProperty(decoratorsSymbol: Symbol): js.Array[Decorator] | Null = js.native
    
    /**
      * In ES2015, a class may be declared using a variable declaration of the following structures:
      *
      * ```
      * let MyClass = MyClass_1 = class MyClass {};
      * ```
      *
      * or
      *
      * ```
      * let MyClass = MyClass_1 = (() => { class MyClass {} ... return MyClass; })()
      * ```
      *
      * or
      *
      * ```
      * let MyClass = MyClass_1 = (() => { let MyClass = class MyClass {}; ... return MyClass; })()
      * ```
      *
      * This method extracts the `NgccClassSymbol` for `MyClass` when provided with the
      * `class MyClass {}` declaration node. When the `var MyClass` node or any other node is given,
      * this method will return undefined instead.
      *
      * @param declaration the declaration whose symbol we are finding.
      * @returns the symbol for the node or `undefined` if it does not represent an inner declaration
      * of a class.
      */
    /* protected */ def getClassSymbolFromInnerDeclaration(declaration: Node): js.UndefOr[NgccClassSymbol] = js.native
    
    /**
      * A class may be declared as a top level class declaration:
      *
      * ```
      * class OuterClass { ... }
      * ```
      *
      * or in a variable declaration to a class expression:
      *
      * ```
      * var OuterClass = ClassAlias = class InnerClass {};
      * ```
      *
      * or in a variable declaration to an IIFE containing a class declaration
      *
      * ```
      * var OuterClass = ClassAlias = (() => {
      *   class InnerClass {}
      *   ...
      *   return InnerClass;
      * })()
      * ```
      *
      * or in a variable declaration to an IIFE containing a function declaration
      *
      * ```
      * var OuterClass = ClassAlias = (() => {
      *   function InnerClass() {}
      *   ...
      *   return InnerClass;
      * })()
      * ```
      *
      * This method returns an `NgccClassSymbol` when provided with one of these cases.
      *
      * @param declaration the declaration whose symbol we are finding.
      * @returns the symbol for the class or `undefined` if `declaration` does not represent an outer
      *     declaration of a class.
      */
    /* protected */ def getClassSymbolFromOuterDeclaration(declaration: Node): js.UndefOr[NgccClassSymbol] = js.native
    
    /**
      * Get the parameter decorators of a class constructor.
      *
      * @param classSymbol the class whose parameter info we want to get.
      * @param parameterNodes the array of TypeScript parameter nodes for this class's constructor.
      * @returns an array of constructor parameter info objects.
      */
    /* protected */ def getConstructorParamInfo(classSymbol: NgccClassSymbol, parameterNodes: js.Array[ParameterDeclaration]): js.Array[CtorParameter] = js.native
    
    /**
      * Find the declarations of the constructor parameters of a class identified by its symbol.
      * @param classSymbol the class whose parameters we want to find.
      * @returns an array of `ts.ParameterDeclaration` objects representing each of the parameters in
      * the class's constructor or null if there is no constructor.
      */
    /* protected */ def getConstructorParameterDeclarations(classSymbol: NgccClassSymbol): js.Array[ParameterDeclaration] | Null = js.native
    
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
    
    /* protected */ def getDeclarationOfExpression(expression: Expression): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration] | Null = js.native
    
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
        java.lang.String, 
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
      * Check the given statement to see if it is a call to any of the specified helper functions or
      * null if not found.
      *
      * Matching statements will look like:  `tslib_1.__decorate(...);`.
      * @param statement the statement that may contain the call.
      * @param helperNames the names of the helper we are looking for.
      * @returns the node that corresponds to the `__decorate(...)` call or null if the statement
      * does not match.
      */
    /* protected */ def getHelperCall(statement: Statement, helperNames: js.Array[java.lang.String]): CallExpression | Null = js.native
    
    /**
      * Search statements related to the given class for calls to the specified helper.
      * @param classSymbol the class whose helper calls we are interested in.
      * @param helperNames the names of the helpers (e.g. `__decorate`) whose calls we are interested
      * in.
      * @returns an array of CallExpression nodes for each matching helper call.
      */
    /* protected */ def getHelperCallsForClass(classSymbol: NgccClassSymbol, helperNames: js.Array[java.lang.String]): js.Array[CallExpression] = js.native
    
    /**
      * Determines where the `expression` is imported from.
      *
      * @param expression the expression to determine the import details for.
      * @returns the `Import` for the expression, or `null` if the expression is not imported or the
      * expression syntax is not supported.
      */
    /* private */ var getImportOfExpression: Any = js.native
    
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
      * Compute the inner declaration node of a "class" from the given `declaration` node.
      *
      * @param declaration a node that is either an inner declaration or an alias of a class.
      */
    /* protected */ def getInnerDeclarationFromAliasOrInner(declaration: Node): Node = js.native
    
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
      * Member decorators may be declared as static properties of the class:
      *
      * ```
      * SomeDirective.propDecorators = {
      *   "ngForOf": [{ type: Input },],
      *   "ngForTrackBy": [{ type: Input },],
      *   "ngForTemplate": [{ type: Input },],
      * };
      * ```
      *
      * @param decoratorsProperty the class whose member decorators we are interested in.
      * @returns a map whose keys are the name of the members and whose values are collections of
      * decorators for the given member.
      */
    /* protected */ def getMemberDecoratorsFromStaticProperty(decoratorsProperty: Symbol): Map[java.lang.String, js.Array[Decorator]] = js.native
    
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
      * Examine a symbol which should be of a class, and return metadata about its members.
      *
      * @param symbol the `ClassSymbol` representing the class over which to reflect.
      * @returns an array of `ClassMember` metadata representing the members of the class.
      */
    /* protected */ def getMembersOfSymbol(symbol: NgccClassSymbol): js.Array[ClassMember] = js.native
    
    /**
      * Get the top level statements for a module.
      *
      * In ES5 and ES2015 this is just the top level statements of the file.
      * @param sourceFile The module whose statements we want.
      * @returns An array of top level statements for the given module.
      */
    /* protected */ def getModuleStatements(sourceFile: SourceFile): js.Array[Statement] = js.native
    
    /* private */ var getNameFromClassSymbolDeclaration: Any = js.native
    
    /**
      * Get the parameter type and decorators for the constructor of a class,
      * where the information is stored on a static property of the class.
      *
      * Note that in ESM2015, the property is defined an array, or by an arrow function that returns
      * an array, of decorator and type information.
      *
      * For example,
      *
      * ```
      * SomeDirective.ctorParameters = () => [
      *   {type: ViewContainerRef},
      *   {type: TemplateRef},
      *   {type: undefined, decorators: [{ type: Inject, args: [INJECTED_TOKEN]}]},
      * ];
      * ```
      *
      * or
      *
      * ```
      * SomeDirective.ctorParameters = [
      *   {type: ViewContainerRef},
      *   {type: TemplateRef},
      *   {type: undefined, decorators: [{type: Inject, args: [INJECTED_TOKEN]}]},
      * ];
      * ```
      *
      * @param paramDecoratorsProperty the property that holds the parameter info we want to get.
      * @returns an array of objects containing the type and decorators for each parameter.
      */
    /* protected */ def getParamInfoFromStaticProperty(paramDecoratorsProperty: Symbol): js.Array[ParamInfo] | Null = js.native
    
    /**
      * Find statements related to the given class that may contain calls to a helper.
      *
      * In ESM2015 code the helper calls are in the top level module, so we have to consider
      * all the statements in the module.
      *
      * @param classSymbol the class whose helper calls we are interested in.
      * @returns an array of statements that may contain helper calls.
      */
    /* protected */ def getStatementsForClass(classSymbol: NgccClassSymbol): js.Array[Statement] = js.native
    
    /**
      * Try to retrieve the symbol of a static property on a class.
      *
      * In some cases, a static property can either be set on the inner (implementation or adjacent)
      * declaration inside the class' IIFE, or it can be set on the outer variable declaration.
      * Therefore, the host checks all places, first looking up the property on the inner symbols, and
      * if the property is not found it will fall back to looking up the property on the outer symbol.
      *
      * @param symbol the class whose property we are interested in.
      * @param propertyName the name of static property.
      * @returns the symbol if it is found or `undefined` if not.
      */
    /* protected */ def getStaticProperty(symbol: NgccClassSymbol, propertyName: String): js.UndefOr[Symbol] = js.native
    
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
    
    /* protected */ var isCore: Boolean = js.native
    
    /**
      * Test whether a decorator was imported from `@angular/core`.
      *
      * Is the decorator:
      * * externally imported from `@angular/core`?
      * * the current hosted program is actually `@angular/core` and
      *   - relatively internally imported; or
      *   - not imported, from the current file.
      *
      * @param decorator the decorator to test.
      */
    /* protected */ def isFromCore(decorator: Decorator): Boolean = js.native
    
    /** Checks if the specified declaration resolves to the known JavaScript global `Object`. */
    /* protected */ def isJavaScriptObjectDeclaration(decl: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]): Boolean = js.native
    
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
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Analyzes the given statement to see if it corresponds with a variable declaration like
      * `let MyClass = MyClass_1 = class MyClass {};`. If so, the declaration of `MyClass_1`
      * is associated with the `MyClass` identifier.
      *
      * @param statement The statement that needs to be preprocessed.
      */
    /* protected */ def preprocessStatement(statement: Statement): Unit = js.native
    
    /**
      * The set of source files that have already been preprocessed.
      */
    /* protected */ var preprocessedSourceFiles: Set[SourceFile] = js.native
    
    /**
      * A mapping from source declarations to typings declarations, which are not publicly exported.
      *
      * This mapping is a best guess between declarations that happen to be exported from their file by
      * the same name in both the source and the dts file. Note that by definition the key and value
      * declarations will not be in the same TS program.
      */
    /* protected */ var privateDtsDeclarationMap: (Map[DeclarationNode, Declaration]) | Null = js.native
    
    /**
      * A mapping from source declarations to typings declarations, which are both publicly exported.
      *
      * There should be one entry for every public export visible from the root file of the source
      * tree. Note that by definition the key and value declarations will not be in the same TS
      * program.
      */
    /* protected */ var publicDtsDeclarationMap: (Map[DeclarationNode, Declaration]) | Null = js.native
    
    /**
      * Extract the details of an entry within a `__decorate` helper call. For example, given the
      * following code:
      *
      * ```
      * __decorate([
      *   Directive({ selector: '[someDirective]' }),
      *   tslib_1.__param(2, Inject(INJECTED_TOKEN)),
      *   tslib_1.__metadata("design:paramtypes", [ViewContainerRef, TemplateRef, String])
      * ], SomeDirective);
      * ```
      *
      * it can be seen that there are calls to regular decorators (the `Directive`) and calls into
      * `tslib` functions which have been inserted by TypeScript. Therefore, this function classifies
      * a call to correspond with
      *   1. a real decorator like `Directive` above, or
      *   2. a decorated parameter, corresponding with `__param` calls from `tslib`, or
      *   3. the type information of parameters, corresponding with `__metadata` call from `tslib`
      *
      * @param expression the expression that needs to be reflected into a `DecorateHelperEntry`
      * @returns an object that indicates which of the three categories the call represents, together
      * with the reflected information of the call, or null if the call is not a valid decorate call.
      */
    /* protected */ def reflectDecorateHelperEntry(expression: Expression): DecorateHelperEntry | Null = js.native
    
    /* protected */ def reflectDecoratorCall(call: CallExpression): Decorator | Null = js.native
    
    /**
      * Reflect over the given array node and extract decorator information from each element.
      *
      * This is used for decorators that are defined in static properties. For example:
      *
      * ```
      * SomeDirective.decorators = [
      *   { type: Directive, args: [{ selector: '[someDirective]' },] }
      * ];
      * ```
      *
      * @param decoratorsArray an expression that contains decorator information.
      * @returns an array of decorator info that was reflected from the array node.
      */
    /* protected */ def reflectDecorators(decoratorsArray: Expression): js.Array[Decorator] = js.native
    
    /**
      * Attempts to extract a single `EnumMember` from a statement in the following syntax:
      *
      *   Enum["MemberA"] = "a";
      *
      * or, for enum member with numeric values:
      *
      *   Enum[Enum["MemberA"] = 0] = "MemberA";
      *
      * @param enumName The identifier of the enum that the members should be set on.
      * @param statement The statement to inspect.
      * @returns An `EnumMember` if the statement is according to the expected syntax, null otherwise.
      */
    /* protected */ def reflectEnumMember(enumName: Identifier, statement: Statement): EnumMember | Null = js.native
    
    /**
      * Attempts to extract all `EnumMember`s from a function that is according to the JavaScript emit
      * format for enums:
      *
      *   function (Enum) {
      *     Enum["MemberA"] = "a";
      *     Enum["MemberB"] = "b";
      *   }
      *
      * @param fn The function expression that is assumed to contain enum members.
      * @returns All enum members if the function is according to the correct syntax, null otherwise.
      */
    /* private */ var reflectEnumMembers: Any = js.native
    
    /**
      * Reflect over a symbol and extract the member information, combining it with the
      * provided decorator information, and whether it is a static member.
      * @param node the declaration node for the member to reflect over.
      * @param kind the assumed kind of the member, may become more accurate during reflection.
      * @param decorators an array of decorators associated with the member.
      * @param isStatic true if this member is static, false if it is an instance property.
      * @returns the reflected member information, or null if the symbol is not a member.
      */
    /* protected */ def reflectMember(node: Declaration): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: Null, decorators: js.Array[Decorator]): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: Null, decorators: js.Array[Decorator], isStatic: Boolean): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: Null, decorators: Unit, isStatic: Boolean): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: ClassMemberKind): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: ClassMemberKind, decorators: js.Array[Decorator]): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: ClassMemberKind, decorators: js.Array[Decorator], isStatic: Boolean): ClassMember | Null = js.native
    /* protected */ def reflectMember(node: Declaration, kind: ClassMemberKind, decorators: Unit, isStatic: Boolean): ClassMember | Null = js.native
    
    /**
      * Reflect over a symbol and extract the member information, combining it with the
      * provided decorator information, and whether it is a static member.
      *
      * A single symbol may represent multiple class members in the case of accessors;
      * an equally named getter/setter accessor pair is combined into a single symbol.
      * When the symbol is recognized as representing an accessor, its declarations are
      * analyzed such that both the setter and getter accessor are returned as separate
      * class members.
      *
      * One difference wrt the TypeScript host is that in ES2015, we cannot see which
      * accessor originally had any decorators applied to them, as decorators are applied
      * to the property descriptor in general, not a specific accessor. If an accessor
      * has both a setter and getter, any decorators are only attached to the setter member.
      *
      * @param symbol the symbol for the member to reflect over.
      * @param decorators an array of decorators associated with the member.
      * @param isStatic true if this member is static, false if it is an instance property.
      * @returns the reflected member information, or null if the symbol is not a member.
      */
    /* protected */ def reflectMembers(symbol: Symbol): js.Array[ClassMember] | Null = js.native
    /* protected */ def reflectMembers(symbol: Symbol, decorators: js.Array[Decorator]): js.Array[ClassMember] | Null = js.native
    /* protected */ def reflectMembers(symbol: Symbol, decorators: js.Array[Decorator], isStatic: Boolean): js.Array[ClassMember] | Null = js.native
    /* protected */ def reflectMembers(symbol: Symbol, decorators: Unit, isStatic: Boolean): js.Array[ClassMember] | Null = js.native
    
    /**
      * Finds the identifier of the actual class declaration for a potentially aliased declaration of a
      * class.
      *
      * If the given declaration is for an alias of a class, this function will determine an identifier
      * to the original declaration that represents this class.
      *
      * @param declaration The declaration to resolve.
      * @returns The original identifier that the given class declaration resolves to, or `undefined`
      * if the declaration does not represent an aliased class.
      */
    /* protected */ def resolveAliasedClassIdentifier(declaration: DeclarationNode): Identifier | Null = js.native
    
    /**
      * In JavaScript, enum declarations are emitted as a regular variable declaration followed by an
      * IIFE in which the enum members are assigned.
      *
      *   export var Enum;
      *   (function (Enum) {
      *     Enum["a"] = "A";
      *     Enum["b"] = "B";
      *   })(Enum || (Enum = {}));
      *
      * @param declaration A variable declaration that may represent an enum
      * @returns An array of enum members if the variable declaration is followed by an IIFE that
      * declares the enum members, or null otherwise.
      */
    /* protected */ def resolveEnumMembers(declaration: VariableDeclaration): js.Array[EnumMember] | Null = js.native
    
    /* protected */ var src: BundleProgram = js.native
    
    /**
      * Compute the `TypeValueReference` for the given `typeExpression`.
      *
      * Although `typeExpression` is a valid `ts.Expression` that could be emitted directly into the
      * generated code, ngcc still needs to resolve the declaration and create an `IMPORTED` type
      * value reference as the compiler has specialized handling for some symbols, for example
      * `ChangeDetectorRef` from `@angular/core`. Such an `IMPORTED` type value reference will result
      * in a newly generated namespace import, instead of emitting the original `typeExpression` as is.
      */
    /* private */ var typeToValue: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/esm2015_host", "PROP_DECORATORS")
  @js.native
  val PROP_DECORATORS: String = js.native
  
  inline def getContainingStatement(node: Node): Statement = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainingStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Statement]
  
  inline def getIifeBody(expression: Expression): js.UndefOr[ConciseBody] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIifeBody")(expression.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ConciseBody]]
  
  inline def getInnerClassDeclaration(expression: Expression): (ClassDeclaration[ClassExpression | typings.typescript.mod.ClassDeclaration | FunctionDeclaration]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerClassDeclaration")(expression.asInstanceOf[js.Any]).asInstanceOf[(ClassDeclaration[ClassExpression | typings.typescript.mod.ClassDeclaration | FunctionDeclaration]) | Null]
  
  inline def getOuterNodeFromInnerDeclaration(node: Node): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterNodeFromInnerDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  
  inline def getPropertyValueFromSymbol(propSymbol: Symbol): js.UndefOr[Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyValueFromSymbol")(propSymbol.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Expression]]
  
  inline def isAssignment(node: Node): /* is typescript.typescript.AssignmentExpression<typescript.typescript.EqualsToken> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssignmentExpression<typescript.typescript.EqualsToken> */ Boolean]
  
  inline def isAssignmentStatement(statement: Statement): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/esm2015_host.AssignmentStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/esm2015_host.AssignmentStatement */ Boolean]
  
  inline def isClassDecorateCall(call: CallExpression, matches: js.Function1[/* identifier */ Identifier, Boolean]): /* is @angular/compiler-cli.anon.CallExpressionargumentsAr */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassDecorateCall")(call.asInstanceOf[js.Any], matches.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/compiler-cli.anon.CallExpressionargumentsAr */ Boolean]
  
  inline def isMemberDecorateCall(call: CallExpression, matches: js.Function1[/* identifier */ Identifier, Boolean]): /* is @angular/compiler-cli.anon.CallExpressionargumentsArArguments */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberDecorateCall")(call.asInstanceOf[js.Any], matches.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/compiler-cli.anon.CallExpressionargumentsArArguments */ Boolean]
  
  inline def skipClassAliases(node: InitializedVariableClassDeclaration): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("skipClassAliases")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  @js.native
  trait AssignmentStatement
    extends StObject
       with ExpressionStatement {
    
    @JSName("expression")
    var expression_AssignmentStatement: Left = js.native
  }
  
  type DecorateHelperEntry = ParameterTypes | ParameterDecorators | DecoratorCall
  
  trait DecoratorCall extends StObject {
    
    var decorator: Decorator
    
    var `type`: "decorator"
  }
  object DecoratorCall {
    
    inline def apply(decorator: Decorator): DecoratorCall = {
      val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("decorator")
      __obj.asInstanceOf[DecoratorCall]
    }
    
    extension [Self <: DecoratorCall](x: Self) {
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setType(value: "decorator"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The recorded decorator information of a single class. This information is cached in the host.
    */
  trait DecoratorInfo extends StObject {
    
    /**
      * All decorators that were present on the class. If no decorators were present, this is `null`
      */
    var classDecorators: js.Array[Decorator] | Null
    
    /**
      * Represents the constructor parameter information, such as the type of a parameter and all
      * decorators for a certain parameter. Indices in this array correspond with the parameter's
      * index in the constructor. Note that this array may be sparse, i.e. certain constructor
      * parameters may not have any info recorded.
      */
    var constructorParamInfo: js.Array[ParamInfo]
    
    /**
      * All decorators per member of the class they were present on.
      */
    var memberDecorators: Map[java.lang.String, js.Array[Decorator]]
  }
  object DecoratorInfo {
    
    inline def apply(
      constructorParamInfo: js.Array[ParamInfo],
      memberDecorators: Map[java.lang.String, js.Array[Decorator]]
    ): DecoratorInfo = {
      val __obj = js.Dynamic.literal(constructorParamInfo = constructorParamInfo.asInstanceOf[js.Any], memberDecorators = memberDecorators.asInstanceOf[js.Any], classDecorators = null)
      __obj.asInstanceOf[DecoratorInfo]
    }
    
    extension [Self <: DecoratorInfo](x: Self) {
      
      inline def setClassDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "classDecorators", value.asInstanceOf[js.Any])
      
      inline def setClassDecoratorsNull: Self = StObject.set(x, "classDecorators", null)
      
      inline def setClassDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "classDecorators", js.Array(value*))
      
      inline def setConstructorParamInfo(value: js.Array[ParamInfo]): Self = StObject.set(x, "constructorParamInfo", value.asInstanceOf[js.Any])
      
      inline def setConstructorParamInfoVarargs(value: ParamInfo*): Self = StObject.set(x, "constructorParamInfo", js.Array(value*))
      
      inline def setMemberDecorators(value: Map[java.lang.String, js.Array[Decorator]]): Self = StObject.set(x, "memberDecorators", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnumMemberAssignment
    extends StObject
       with BinaryExpression {
    
    @JSName("left")
    var left_EnumMemberAssignment: ElementAccessExpression = js.native
  }
  
  /* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection.ClassDeclaration<typescript.typescript.VariableDeclaration> & {  initializer :typescript.typescript.Expression} */
  @js.native
  trait InitializedVariableClassDeclaration extends StObject {
    
    var _declarationBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val exclamationToken: js.UndefOr[ExclamationToken] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): java.lang.String = js.native
    def getFullText(sourceFile: SourceFile): java.lang.String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): java.lang.String = js.native
    def getText(sourceFile: SourceFile): java.lang.String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] & Expression = js.native
    
    val kind: typings.typescript.mod.SyntaxKind.VariableDeclaration = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val name: BindingName & Identifier = js.native
    
    val parent: VariableDeclarationList | CatchClause = js.native
    
    val pos: Double = js.native
    
    val `type`: js.UndefOr[TypeNode] = js.native
  }
  
  trait ParamInfo extends StObject {
    
    var decorators: js.Array[Decorator] | Null
    
    var typeExpression: Expression | Null
  }
  object ParamInfo {
    
    inline def apply(): ParamInfo = {
      val __obj = js.Dynamic.literal(decorators = null, typeExpression = null)
      __obj.asInstanceOf[ParamInfo]
    }
    
    extension [Self <: ParamInfo](x: Self) {
      
      inline def setDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
      
      inline def setDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
      
      inline def setTypeExpression(value: Expression): Self = StObject.set(x, "typeExpression", value.asInstanceOf[js.Any])
      
      inline def setTypeExpressionNull: Self = StObject.set(x, "typeExpression", null)
    }
  }
  
  trait ParameterDecorators extends StObject {
    
    var decorator: Decorator
    
    var index: Double
    
    var `type`: "param:decorators"
  }
  object ParameterDecorators {
    
    inline def apply(decorator: Decorator, index: Double): ParameterDecorators = {
      val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("param:decorators")
      __obj.asInstanceOf[ParameterDecorators]
    }
    
    extension [Self <: ParameterDecorators](x: Self) {
      
      inline def setDecorator(value: Decorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setType(value: "param:decorators"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterTypes extends StObject {
    
    var `type`: "params"
    
    var types: js.Array[Expression]
  }
  object ParameterTypes {
    
    inline def apply(types: js.Array[Expression]): ParameterTypes = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("params")
      __obj.asInstanceOf[ParameterTypes]
    }
    
    extension [Self <: ParameterTypes](x: Self) {
      
      inline def setType(value: "params"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Expression]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Expression*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}

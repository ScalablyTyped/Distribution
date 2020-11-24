package typings.angularCore.undecoratedClassesWithDiTransformMod

import typings.angularCompiler.mod.AotCompiler
import typings.angularCore.undecoratedClassesWithDiUpdateRecorderMod.UpdateRecorder
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/transform", "UndecoratedClassesTransform")
@js.native
class UndecoratedClassesTransform protected () extends js.Object {
  def this(
    typeChecker: TypeChecker,
    compiler: AotCompiler,
    evaluator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialEvaluator */ js.Any,
    getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]
  ) = this()
  
  /**
    * Adds the abstract "@Directive()" decorator to the given class in case there
    * is no existing directive decorator.
    */
  var _addAbstractDirectiveDecorator: js.Any = js.native
  
  /**
    * Adds the abstract "@Injectable()" decorator to the given class in case there
    * is no existing directive decorator.
    */
  var _addInjectableDecorator: js.Any = js.native
  
  /** Adds a comment for adding an explicit constructor to the given class declaration. */
  var _addMissingExplicitConstructorTodo: js.Any = js.native
  
  /**
    * Constructs a TypeScript decorator node from the specified declaration metadata. Returns
    * null if the metadata could not be simplified/resolved.
    */
  var _constructDecoratorFromMetadata: js.Any = js.native
  
  /**
    * Disables that static symbols are resolved through summaries. Summaries
    * cannot be used for decorator analysis as decorators are omitted in summaries.
    */
  var _disableSummaryResolution: js.Any = js.native
  
  var _getStaticSymbolOfIdentifier: js.Any = js.native
  
  var _migrateDecoratedClassWithInheritedCtor: js.Any = js.native
  
  var _migrateDerivedDeclaration: js.Any = js.native
  
  var _migrateDirectiveBaseClass: js.Any = js.native
  
  var _migrateProviderBaseClass: js.Any = js.native
  
  /**
    * Resolves the declaration metadata of a given static symbol. The metadata
    * is determined by resolving metadata for the static symbol.
    */
  var _resolveDeclarationMetadata: js.Any = js.native
  
  var compiler: js.Any = js.native
  
  var compilerHost: js.Any = js.native
  
  /** Set of class declarations which have been decorated with "@Directive". */
  var decoratedDirectives: js.Any = js.native
  
  /** Set of class declarations which have been decorated with "@Injectable" */
  var decoratedProviders: js.Any = js.native
  
  var decoratorRewriter: js.Any = js.native
  
  var evaluator: js.Any = js.native
  
  var getUpdateRecorder: js.Any = js.native
  
  var importManager: js.Any = js.native
  
  var metadataResolver: js.Any = js.native
  
  /**
    * Migrates decorated directives which can potentially inherit a constructor
    * from an undecorated base class. All base classes until the first one
    * with an explicit constructor will be decorated with the abstract "@Directive()"
    * decorator. See case 1 in the migration plan: https://hackmd.io/@alx/S1XKqMZeS
    */
  def migrateDecoratedDirectives(directives: js.Array[ClassDeclaration]): js.Array[TransformFailure] = js.native
  
  /**
    * Migrates decorated providers which can potentially inherit a constructor
    * from an undecorated base class. All base classes until the first one
    * with an explicit constructor will be decorated with the "@Injectable()".
    */
  def migrateDecoratedProviders(providers: js.Array[ClassDeclaration]): js.Array[TransformFailure] = js.native
  
  /**
    * Migrates undecorated directives which were referenced in NgModule declarations.
    * These directives inherit the metadata from a parent base class, but with Ivy
    * these classes need to explicitly have a decorator for locality. The migration
    * determines the inherited decorator and copies it to the undecorated declaration.
    *
    * Note that the migration serializes the metadata for external declarations
    * where the decorator is not part of the source file AST.
    *
    * See case 2 in the migration plan: https://hackmd.io/@alx/S1XKqMZeS
    */
  def migrateUndecoratedDeclarations(directives: js.Array[ClassDeclaration]): js.Array[TransformFailure] = js.native
  
  /**
    * Set of class declarations which have been analyzed and need to specify
    * an explicit constructor.
    */
  var missingExplicitConstructorClasses: js.Any = js.native
  
  var printer: js.Any = js.native
  
  /** Records all changes that were made in the import manager. */
  def recordChanges(): Unit = js.native
  
  var symbolResolver: js.Any = js.native
  
  var typeChecker: js.Any = js.native
}

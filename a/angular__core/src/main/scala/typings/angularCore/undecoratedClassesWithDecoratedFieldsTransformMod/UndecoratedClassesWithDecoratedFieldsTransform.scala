package typings.angularCore.undecoratedClassesWithDecoratedFieldsTransformMod

import typings.angularCore.undecoratedClassesWithDecoratedFieldsUpdateRecorderMod.UpdateRecorder
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-decorated-fields/transform", "UndecoratedClassesWithDecoratedFieldsTransform")
@js.native
class UndecoratedClassesWithDecoratedFieldsTransform protected () extends js.Object {
  def this(typeChecker: TypeChecker, getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
  
  /**
    * Analyzes the given class declaration by determining whether the class
    * is a directive, is an abstract directive, or uses Angular features.
    */
  var _analyzeClassDeclaration: js.Any = js.native
  
  /**
    * Determines the kind of a given class in terms of Angular. The method checks
    * whether the given class has members that indicate the use of Angular features.
    * e.g. lifecycle hooks or decorated members like `@Input` or `@Output` are
    * considered Angular features..
    */
  var _determineClassKind: js.Any = js.native
  
  /**
    * Finds undecorated abstract directives in the specified source files. Also returns
    * a set of undecorated classes which could not be detected as guaranteed abstract
    * directives. Those are ambiguous and could be either Directive, Pipe or service.
    */
  var _findUndecoratedAbstractDirectives: js.Any = js.native
  
  /**
    * Checks whether a given class has been reported as ambiguous in previous
    * migration run. e.g. when build targets are migrated first, and then test
    * targets that have an overlap with build source files, the same class
    * could be detected as ambiguous.
    */
  var _hasBeenReportedAsAmbiguous: js.Any = js.native
  
  /**
    * Checks whether the given decorator resolves to an abstract directive. An directive is
    * considered "abstract" if there is no selector specified.
    */
  var _isAbstractDirective: js.Any = js.native
  
  var getUpdateRecorder: js.Any = js.native
  
  var importManager: js.Any = js.native
  
  /**
    * Migrates the specified source files. The transform adds the abstract `@Directive`
    * decorator to undecorated classes that use Angular features. Class members which
    * are decorated with any Angular decorator, or class members for lifecycle hooks are
    * indicating that a given class uses Angular features. https://hackmd.io/vuQfavzfRG6KUCtU7oK_EA
    */
  def migrate(sourceFiles: js.Array[SourceFile]): js.Array[AnalysisFailure] = js.native
  
  var partialEvaluator: js.Any = js.native
  
  var printer: js.Any = js.native
  
  /** Records all changes that were made in the import manager. */
  def recordChanges(): Unit = js.native
  
  var reflectionHost: js.Any = js.native
  
  var typeChecker: js.Any = js.native
}

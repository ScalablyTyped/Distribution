package typings.angularCore

import typings.angularCore.undecoratedClassesWithDecoratedFieldsUpdateRecorderMod.UpdateRecorder
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-decorated-fields/transform", JSImport.Namespace)
@js.native
object undecoratedClassesWithDecoratedFieldsTransformMod extends js.Object {
  @js.native
  class UndecoratedClassesWithDecoratedFieldsTransform protected () extends js.Object {
    def this(typeChecker: TypeChecker, getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    /**
      * Analyzes the given class declaration by determining whether the class
      * is a directive, is an abstract directive, or uses Angular features.
      */
    var _analyzeClassDeclaration: js.Any = js.native
    /** Finds undecorated abstract directives in the specified source files. */
    var _findUndecoratedAbstractDirectives: js.Any = js.native
    var _hasAngularDecoratedClassMember: js.Any = js.native
    /**
      * Checks whether the given decorator resolves to an abstract directive. An directive is
      * considered "abstract" if there is no selector specified.
      */
    var _isAbstractDirective: js.Any = js.native
    var getUpdateRecorder: js.Any = js.native
    var importManager: js.Any = js.native
    var partialEvaluator: js.Any = js.native
    var printer: js.Any = js.native
    var reflectionHost: js.Any = js.native
    var typeChecker: js.Any = js.native
    /**
      * Migrates the specified source files. The transform adds the abstract `@Directive`
      * decorator to classes that have Angular field decorators but are not decorated.
      * https://hackmd.io/vuQfavzfRG6KUCtU7oK_EA
      */
    def migrate(sourceFiles: js.Array[SourceFile]): Unit = js.native
    /** Records all changes that were made in the import manager. */
    def recordChanges(): Unit = js.native
  }
  
}


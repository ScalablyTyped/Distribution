package typings.angularCore.moduleWithProvidersTransformMod

import typings.angularCore.collectorMod.ResolvedNgModule
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/module-with-providers/transform", "ModuleWithProvidersTransform")
@js.native
class ModuleWithProvidersTransform protected () extends js.Object {
  def this(
    typeChecker: TypeChecker,
    getUpdateRecorder: js.Function1[
        /* sf */ SourceFile, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateRecorder */ _
      ]
  ) = this()
  /** Add a given generic to a type reference node */
  var _addGenericToTypeReference: js.Any = js.native
  /** Evaluate and return the ngModule type from an expression */
  var _getNgModuleTypeOfExpression: js.Any = js.native
  /**
    * Visits a given object literal expression to determine the ngModule type. If the expression
    * cannot be resolved, add a TODO to alert the user.
    */
  var _getTypeOfResolvedValue: js.Any = js.native
  /** Determine the generic type of a suspected ModuleWithProviders return type and add it
    * explicitly */
  var _migrateStaticNgModuleMethod: js.Any = js.native
  var _updateNode: js.Any = js.native
  /**
    * Migrates a given static method if its ModuleWithProviders does not provide
    * a generic type.
    */
  var _updateStaticMethodType: js.Any = js.native
  var getUpdateRecorder: js.Any = js.native
  var partialEvaluator: js.Any = js.native
  var printer: js.Any = js.native
  var typeChecker: js.Any = js.native
  /** Whether the resolved value map represents a ModuleWithProviders object */
  def isModuleWithProvidersType(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValueMap */ js.Any
  ): Boolean = js.native
  /** Migrates a given NgModule by walking through the referenced providers and static methods. */
  def migrateModule(module: ResolvedNgModule): js.Array[AnalysisFailure] = js.native
  /** Migrates a ModuleWithProviders type definition that has no explicit generic type */
  def migrateType(`type`: TypeReferenceNode): js.Array[AnalysisFailure] = js.native
}


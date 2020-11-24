package typings.angularCore

import typings.angularCore.relativeLinkResolutionUpdateRecorderMod.UpdateRecorder
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/relative-link-resolution/transform", JSImport.Namespace)
@js.native
object relativeLinkResolutionTransformMod extends js.Object {
  
  @js.native
  class RelativeLinkResolutionTransform protected () extends js.Object {
    def this(getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    
    var _getMigratedLiteralExpression: js.Any = js.native
    
    var _maybeUpdateLiteral: js.Any = js.native
    
    var _updateCallExpressionWithoutExtraOptions: js.Any = js.native
    
    var _updateNode: js.Any = js.native
    
    var getUpdateRecorder: js.Any = js.native
    
    def migrateObjectLiterals(vars: js.Array[ObjectLiteralExpression]): Unit = js.native
    
    /** Migrate the ExtraOptions#RelativeLinkResolution property assignments. */
    def migrateRouterModuleForRootCalls(calls: js.Array[CallExpression]): Unit = js.native
    
    var printer: js.Any = js.native
  }
}

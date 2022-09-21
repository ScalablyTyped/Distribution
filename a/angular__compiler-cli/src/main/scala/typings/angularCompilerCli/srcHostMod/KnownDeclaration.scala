package typings.angularCompilerCli.srcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownDeclaration extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/reflection/src/host", "KnownDeclaration")
@js.native
object KnownDeclaration extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KnownDeclaration & Double] = js.native
  
  /**
    * Indicates the JavaScript global `Object` class.
    */
  @js.native
  sealed trait JsGlobalObject
    extends StObject
       with KnownDeclaration
  /* 0 */ val JsGlobalObject: typings.angularCompilerCli.srcHostMod.KnownDeclaration.JsGlobalObject & Double = js.native
  
  /**
    * Indicates the `__assign` TypeScript helper function.
    */
  @js.native
  sealed trait TsHelperAssign
    extends StObject
       with KnownDeclaration
  /* 1 */ val TsHelperAssign: typings.angularCompilerCli.srcHostMod.KnownDeclaration.TsHelperAssign & Double = js.native
  
  /**
    * Indicates the `__read` TypeScript helper function.
    */
  @js.native
  sealed trait TsHelperRead
    extends StObject
       with KnownDeclaration
  /* 5 */ val TsHelperRead: typings.angularCompilerCli.srcHostMod.KnownDeclaration.TsHelperRead & Double = js.native
  
  /**
    * Indicates the `__spread` TypeScript helper function.
    */
  @js.native
  sealed trait TsHelperSpread
    extends StObject
       with KnownDeclaration
  /* 2 */ val TsHelperSpread: typings.angularCompilerCli.srcHostMod.KnownDeclaration.TsHelperSpread & Double = js.native
  
  /**
    * Indicates the `__spreadArray` TypeScript helper function.
    */
  @js.native
  sealed trait TsHelperSpreadArray
    extends StObject
       with KnownDeclaration
  /* 4 */ val TsHelperSpreadArray: typings.angularCompilerCli.srcHostMod.KnownDeclaration.TsHelperSpreadArray & Double = js.native
  
  /**
    * Indicates the `__spreadArrays` TypeScript helper function.
    */
  @js.native
  sealed trait TsHelperSpreadArrays
    extends StObject
       with KnownDeclaration
  /* 3 */ val TsHelperSpreadArrays: typings.angularCompilerCli.srcHostMod.KnownDeclaration.TsHelperSpreadArrays & Double = js.native
}

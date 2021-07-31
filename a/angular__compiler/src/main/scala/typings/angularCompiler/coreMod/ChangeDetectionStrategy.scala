package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetectionStrategy extends StObject
@JSImport("@angular/compiler/src/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ChangeDetectionStrategy
  /* 1 */ val Default: typings.angularCompiler.coreMod.ChangeDetectionStrategy.Default & Double = js.native
  
  @js.native
  sealed trait OnPush
    extends StObject
       with ChangeDetectionStrategy
  /* 0 */ val OnPush: typings.angularCompiler.coreMod.ChangeDetectionStrategy.OnPush & Double = js.native
}

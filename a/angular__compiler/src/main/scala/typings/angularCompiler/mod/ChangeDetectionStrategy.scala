package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetectionStrategy extends StObject
@JSImport("@angular/compiler", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ChangeDetectionStrategy
  /* 1 */ val Default: typings.angularCompiler.mod.ChangeDetectionStrategy.Default & Double = js.native
  
  @js.native
  sealed trait OnPush
    extends StObject
       with ChangeDetectionStrategy
  /* 0 */ val OnPush: typings.angularCompiler.mod.ChangeDetectionStrategy.OnPush & Double = js.native
}

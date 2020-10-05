package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetectionStrategy extends js.Object

@JSImport("@angular/compiler/src/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends js.Object {
  @js.native
  sealed trait Default extends ChangeDetectionStrategy
  
  @js.native
  sealed trait OnPush extends ChangeDetectionStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 0 */ @js.native
  object OnPush extends TopLevel[OnPush with Double]
  
}


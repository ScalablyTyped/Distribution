package typings.atAngularCompiler.srcCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Error
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Ignore
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MissingTranslationStrategy extends js.Object

@JSImport("@angular/compiler/src/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  @js.native
  sealed trait Error extends MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore extends MissingTranslationStrategy
  
  @js.native
  sealed trait Warning extends MissingTranslationStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MissingTranslationStrategy with Double] = js.native
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 2 */ @js.native
  object Ignore extends TopLevel[Ignore with Double]
  
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}


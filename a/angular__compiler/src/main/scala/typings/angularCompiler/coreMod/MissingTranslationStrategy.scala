package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MissingTranslationStrategy extends StObject
@JSImport("@angular/compiler/src/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MissingTranslationStrategy with Double] = js.native
  
  @js.native
  sealed trait Error extends MissingTranslationStrategy
  /* 0 */ val Error: typings.angularCompiler.coreMod.MissingTranslationStrategy.Error with Double = js.native
  
  @js.native
  sealed trait Ignore extends MissingTranslationStrategy
  /* 2 */ val Ignore: typings.angularCompiler.coreMod.MissingTranslationStrategy.Ignore with Double = js.native
  
  @js.native
  sealed trait Warning extends MissingTranslationStrategy
  /* 1 */ val Warning: typings.angularCompiler.coreMod.MissingTranslationStrategy.Warning with Double = js.native
}

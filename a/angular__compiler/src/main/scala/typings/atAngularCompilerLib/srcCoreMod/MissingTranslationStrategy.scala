package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MissingTranslationStrategy extends js.Object

@JSImport("@angular/compiler/src/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  @js.native
  sealed trait Error
    extends atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore
    extends atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Warning
    extends atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Ignore: Ignore with scala.Double = js.native
  /* 1 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.MissingTranslationStrategy with scala.Double] = js.native
}


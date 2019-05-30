package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MissingTranslationStrategy extends js.Object

@JSImport("@angular/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  @js.native
  sealed trait Error
    extends atAngularCoreLib.atAngularCoreMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore
    extends atAngularCoreLib.atAngularCoreMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Warning
    extends atAngularCoreLib.atAngularCoreMod.MissingTranslationStrategy
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Ignore: Ignore with scala.Double = js.native
  /* 1 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.MissingTranslationStrategy with scala.Double] = js.native
}


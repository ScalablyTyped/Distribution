package typings
package atAngularCoreLib.srcI18nTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MissingTranslationStrategy extends js.Object

@JSImport("@angular/core/src/i18n/tokens", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  @js.native
  sealed trait Error
    extends atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore
    extends atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy
  
  @js.native
  sealed trait Warning
    extends atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Ignore: Ignore with scala.Double = js.native
  /* 1 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcI18nTokensMod.MissingTranslationStrategy with scala.Double] = js.native
}


package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TranslationWidth extends js.Object

@JSImport("@angular/common/src/i18n/locale_data_api", "TranslationWidth")
@js.native
object TranslationWidth extends js.Object {
  /** 3 characters for `en-US`. For example: 'Sun' */
  @js.native
  sealed trait Abbreviated
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth
  
  /* 1 */ val Abbreviated: Abbreviated with scala.Double = js.native
  /* 0 */ val Narrow: Narrow with scala.Double = js.native
  /* 3 */ val Short: Short with scala.Double = js.native
  /* 2 */ val Wide: Wide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.TranslationWidth with scala.Double
  ] = js.native
}


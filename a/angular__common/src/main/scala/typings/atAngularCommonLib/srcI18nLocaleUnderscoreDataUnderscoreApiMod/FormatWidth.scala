package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatWidth extends js.Object

@JSImport("@angular/common/src/i18n/locale_data_api", "FormatWidth")
@js.native
object FormatWidth extends js.Object {
  /**
    * For `en-US`, `'EEEE, MMMM d, y, h:mm:ss a zzzz'`
    * (Example: `Monday, June 15, 2015 at 9:03:01 AM GMT+01:00`)
    */
  @js.native
  sealed trait Full
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  /**
    * For `en-US`, `'MMMM d, y, h:mm:ss a z'`
    * (Example: `June 15, 2015 at 9:03:01 AM GMT+1`)
    */
  @js.native
  sealed trait Long
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  /**
    * For `en-US`, `'MMM d, y, h:mm:ss a'`
    * (Example: `Jun 15, 2015, 9:03:01 AM`)
    */
  @js.native
  sealed trait Medium
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  /**
    * For `en-US`, 'M/d/yy, h:mm a'`
    * (Example: `6/15/15, 9:03 AM`)
    */
  @js.native
  sealed trait Short
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  /* 3 */ val Full: Full with scala.Double = js.native
  /* 2 */ val Long: Long with scala.Double = js.native
  /* 1 */ val Medium: Medium with scala.Double = js.native
  /* 0 */ val Short: Short with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth with scala.Double
  ] = js.native
}


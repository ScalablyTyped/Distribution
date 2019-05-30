package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TranslationWidth extends js.Object

@JSImport("@angular/common", "TranslationWidth")
@js.native
object TranslationWidth extends js.Object {
  /** 3 characters for `en-US`. For example: 'Sun' */
  @js.native
  sealed trait Abbreviated
    extends atAngularCommonLib.atAngularCommonMod.TranslationWidth
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow
    extends atAngularCommonLib.atAngularCommonMod.TranslationWidth
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short
    extends atAngularCommonLib.atAngularCommonMod.TranslationWidth
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide
    extends atAngularCommonLib.atAngularCommonMod.TranslationWidth
  
  /* 1 */ val Abbreviated: Abbreviated with scala.Double = js.native
  /* 0 */ val Narrow: Narrow with scala.Double = js.native
  /* 3 */ val Short: Short with scala.Double = js.native
  /* 2 */ val Wide: Wide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.TranslationWidth with scala.Double] = js.native
}


package typings.atAngularCommon.atAngularCommonMod

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
  sealed trait Abbreviated extends TranslationWidth
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow extends TranslationWidth
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short extends TranslationWidth
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide extends TranslationWidth
  
  /* 1 */ val Abbreviated: typings.atAngularCommon.atAngularCommonMod.TranslationWidth.Abbreviated with Double = js.native
  /* 0 */ val Narrow: typings.atAngularCommon.atAngularCommonMod.TranslationWidth.Narrow with Double = js.native
  /* 3 */ val Short: typings.atAngularCommon.atAngularCommonMod.TranslationWidth.Short with Double = js.native
  /* 2 */ val Wide: typings.atAngularCommon.atAngularCommonMod.TranslationWidth.Wide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranslationWidth with Double] = js.native
}

